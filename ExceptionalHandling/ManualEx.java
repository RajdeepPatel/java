//manual Exception Generation and Custom Handling
import java.util.*;
class ManualEx
{
 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  int n,d,q;
  
  System.out.println();
  System.out.print("Enter the numerator:");
  n=sc.nextInt();
  
  System.out.print("Enter the denominator:");
  d=sc.nextInt();
  try
  {
   if(d==0)
   throw new ArithmeticException();

   if(d>n)
   throw new NumberFormatException("denominator is larger ..");

   q=n/d;
   System.out.println("\nOperation successful ..");
  }
  catch(ArithmeticException e)
  {
   System.out.println("\nalert-2 : "+e);
   q=-1;
  }
  System.out.println("\nQuotient : "+q+"\n");
 }
} 