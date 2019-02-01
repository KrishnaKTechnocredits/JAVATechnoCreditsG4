package shwetaB;

class Interest_Q5
{
  static void display(double P, double T, double R)
	{
           double z = (P*T*R)/100;
           System.out.println("Simple Interest is : " + z);
	}
  public static void main(String[] args)
	{
           int P = Integer.parseInt(args[0]);
           int T = Integer.parseInt(args[1]);
           int R = Integer.parseInt(args[2]);
	   display(P, T, R);
        }
}
 