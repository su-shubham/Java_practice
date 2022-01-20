import java.util.Scanner;

class basic_array
{
  public static void main(String args[])
  {
    // Declaring array
    int arr[];
    //instantiation  
    arr=new int[5];
    //Initalization
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    arr[4]=50;
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]+"\n");
    }

    //declare, instantiate and initialize the java array together
    int a[]={60,70,80,90,100};
    for(int j=0;j<a.length;j++)
    {
      System.out.println(a[j]+"\n");
    }

   
//For each loop 
   int loopies[]={110,120,130,140,150};
  for(int loop:loopies)
  {
        System.out.println(loop+"\n");
  }
  }}