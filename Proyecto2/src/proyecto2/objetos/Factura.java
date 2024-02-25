/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

/**
 *
 * @author USER
 */
abstract class Factura {
    private String nombre;
    private String direccion;
    private String correo;
    private float numeroTelefono;
    private float numeroTarjeta;
    private float numeroSeguridad;

    public Factura(String nombre, String direccion, String correo, float numeroTelefono, float numeroTarjeta, float numeroSeguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
        this.numeroTarjeta = numeroTarjeta;
        this.numeroSeguridad = numeroSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(float numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public float getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(float numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public float getNumeroSeguridad() {
        return numeroSeguridad;
    }

    public void setNumeroSeguridad(float numeroSeguridad) {
        this.numeroSeguridad = numeroSeguridad;
    }

      private EstrategiaFactura estrategiaFactura;

    public void setEstrategiaFactura(EstrategiaFactura estrategiaFactura) {
        this.estrategiaFactura = estrategiaFactura;
    }

    public double calcularTotal() {
        return estrategiaFactura.calcularTotal(this);
    }
    
    
}
