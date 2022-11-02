import java.util.Scanner;

public class C17Primero{
  public static void main(String args[]){

   String nombre1 = "", nombre2 = "";
   Scanner escaner = new Scanner(System.in);

   System.out.print("Porfavor ingresa el primer nombre: ");
   nombre1 = escaner.nextLine();

   System.out.print("Porfavor ingresa el segundo nombre: ");
   nombre2 = escaner.nextLine();

   if(nombre1.equals(nombre2)){
    System.out.println("Los nombres son iguales");
  }
   else{
    System.out.println("Los nombres son diferentes");
  }

   System.out.println("IgnoreCase");

   System.out.print("Porfavor ingresa el primer nombre: ");
   nombre1 = escaner.nextLine();

   System.out.print("Porfavor ingresa el segundo nombre: ");
   nombre2 = escaner.nextLine();

   if(nombre1.equalsIgnoreCase(nombre2)){
    System.out.println("Los nombres son iguales");
  }
   else{
    System.out.println("Los nombres son diferentes");
  }

 }
}