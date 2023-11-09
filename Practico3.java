import java.util.Scanner;

  public class Practico3 {
  public static void main (String[] args) {

   Scanner escaner = new Scanner(System.in);
   
    
  System.out.println("inserte su nombre ");
    String nombre = escaner.nextLine();

  System.out.println("inserte su apellido ");
    String apellido = escaner.nextLine();


 System.out.println("inserte su edad");
    int edad = escaner.nextInt();
    escaner.nextLine();
   
  System.out.println("inserte su sexo");
    String sexo  = escaner.nextLine();

  System.out.println("inserte fecha de nacimiento");
    String nacimiento= escaner.nextLine();

  System.out.println("inserte su altura ");
    Float altura = escaner.nextFloat();
   escaner.nextLine();

 System.out.println("esta hablitado en el sistema?");
    String habilitado = escaner.nextLine();
    boolean miboolean = habilitado.equals("si");
    
     System.out.println("inserte su email ");
    String email = escaner.nextLine();

    System.out.println("inserte una contrase"+"\u00f1"+"a");
    String contrasena = escaner.nextLine();
    
 
 System.out.println("\n=============================");
    System.out.println("Nombre:" + nombre + " " + apellido + "\nEdad:" + edad);
    System.out.println("Sexo:" + sexo + "\nFecha de Nacimiento:" + nacimiento + "\nAltura:" + altura + "\nHablitado: " + miboolean);
    System.out.println("Email:" + email + "\nContrase"+"\u00f1"+"a:" + contrasena);
   System.out.println("\n==============================");
 }
  }  