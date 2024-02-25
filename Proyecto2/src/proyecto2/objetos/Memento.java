/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.objetos;

/**
 *
 * @author USER
 */
public class Memento {
    private final Factura facturaState;

    public Memento(Factura facturaState) {
        this.facturaState = facturaState;
    }

    public Factura getSavedState() {
        return facturaState;
    }
}
