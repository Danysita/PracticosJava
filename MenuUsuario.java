import java.util.Scanner;

  public class MenuUsuario {
  public static void main (String[] args) {

        Scanner escaner = new Scanner(System.in);
		boolean Salir = false;
		String Exit = "";
      
        do {
			System.out.println("\n###############################################");
            System.out.println("\n###### CURSO JAVA: CONTROL DE STOCK  #########");
			System.out.println("\n###############################################");
            System.out.println("\n####    * Listar Productos                 ####");
			System.out.println("\n####  1)Ingresar Nuevo Producto            ####");
		    System.out.println("\n####  2)Eliminar Producto                  ####");
			System.out.println("\n####  3) Salir                             ####");
		    System.out.println("\n###############################################");
			          String Menu = escaner.nextLine();

      switch(Menu) {
     case "1" : {
          System.out.println("==================================");
          System.out.println("= Ingrese los datos del producto =");
          System.out.println("==================================");
      break;
     }
     case "2" : {
         System.out.println("=====================================================");
         System.out.println("= Ingrese el identificador del producto a eliminar =");
         System.out.println("=====================================================");
         break;
     }
    case "3" : {
         System.out.println("=========================================");
         System.out.println("=="+"\u00bf"+"Realmente desea salir del sistema? ==");
         System.out.println("=========================================");
          Exit = escaner.next();
		  if (Exit.equalsIgnoreCase("s")) {
           Salir = true;
		 } else if (Exit.equalsIgnoreCase("n")){
           Salir = false;
	
		  }	
          break;		  
          }
		
		  default:
		  if (!Exit.equalsIgnoreCase("n")) {
		  System.out.println("===============================================");
		  System.out.println("= Opcion no valida. Por Favor intente de nuevo=");
		  System.out.println("===============================================");
            }
           } 
          } while ( Salir == false);
        } 
    }
