
package ejercicio22;

import java.util.Scanner;


public class Ejercicio22 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero  ");
        
        int numero = scanner.nextInt();
        scanner.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial de este numero  " + numero + " es =  " + factorial);
    }
    }
    

