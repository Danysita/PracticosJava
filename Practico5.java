import java.util.Scanner;

  public class Practico5 {
  public static void main (String[] args) {

   Scanner escaner = new Scanner(System.in);
    
    System.out.println("###############################################");
    System.out.println("###### CURSO JAVA: CONSOLA DE USUARIO #########");
    System.out.println("###############################################");
   System.out.println("===============================");
   System.out.println("===          " + " Menu: "+ "        ===" + "\n=== 1) Ver Datos De Usuario ===" + "\n=== 2) Actualizar mi Perfil ===" + "\n=== 3) Validar Contrase"+"\u00f1"+"a   ===" );
   System.out.println("===============================");
   System.out.println("= ingrese una de la opciones  =");
   System.out.println("===============================");
    String Menu = escaner.nextLine();

 switch(Menu) {
     case "1" : {
          System.out.println("====================");
          System.out.println("= Datos de Usuario =");
          System.out.println("====================");
      break;
     }
     case "2" : {
        System.out.println("======================");
         System.out.println("= Actualizar Perfil  =");
         System.out.println("======================");
         break;
     }
    case "3" : {
         System.out.println("==========================");
         System.out.println("= ingrese una contrase"+"\u00f1"+"a = ");
          System.out.println("==========================");
         String Contrasenia = escaner.next(); 
         boolean contraok = Contrasenia.contains("CursoJava") && Contrasenia.length() > 8;
        
      if (contraok == false) {
         System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
         System.out.println("+-+ La contrase"+"\u00f1"+"a no cumple con el largo minimo de 8 caracteres o no contiene CurosJava +-+" + "\n+-+ intente de nuevo!                                                                   +-+");   
         System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
          break;   
     }else{ 	
         if(contraok == true){
     System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
     System.out.println("+-+ La contrase"+"\u00f1"+"a es segura.         +-+");

      }
     }
     
    System.out.println("+-+ Por favor confirme su contrase"+"\u00f1"+"a +-+");
    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
       String confirmacionContrasenia = escaner.next();
        boolean coinciden = confirmacionContrasenia.equals(Contrasenia);
        
      if (coinciden == true){
           System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+-+-+-+-+-+-+-+-+-+-+");
          System.out.println("+-+ La contrase"+"\u00f1"+"a es segura y coincide con la confirmacion. +-+");  
          System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
      }else{ 	
         if(coinciden == false){
          System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
          System.out.println("+-+ La contrase"+"\u00f1"+"a no coincide!      +-+" + "\n+-+ intente de nuevo!               +-+");
          System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
               break;
         }
         }
        } 
    }
  }
}