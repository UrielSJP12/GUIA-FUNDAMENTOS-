
package ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {

    
    public static void main(String[] args) {
         Scanner fichacontacto = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo:");
        String nombreCompleto = fichacontacto.nextLine();

        System.out.print("Ingrese su edad:");
        int edad = fichacontacto.nextInt();
        fichacontacto.nextLine(); 

        System.out.print("Ingrese su correo electronico: ");
        String correoElectronico = fichacontacto.nextLine();

        
        System.out.print("Ingrese su numero de telefono: ");
        String telefono = fichacontacto.nextLine();

        
      fichacontacto.close();

        
        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);
    }
}  
    
    

    

