/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relojdigital;

/**
 *
 * @author Xavi Alberto Lozano Palos 04/11/2025
 */
public class RelojDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClockDisplay reloj = new ClockDisplay();  // creo el objeto

        String horaInicial = reloj.getTime();     // obtengo la hora

        System.out.println(horaInicial);          // Y la imprimo
        
        reloj.timeTick();   //llamo al método timeTick para que avanze 1
        
        System.out.println(reloj.getTime());   //Imprimo
        
        reloj.setTime(1, 0); //LLamo al método setTime y le doy los parametros de la hora y minutos que quiero
        
        System.out.println(reloj.getTime()); // Imprimo
        
    }//Cierra main
    
}
