import java.util.Scanner;

public class C18{
  public static void main(String args[]){

   String cadena = "";
   int num = 0, desde = 0, hasta = 0;
   Scanner escaner = new Scanner(System.in);

   System.out.print("Introduce una cadena: ");
   cadena = escaner.nextLine();

   num = cadena.length();
   System.out.println("El numero de caracteres son: " + num);

   System.out.println("¿Desde que caracter hasta cual caracter deseas obtener la cadena?");
   desde = escaner.nextInt();
   hasta = escaner.nextInt();

   System.out.println("La nueva cadena es: " + cadena.substring(desde, hasta));

 }
}