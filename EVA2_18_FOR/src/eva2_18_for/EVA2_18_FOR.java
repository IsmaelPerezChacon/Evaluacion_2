/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_for;

/**
 *
 * @author Jennis
 */
public class EVA2_18_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inicio; condicion; incremento/decremento;
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " - ");
            //las llaves son opcionales, usar solo al tener mas de una instruccion
        }
        System.out.println("");
            for(int i = 10; i >= 1; i--){
            System.out.print(i + " - ");
            //las llaves son opcionales, usar solo al tener mas de una instruccion
            
        }
            //imprimir todos los numeros pares entre 0 y 100
            //0 ,2 ,4,6 , 8 ,10
            System.out.println("");
            for(int i = 0; i <= 100; i += 2){
                System.out.print(i + " - ");
        }
    }
    
}
