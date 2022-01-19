import java.util.*;

class Even_Odd{
  public static void main(String[] args)
  {
  System.out.print("Enter The Number:");
  Scanner user = new Scanner(System.in);
  int result=user.nextInt();
  if(result%2==0)
  {
    System.out.println("Even Number");
  }
  else
  {
    System.out.println("Odd Number");
  }
  }
}