/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATMproyect;

/**
 *
 * @author avila
 */
public class ATM {
    private RanuraParaDeposito ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    private Cuenta cuentaObj;
    
    //Implementación de relacion de agregación entre la clase TecladoNumerico y ATM
    public ATM() {
        this.ranuraParaDepositosObj = new RanuraParaDeposito();
        this.tecladoNumericoObj = new TecladoNumerico();
        this.pantallaObj = new Pantalla();
        this.dispensadorObj = new Dispensador();
        this.SolicitarDatos();

        
    }
     private void SolicitarDatos(){
        pantallaObj.mostrarMensaje("Bienvenido!!\n");
        pantallaObj.mostrarMensaje("Ingrese su numero de Cuenta:");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
        
            
        
       
     }
}
