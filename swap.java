import java.util.Scanner;

class swap
{
  public static void main(String[] args)
  {
    Scanner user = new Scanner(System.in);
    System.out.print("Enter The First Number: ");
    int a = user.nextInt();//Taking First Number
    System.out.print("Enter The Second Number: ");
    int b = user.nextInt();//Taking Second Number
    int temp=a;//created temp variable for temporarily store
    a=b;
    b=temp;
    System.out.println("The Swapping of Number is ");
    System.out.println("For A:"+a);
    System.out.println("For B:"+b);

  }
}