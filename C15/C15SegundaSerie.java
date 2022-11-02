public class C15SegundaSerie{
  public static void main(String args[]){

   int i = 0, j = 99;

   System.out.print("Serie con for: ");

   for(i = 1; i<=5; i++){
    System.out.print(i + ", " + j);
    if(i < 5){
     System.out.print(", ");
   }
    j--;
  }

   i = 1;
   j = 99;
   System.out.println("");
   System.out.print("Serie con while: ");

   while(i <= 5){
    System.out.print(i + ", " + j);
    if(i < 5){
     System.out.print(", ");
   }
    i++;
    j--;
  }

   i = 1;
   j = 99;
   System.out.println("");
   System.out.print("Serie con dowhile: ");

   do{
    System.out.print(i + ", " + j);
    if(i < 5){
     System.out.print(", ");
   }
    i++;
    j--;
  }while(i<=5);

 }
}