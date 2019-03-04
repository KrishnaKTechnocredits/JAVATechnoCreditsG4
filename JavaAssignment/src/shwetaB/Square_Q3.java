package shwetaB;

class Square_Q3
{
 
  static void display(int s, int c)
  { 	
	int z = s*s;
	int y = c*c*c;
        System.out.println("The sqaure of no is : " + z);
        System.out.println("The cube of no is : " + y);
  }
  public static void main(String[] args)
  { 
       int s = Integer.parseInt(args[0]);
       int c = Integer.parseInt(args[1]);
       display(s,c);
	
  }
}