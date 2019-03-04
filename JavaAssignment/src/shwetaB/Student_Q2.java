package shwetaB;

class Student_Q2
{

  static void display(String Name, int RollNo, int Marks)
  {
     	System.out.println("Name of Student is : " + Name);
        System.out.println("RollNo is : " + RollNo);
        System.out.println("Obtained marks are : " + Marks);
  }
  public static void main(String[] args)
  { 
     String Name = args[0];
     int RollNo = Integer.parseInt(args[1]);
     int Marks = Integer.parseInt(args[2]);
     display(Name, RollNo, Marks);
  }
}