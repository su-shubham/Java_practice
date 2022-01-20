import java.util.*;

// class Calculator
// {
//   public static void main(String[] args)
// {
//   Scanner user = new Scanner(System.in);
//   System.out.println("Welcome to Calculator");
//   System.out.println("Enter The Character (+,-,/,*,%) : ");
//   char c = user.next().charAt(0);
//   System.out.println("Enter The Number : ");
//   int a = user.nextInt();
//   int b = user.nextInt();
//   System.out.println("Entered Character is "+c);

//   switch(c)
//   {
//     case '+':
//     System.out.println("The Addtion of Number is "+(a+b));
//     break;
//     case '-':
//     System.out.println("The Subtraction of Number is "+(a-b) );
//     break;
//     case '/':
//     System.out.println("The Division of Number is "+(a/b));
//     break;
//     case '*':
//     System.out.println("The Multiplication of Number is "+(a*b));
//     break;
//     case '%':
//     System.out.println("The Modulus of Number is "+(a%b));
//     break;

//   }
// }
// }


class Calculator
{
    public static void main(String[] args)
{
  int sum=0,minus=0,div=0,mod=0,multi=0;
  Scanner user = new Scanner(System.in);
  System.out.println("---Welcome to Calculator---");
  System.out.println("Enter The Character (+,-,/,*,%) : ");
  char c = user.next().charAt(0);
  System.out.println("Entered Character is "+c);
System.out.println("Enter The n Number you want to "+c+" :");
    int n =user.nextInt();
  switch(c)
  {
    case '+':
    for (int i=1;i<n+1;i++)
    {
        System.out.println("Enter " +i+ " Number:");
        int add=user.nextInt();
       sum = sum + add;
      }
       System.out.println("The Addtion of Number is "+sum);
    break;

    case '-':
     for (int i=1;i<n+1;i++)
    {
        System.out.println("Enter " +i+ " Number:");
        int sub=user.nextInt();
        minus = sub-minus;
      }
       System.out.println("The Subtraction of Number is "+minus);
    break;

    case '/':
    for (int i=1;i<n+1;i++)
    {
        System.out.println("Enter " +i+ " Number:");
        int division=user.nextInt();
        div = div / division;
      }
       System.out.println("The Division of Number is "+div);
    break;

    case '*':
     for (int i=1;i<n+1;i++)
    {
        System.out.println("Enter " +i+ " Number:");
        int multiply=user.nextInt();
        multi = multi * multiply;
      }
       System.out.println("The Multiply of Number is "+multi);
    break;

    case '%':
     for (int i=1;i<n+1;i++)
    {
        System.out.println("Enter " +i+ " Number:");
        int modulus=user.nextInt();
        mod= mod %modulus;
      }
       System.out.println("The Modulus of Number is "+mod);
    break;

  }
}
}