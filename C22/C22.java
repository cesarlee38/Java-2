import java.util.Scanner;

public class C22{
  public static void main(String args[]){

   Scanner escaner = new Scanner(System.in);
   int filas = 0, columnas = 0, contador = 1;

   System.out.println("Ingresa filas y columnas");
   filas = escaner.nextInt();
   columnas = escaner.nextInt();

   int numeros[][] = new int[filas][columnas];
   for(int i = 0; i < filas; i++){
    for(int j = 0; j < columnas; j++){
     numeros[i][j] = contador;
     contador++;
     System.out.print("[" + numeros[i][j] + "]");
   }
    System.out.println("");
  }

 }
}