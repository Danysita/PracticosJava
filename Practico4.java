public class Practico4 {
   public static void main (String[] args) {
     
 String textoinformativo = "El lenguaje de programacion Java fue desarrollado originalmente por James Gosling, de Sun Microsystems constituida en 1983 y posteriormente " 
      + "\nadquirida el 27 de enero de 2010 por la compania Oracle,y publicado en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems";

 boolean Encontrada = textoinformativo.contains("Java");
 boolean elTextoEsDeLargoMayorA150 = textoinformativo.length() > 150;

 System.out.print("info: " + textoinformativo);
 System.out.print("\n                            ");
 System.out.print("\nEncontrada Java: " + Encontrada);
 System.out.print("\nEl texto es mayor a 150: " + elTextoEsDeLargoMayorA150);



 }
}