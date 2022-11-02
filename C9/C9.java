import java.util.Scanner;

public class C9{
  public static void main(String args[]){

   Scanner escaner = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");
   System.out.println("¿Cual es el nombre del trabajador");
   nombre = escaner.nextLine();
   System.out.println("¿Cuantos años de servicio tiene el trabajador?");
   antiguedad = escaner.nextInt();
   System.out.println("¿Cual es la clave de su departamento?");
   clave = escaner.nextInt();

   if(clave == 1){
    if(antiguedad == 1){
     System.out.println(nombre + ", tiene derecho a 6 dias");
   }
    else if(antiguedad >=2 && antiguedad <=6){
     System.out.println(nombre + ", tiene derecho a 14 dias");
   }
    else if(antiguedad == 7){
     System.out.println(nombre + ", tiene derecho a 20 dias");
   }
    else{
     System.out.println("Aun no tiene derecho a vacaciones");
   }
  }
   else if(clave == 2){
    if(antiguedad == 1){
     System.out.println(nombre + ", tiene derecho a 7 dias");
   }
    else if(antiguedad >=2 && antiguedad <=6){
     System.out.println(nombre + ", tiene derecho a 15 dias");
   }
    else if(antiguedad == 7){
     System.out.println(nombre + ", tiene derecho a 22 dias");
   }
    else{
     System.out.println("Aun no tiene derecho a vacaciones");
   }
  }
   else if(clave == 3){
    if(antiguedad == 1){
     System.out.println(nombre + ", tiene derecho a 10 dias");
   }
    else if(antiguedad >=2 && antiguedad <=6){
     System.out.println(nombre + ", tiene derecho a 20 dias");
   }
    else if(antiguedad == 7){
     System.out.println(nombre + ", tiene derecho a 30 dias");
   }
    else{
     System.out.println("Aun no tiene derecho a vacaciones");
   }
  }
   else{
    System.out.println("Error, la clave del departamento no existe");
  }
 }
}