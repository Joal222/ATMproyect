/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATMproyect;

/**
 *
 * @author avila
 */
public class Transaccion {
    private int noCuenta;
    private Pantalla pantalla; // Referencia a la clase pantalla
    private BaseDatos baseDatos;
    
    
    
    // devuelve el número de cuenta
    public int obtenerNumeroCuenta(){
        return this.noCuenta;
    }// fin obtenerNumeroCuenta
    
    // devuelve una referencia a la pantalla
    public Pantalla obtenerPantalla(){
        return pantalla;
    }
    

    
    
}

