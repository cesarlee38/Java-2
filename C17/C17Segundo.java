import java.util.Scanner;

public class C17Segundo{

  public static void main(String args[]){

   String usuario = "", password = "";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingresa el usuario: ");
   usuario = entrada.nextLine();

   System.out.print("Ingresa la contraseña: ");
   password = entrada.nextLine();

   if(usuario.equals("diego") && password.equals("12345")){
    System.out.println("Inicio de sesion correcto");
  }
   else{
    System.out.println("Usuario o contraseña incorrectos");
  }

 }

}