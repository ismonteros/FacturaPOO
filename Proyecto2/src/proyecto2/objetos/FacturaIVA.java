/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

/**
 *
 * @author USER
 */
 public class FacturaIVA extends Factura{
    private double iva;
    private MongoDB mongo;
    private double valorSinIVA; // Variable de instancia para almacenar el valor sin IVA

    public FacturaIVA(String nombre, String direccion, String correo, float numeroTelefono, float numeroTarjeta, float numeroSeguridad, double iva, double valorSinIVA) { // Añade valorSinIVA como parámetro
        super(nombre, direccion, correo, numeroTelefono, numeroTarjeta, numeroSeguridad);
        this.iva = iva;
        this.valorSinIVA = valorSinIVA; // Almacena el valor sin IVA
        this.mongo= new MongoDB("PedidosYE", "Facturas");
    }

   
 @Override
    public double calcularTotal()  { // Cambia la firma del método para no tomar ningún parámetro
        return valorSinIVA + (valorSinIVA * iva);
    }
    
    public void almacenar(String coleccion){
        BasicDBObject document = new BasicDBObject();
        document.put("nombre", this.getNombre());
        document.put("direccion", this.getDireccion());
        document.put("correo", this.getCorreo());
        document.put("numero de telefono", this.getNumeroTelefono());
        document.put("numero de tarjeta", this.getNumeroTarjeta());
        document.put("numero de seguridad", this.getNumeroSeguridad());
        document.put("valor total", calcularTotal()); // Llama a calcularTotal sin pasar ningún parámetro
        mongo.insert(document);
    }

}

