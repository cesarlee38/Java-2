public class C5{
  public static void main(String args[]){
   int num1 = 4;
   int num2 = 4;
   int resultado = 0;
   
   resultado = num1 + num2 / 2;
   System.out.println("El resultado es: " + resultado);

   resultado = num1 + num2 / 2;
   System.out.println("El resultado incorrecto es: " + resultado);

   resultado = (num1 + num2) / 2;
   System.out.println("El resultado correcto es: " + resultado);
 }
}