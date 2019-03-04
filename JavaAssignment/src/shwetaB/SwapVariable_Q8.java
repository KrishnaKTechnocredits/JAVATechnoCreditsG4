package shwetaB;

class SwapVariable_Q8
{

   static void display(int a, int b)
   {
     System.out.println("Before swapping value of a : " + a);
     System.out.println("Before swapping value of b : " + b);
     
     int c = a;
     a = b;
     b = c;
   
     System.out.println("After swapping value of a : " + a);
     System.out.println("After swapping value of b : " + b);
   
   }
   public static void main(String[] args)
   {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     display(a,b);
   }
}
