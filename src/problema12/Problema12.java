/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema12;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] cad = new int[10];
        cad=llenarCad(cad);
        mostrarCad(cad);
        mensajeSalida();
        
    }
    public static int[] llenarCad(int[] cad){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<cad.length;i++){
            System.out.println("Introduce un numero para la posicion "+ (i+1) +" :");
            cad[i]=entrada.nextInt();
        }
    return cad;
    }
    
    public static void mostrarCad(int[] cad){
        int total=0,pares=0;
        for (int i=1; i<cad.length; i+=2){
            total=cad[i]+total;
            pares++;
        }
        System.out.println("La media de los numeros en las posiciones pares es: " + total/pares);
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); 
        System.exit(0);
    }
}