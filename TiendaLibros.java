import java.util.Scanner;

public class TiendaLibros {
public static void main (String[] args) {

Scanner escaner = new Scanner (System.in);
boolean Salir = false;

	        int Preciolibro = 0;
			int precioenvio = 0;
			String Localidad  = "";
		    String libro ="";
			

do {
	        System.out.println("\n###############################################");
            System.out.println("\n######        TIENDA DE LIBROS        #########");
			System.out.println("\n###############################################");
			
			System.out.println("\n +-+-+-+-+ Libros disponibles  +-+-+-+-+");
			System.out.println("\n *1) Don Quijote de la Mancha.......$850*");
			System.out.println("\n *2) Historia de dos ciudades.......$650*");
			System.out.println("\n *3) El Se"+"\u00F1"+"or de los Anillos........$500*");
			System.out.println("\n *4) El principito..................$600*");
			System.out.println("\n+-+-+-+-++-+-+-+-++-+-+-+-++-+-+-+-++-+-+-+-+");
			System.out.println("\n Seleccione el numero del libro deseado o S para salir del sistema");
			String menu  = escaner.nextLine();	
			
        switch (menu){
     case "1": {
        libro = "Don Quijote de la Mancha...$850       +-+";
		Preciolibro  = 850;
     break;
     }
     case "2" : {
        libro = "Historia de dos ciudades...$650       +-+";
	    Preciolibro  = 650;
     break;
     }
    case "3" : {
        libro = "El Se"+"\u00F1"+ "or de los Anillos...$500        +-+";
	    Preciolibro  = 500;
	 break;
       }
	case "4": {
       libro = "El principito...$600                  +-+";
	   Preciolibro  = 600;
    break;
	}
	 case "S" :
     case "s"  :    	 {
         System.out.println("=========================================");
         System.out.println("=="+"\u00bf"+"Realmente desea salir del sistema? ==");
         System.out.println("=========================================");
         String Exit = escaner.nextLine();
		  if ( Exit.equalsIgnoreCase("s")){ 
           Salir = true;
      break;
     }
	  
             }
		  default:
		  System.out.println("===============================================");
		  System.out.println("= Opcion no valida. Por Favor intente de nuevo=");
		  System.out.println("===============================================");
		  
		      }
 	 
	 
  if(!Salir) {
		 System.out.println("\n+-+-+-+-++-+-+-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+");
		 System.out.println("\n+-+   seleccione cantidad de unidades     +-+");
		 System.out.println("\n+-+-+-+-++-+-+-+-+-+-+-+-+-++-+-+-+-++-+-+-+-+");
		 int unidades = escaner.nextInt();
		 escaner.nextLine();
		 System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+");
		 System.out.println("\n+-+ ¿Retira en tienda (T) o Envio a Domicilio(E)?  +-+");
		 System.out.println("\n+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+");
		 String envio = escaner.nextLine();
		
		if (envio.equalsIgnoreCase("e")){
		  precioenvio = 250;
			System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-+");
		    System.out.println("\n+-+  Ingrese la localidad  +-+");
			System.out.println("\n+-+-+-+-+-+-+-+-++-+-+-+-+-+-+");
			Localidad = escaner.nextLine();	
			
		 if (Localidad.equalsIgnoreCase("Treinta y Tres")) {
           precioenvio = 80;
		  }				
		}
		   
		   int preciototal = Preciolibro * unidades;
		   double iva = 0.22 * preciototal;
		   double costofinal = preciototal + iva + precioenvio;
           System.out.println("\n+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+");
		   System.out.println("\n +-+-+-+-+   RESUMEN DE ORDEN   +-+-+-+-+-+-+");
		   System.out.println("\n+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-++-+-+-+-+");
		   System.out.println("\n+-+ " + libro );
		   System.out.println("\n+-+ Unidades: " + unidades +"                           +-+");
		   System.out.println("\n+-+ Costo total: " + preciototal +"                     +-+");
		   System.out.println("\n+-+ Costo IVA: " +  iva + "                      +-+");
		   
		   if (envio.equalsIgnoreCase("e")){
		   System.out.println("\n+-+ Envio a " + Localidad + ": " + precioenvio + "            +-+");
		   System.out.println("\n+-+ Costo total: " + costofinal +  "                  +-+");
           System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+");
		   
		   }else if(envio.equalsIgnoreCase("t")) {
			 System.out.println("\n+-+  Costo total: " + costofinal +  "                  +-+");
			 System.out.println("\n+-+ Se retira en tienda con el ticket!    +-+");
			 System.out.println("\n+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-++-+-+-+");
		 }
	}

		  } while (!Salir);

	   } 
    }

	