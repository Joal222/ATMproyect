/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATMproyect;

/**
 *
 * @author avila
 */
public class Cuenta {
    private float saldo;
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;

    public Cuenta(float saldo, float saldoFlotante, int numeroDeCuenta, int nip) {
        this.saldo = saldo;
        this.saldoFlotante = saldoFlotante;
        this.numeroDeCuenta = numeroDeCuenta;
        this.nip = nip;
        
    }
    
    public boolean validarNip(int nipUsuario){
        if (this.nip == nipUsuario) {
            
        return true;
        }else{
            return false;
        }
        
    } 
}

/* public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
            this.numeroDeCuenta = numeroDeCuenta;
        }
        else {
            System.out.println("El numero de cuenta no es válido.");
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    
    
    public int obtenerSaldo(int numeroDeCuenta) {  
        System.out.println("Cuenta.obtenerSaldo(int)");
        return 0;
    }
    
    public void obtenerSaldo(String s1, int i1) {
        System.out.println("Cuenta.obtenerSaldo(String, int)");
    }
    
    public void obtenerSaldo(int i1, String s1) {
        System.out.println("Cuenta.obtenerSaldo(int, String)");
    }
    public void acreditar(int monto) { }
    public void debitar(int monto) { }*/
