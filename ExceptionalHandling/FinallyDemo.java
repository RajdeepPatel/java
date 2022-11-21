import java.util.*;

class FinallyDemo
{
 void test(int n,int d)
 {
  int q;
  
  try
  {
   if(d>n) throw new NumberFormatException("denominator is larger..");
   q=n/d;
  }
  catch(NumberFormatException e)
  { 
   System.err.println("\nalert -1 : "+e); 
   q=-1;
  }
  catch(ArithmeticException e)
  {
   System.err.println("\nalert -2 : "+e+"  returning..\n");
   return;
  }
  finally
  {
   System.out.println("\ninside finally ..\n");
  }
  System.out.println("\n end of test...\n");
 }

 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  int n,d;
  System.out.println();
  System.out.print("Enter Numerator   :");
  n=sc.nextInt();
  System.out.print("Enter Denominator :");
  d=sc.nextInt();
  
  System.out.println();
  new FinallyDemo().test(n,d);
  System.out.println("\nend of code \n");
 }

}