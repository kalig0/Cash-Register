class Stuff{
   static void nstuff(){
      System.out.println ("HI");
   }
   public static void main (String[] args){
      int[] numbers = {1,2,3,4,5,6,7,8,9};
      for (int item : numbers){
         System.out.println("Your number is " + item);
         if (item == 5){
            Stuff.nstuff();
         }
      }

   }
}
