import java.util.Scanner;

class user_input
{
  public static void main(String[] args)
  {
  System.out.println("Enter the Name:");
  Scanner user= new Scanner(System.in);
  String name=user.nextLine();

  System.out.println("Name is "+name);
  }
}