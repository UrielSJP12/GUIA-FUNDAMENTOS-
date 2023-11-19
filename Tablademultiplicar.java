
package tablademultiplicar;

import java.util.Scanner;

/**
 *
 * @author ism@
 */
public class Tablademultiplicar {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print(" Eliga un numero del 1 al 10: ");
        int numeroTabla = scanner.nextInt();

        System.out.println("La tabla de multiplicar del numero " + numeroTabla + " es: ");
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }

        scanner.close();
    }   
    
    
}
