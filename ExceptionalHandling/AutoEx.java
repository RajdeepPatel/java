//Automatic Exception Generation and Automatic Handling
import java.util.*;
class AutoEx
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

  q=n/d;
  
  System.out.println("\nQuotient :"+q+"\n");
 }
}