/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_operaciones;

/**
 *
 * @author Jennis
 */
public class EVA2_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int num1, num2;
        num1 = 5;
        num2 = 3;
        
        //SUMA
        int suma = num1 + num2;
            System.out.println("La suma es: " + suma);
        //RESTA
        int resta = num1 - num2;
            System.out.println("La resta es: " + resta);
        //MULTIPLICACION
        int multi = num1 * num2;
            System.out.println("La multiplicación es: " + multi);
        //DIVISION
        int divi = num1 / num2;
            System.out.println("La division es: " + divi);
        double diviDouble = 7 / 2.0;
            System.out.println("La divison (double) de 7/2 es: " + diviDouble);
        //ACUMULADORES
            //SUMA +=, RESTA -=, MULTI *=, DIVI /=
         int sumatoria = 0;
         /*sumatoria = sumatoria + 90;
         sumatoria = sumatoria + 80;
         sumatoria = sumatoria + 80;*/
            sumatoria += 90;
            sumatoria += 80;
            sumatoria += 80;
                System.out.println("La sumatoria es: " + sumatoria);
            sumatoria -= 70;//le resto 70 a la sumatoria
            //sumatoria = sumatoria - 70; 
                System.out.println("La sumatoria es: " + sumatoria);
            //
            int multiAcum = 1;
                multiAcum += 100;
                    System.out.println("Multiacum = " + multiAcum);
                multiAcum *= 5;
                    System.out.println("Multiacum = " + multiAcum);
    }
    
}
