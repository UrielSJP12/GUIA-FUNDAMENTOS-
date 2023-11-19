
package ejercicio25;

import java.util.Scanner;


public class Ejercicio25 {

   
    public static void main(String[] args) {
          Scanner Dias = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 7: ");
        int numero = Dias.nextInt(); 

        String diaSemana;

        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
               diaSemana= "Martes";
                break;
            case 3:
                diaSemana= "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Numero no valido";
        }

        System.out.println("Hola soy el dia:  " + diaSemana);

       Dias.close();
    }
    }
    

