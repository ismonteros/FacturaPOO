/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

/**
 *
 * @author USER
 */
public abstract class FacturaDecorator extends Factura{
     protected Factura factura;

    public FacturaDecorator(Factura factura) {
        super(factura.getNombre(), factura.getDireccion(), factura.getCorreo(), factura.getNumeroTelefono(), factura.getNumeroTarjeta(), factura.getNumeroSeguridad());
        this.factura = factura;
    }
    
    public double calcularTotal() {
        return factura.calcularTotal();
    }

   
}

//factory y singleton