import java.util.Scanner;

 public class Practico2 {
   public static void main (String[] args) {
   
      Scanner eto = new Scanner(System.in);

       System.out.println("Escriba su Nombre");
       String Nombre = eto.nextLine();
      
      System.out.println("Escriba su Apellido");
       String Apellido = eto.nextLine();
           
      System.out.println("cree una contrase"+"\u00f1"+"a");
       String Contrasena = eto.nextLine();

     
      System.out.println("\n================================");
      System.out.println("Usuario: " + Nombre + " " + Apellido); 
     System.out.println("\nContrase"+"\u00f1"+"a: " + Contrasena);
     System.out.println("\n================================");
 }
  }