public class C11{
  public static void main(String args[]){
   int num1 = 5, num2 = 3, resultado = 0;
   int opcion = 2;
   switch(opcion){
    case 1:
     resultado = num1 + num2;
     System.out.println("El resultado de la suma es: " + resultado);
     break;
    case 2:
     resultado = num1 - num2;
     System.out.println("El resultado de la resta es: " + resultado);
     break;
    case 3:
     resultado = num1 * num2;
     System.out.println("El resultado de la multiplicacion es: " + resultado);
     break;
    case 4:
     resultado = num1 / num2;
     System.out.println("El resultado de la division es: " + resultado);
     break;
    default:
     System.out.println("La opcion no existe");
     break;
  }
 }
}