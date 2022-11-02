public class C15PrimeraSerie{
  public static void main(String args[]){

   int i = 0;

   System.out.print("Serie con for: ");

   for(i = 1; i<=10; i++){
    System.out.print(i);
    if(i < 10){
     System.out.print(", ");
   }
  }

   i = 1;
   System.out.println("");
   System.out.print("Serie con while: ");

   while(i <= 10){
    System.out.print(i);
    if(i < 10){
     System.out.print(", ");
   }
    i++;
  }

   i = 1;
   System.out.println("");
   System.out.print("Serie con dowhile: ");

   do{
    System.out.print(i);
    if(i < 10){
     System.out.print(", ");
   }
    i++;
  }while(i<=10);

 }
}