package shwetaB;

class Temperature_Q6
{
  static void display(int f)
  {
    int celcius = (f-32)*5/9;
    System.out.println("Temperature in celcius is : " + celcius);
  }

  public static void main(String[] args)
  {
    int f = Integer.parseInt(args[0]);
    display(f);
  }
}
  














