//Automatic Exception Generation a Custom Handling
import java.util.*;
class CustomEx
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
  q=n/d;
  System.out.println("\nOperation successful");
  }
  catch(ArithmeticException e)
  {
   System.err.println();
   System.err.println("alert       - "+e);
   System.err.println("cause       - "+e.getCause());
   System.err.println("Message     - "+e.getMessage());
   System.err.println("Stack Trace -");
   e.printStackTrace();
   q=0;
  }
  System.out.println("\nQuotient :"+q+"\n");
 }
} 