/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

import com.mongodb.BasicDBObject;

/**
 *
 * @author USER
 */
/**se crea una clase con el implemento de descuentos para la factura de este modo se implementa 
 * patrones estructurales Decorador y se crean distintas clases para el metodo 

*/
public class Descuento extends FacturaDecorator {
    private double porcentajeDescuento;
    private MongoDB mongo; // Añade una instancia de MongoDB

    public Descuento(Factura factura, double porcentajeDescuento) {
        super(factura);
        this.porcentajeDescuento = porcentajeDescuento;
        this.mongo = new MongoDB("PedidosYE", "FacturasDescuento"); // Inicializa la instancia de MongoDB
    }

    
    public double calcularTotal1() {
        double total = super.calcularTotal();
        return total - (total * porcentajeDescuento);
    }

    public void almacenar(String coleccion) {
        BasicDBObject document = new BasicDBObject();
        document.put("nombre", this.getNombre());
        document.put("direccion", this.getDireccion());
        document.put("correo", this.getCorreo());
        document.put("numero de telefono", this.getNumeroTelefono());
        document.put("numero de tarjeta", this.getNumeroTarjeta());
        document.put("numero de seguridad", this.getNumeroSeguridad());
        document.put("valor total con descuento", calcularTotal1()); // Llama a calcularTotal sin pasar ningún parámetro
        mongo.insert(document);
    }
    
}
   

    

