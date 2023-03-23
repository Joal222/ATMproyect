/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATMproyect;

import java.util.Scanner;

/**
 *
 * @author avila
 */
public class TecladoNumerico {
     private Scanner JA;
    
    public TecladoNumerico(){
        JA = new Scanner(System.in);
            
        
    }
    public int capturarDatos() {  
    return JA.nextInt();
    }
}
