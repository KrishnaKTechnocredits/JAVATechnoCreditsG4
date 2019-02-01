package shwetaB;

class Area_Q4
{
 
  static void display(int radius,int length, int breadth, int width)
  {
    double pie = 3.14;
    int AR = length*breadth;
    double AC = pie*(radius*radius);
    int PR = 2*(length+width);
    double PC = 2*(pie*radius);
    System.out.println("Area of Rectangle is : " + AR);
    System.out.println("Area of Circle is : " + AC);
    System.out.println("Perimeter of Rectangle is : " + PR);
    System.out.println("Perimeter of Circle is : " + PC);
  }

  public static void main(String[] args)
  {
     int radius = Integer.parseInt(args[0]);
     int length = Integer.parseInt(args[1]);
     int breadth = Integer.parseInt(args[2]);
     int width = Integer.parseInt(args[3]);
    display(radius, length, breadth, width);
  }
}
