
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    
    public static void main(String[] args) {
          Scanner menutaqueria = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenidos a la taqueria ");
            System.out.println("Que desea pedir ");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de bistec");
            System.out.println("3. Tacos campechanos");
            System.out.println("4. Tacos de suadero");
            System.out.println("6. Salir");
            
            
            opcion = menutaqueria.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usted a elejido tacos al pastor  ");
                    break;
                case 2:
                    System.out.println("Usted a elejido tacos de bistec");
                    break;
                case 3:
                    System.out.println("Usted a elejido tacos campechanos");
                    break;
                case 4:
                    System.out.println("Usted a elejido tacos de suadero");
                    break;
                case 5:
                    System.out.println("Gracias por su visita  ¡¡¡Vuelva pronto!!!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
                    break;
            }
        } while (opcion != 5);

        menutaqueria.close();
    }
}
    
    
    
    
