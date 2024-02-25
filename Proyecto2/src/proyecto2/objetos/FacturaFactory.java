/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

/**
 *
 * @author USER
 */
//Proporciona una interfaz para la creación de objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.
public class FacturaFactory {
   public static Factura crearFactura(String nombre, String direccion, String correo, float numeroTelefono, float numeroTarjeta, float numeroSeguridad, double iva, double valorSinIVA) {
        return new FacturaIVA(nombre, direccion, correo, numeroTelefono, numeroTarjeta, numeroSeguridad, iva, valorSinIVA);
    }
}
