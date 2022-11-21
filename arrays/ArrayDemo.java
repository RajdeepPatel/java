import java.util.*;
class ArrayDemo
{
 public static void main(String...args)
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println();
  System.out.print("Enter Size of array : ");
  n=sc.nextInt();
  
  int arr[]=new int[n];
  
  System.out.println();
  for(int i=0; i<n; i++)
  {
    System.out.printf("Item %2d : ",i+1);
    arr[i]=sc.nextInt();
  }

  System.out.println();
  System.out.println("Item int the Array : "+Arrays.toString(arr)+"\n");
 }
}