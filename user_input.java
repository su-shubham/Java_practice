import java.util.Scanner;

class user_input
{
  public static void main(String[] args)
  {
    System.out.println("----Enter The Student details----");
  Scanner user= new Scanner(System.in);
  System.out.println("Enter the Name:");
  String name=user.nextLine();
  System.out.println("Enter The id:");
  int id=user.nextInt();
  user.nextLine();
  System.out.println("Enter The college Name: ");
  String college=user.nextLine();
  System.out.println("Name: "+name);
  System.out.println("Id: "+id);
   System.out.println("College Name: "+college);
   System.out.println("Thankyou!");

    
  }
}