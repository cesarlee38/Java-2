import java.util.Scanner;

public class C8{
  public static void main(String args[]){

   Scanner escaner = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, resultado = 0;

   System.out.println("Ingresa tu nombre");
   nombre = escaner.nextLine();

   System.out.println("Ingresa el primer numero");
   num1 = escaner.nextInt();

   System.out.println("Ingresa el segundo numero");
   num2 = escaner.nextInt();

   resultado = num1 + num2;

   System.out.println("Hola " + nombre + "!, el resultado de la suma es: " + resultado);
 }
}