package shwetaB;

class Maths_Q1
{
  
 static void add(int a, int b)
  {
    int c = a+b;
    System.out.println("The addition is : " + c );
  }
static void sub(int a, int b)
  {
    int d = a-b;
    System.out.println("The substraction is : " + d );
  }
static void mul(int a, int b)
  {
    int e = a*b;
    System.out.println("The multiplication is : " + e );
  }
static void div(int a, int b)
  {
    int f = a/b;
    System.out.println("The division is : " + f );
  }
static void remain(int a, int b)
  {
    int g = a%b;
    System.out.println("The remainder is : " + g );
  }
 public static void main(String[] args)
  {  
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     add(a, b);
     sub(a,b);
     mul(a,b);
     div(a,b);
     remain(a,b);
  }
}
