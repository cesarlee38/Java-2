import java.util.Scanner;

public class C20{
  public static void main(String args[]){

   Scanner escaner = new Scanner(System.in);
   int longitud = 0;

   System.out.println("¿Cuantos numeros desea ingresar?");
   longitud = escaner.nextInt();

   int arreglo[] = new int[longitud];

   for(int i = 0; i < arreglo.length; i++){
    System.out.println("Ingresa el numero " + (i+1) + ": ");
    arreglo[i] = escaner.nextInt();
  }

   for(int i = 0; i < arreglo.length; i++){
    System.out.print("[" + arreglo[i] + "]");
  }

 }
}