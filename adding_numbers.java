import java.util.Scanner;

class adding_numbers
{
  public static void main(String[] args)
{
  System.out.println("**Welcome to AddIng Number**\n");
  //Adding two Numbers
  Scanner user = new Scanner (System.in);
  System.out.println("Enter The Two Numbers");
  int one = user.nextInt();
  int two = user.nextInt();
  System.out.println("The Addition Of Number is "+(one+two));

  // Adding n Numbers
  System.out.println("Enter The n Number you want to Add");
  int n= user.nextInt();
  int sum=0;
  System.out.println("You have Entered "+n);
  for(int i =1;i<n+1;i++)
  {
    System.out.println("Enter The " +i+ " Number:");
  int get = user.nextInt();
  sum = sum+get;
  }
  System.out.println("Addition Of Number is "+sum);
}}