public class C15Fibonacci{
  public static void main(String args[]){

   int n0 = 0, n1 = 1, aux = 0, i = 0;

   System.out.print("Serie con for: ");

   System.out.print(n0 + ", " + n1 + ", ");
   for(i = 0; i < 8; i++){
    System.out.print((n0 + n1));
    if(i < 7){
     System.out.print(", ");
   }
    aux = n0 + n1;
    n0 = n1;
    n1 = aux;
  }

   n0 = 0;
   n1 = 1;
   i = 0;
   System.out.println("");
   System.out.print("Serie con while: ");
   System.out.print(n0 + ", " + n1 + ", ");

   while(i < 8){
    System.out.print((n0 + n1));
    if(i < 7){
     System.out.print(", ");
   }
    aux = n0 + n1;
    n0 = n1;
    n1 = aux;
    i++;
  }

   n0 = 0;
   n1 = 1;
   i = 0;
   System.out.println("");
   System.out.print("Serie con dowhile: ");
   System.out.print(n0 + ", " + n1 + ", ");

   do{
    System.out.print((n0 + n1));
    if(i < 7){
     System.out.print(", ");
   }
    aux = n0 + n1;
    n0 = n1;
    n1 = aux;
    i++;
  }while(i < 8);

 }
}