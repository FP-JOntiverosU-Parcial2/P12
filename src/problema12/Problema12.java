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
         int [] arr = new int[10];
        arr=llenarArr(arr);     //se llena el arreglo con numeros
        mostrarArr(arr);  //se hace la operacion deseada
        mensajeSalida();
        
    }
    public static int[] llenarArr(int[] arr){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Introduce un numero para la posicion "+ (i+1) +" :");
            arr[i]=entrada.nextInt();
        }
    return arr;
    }
    
    public static void mostrarArr(int[] arr){         
        int total=0,pares=0;                       //se hace una operacion donde los pares se suman
        for (int i=1; i<arr.length; i+=2){ //y mientas se tenga un par se agregara a "Pares" para dividirlo 
            total=arr[i]+total;
            pares++;
        }
        System.out.println("La media de los numeros en las posiciones pares es: " + total/pares);
    }
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa");  //se agradece por usar el programa
        System.exit(0);
    }
}