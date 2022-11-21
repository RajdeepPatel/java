//customized exp. handling class

import java.util.*;

class MyExcep extends Exception
{
 private String msg="MyExcep - ";
  
 MyExcep()
 {
  msg=msg+"unknown exception..";
 }

 MyExcep(String s)
 {
  msg=msg+s;
 }

 public String getMessage()
 {
  return msg;
 }

 public String toString()
 {
  return msg;
 }
}


class CustExClass
{
 public static void main(String...args)
 {
  Scanner sc=new Scanner(System.in);
  int n,d,q;
  System.out.println();
  System.out.print("Enter the Numerator   : ");
  n=sc.nextInt();
  System.out.print("Enter the Denominator : ");
  d=sc.nextInt();

  try
  {
   if(d==0)
     throw new ArithmeticException();
   if(d>n)
     throw new MyExcep();
   q=n/d;
   System.out.println("\nOperation Successful..");
  }
  catch(ArithmeticException e)
  {
   System.out.println("\nalert - 1 : "+e);
   q=0;
  }
  catch(MyExcep e)
  {
   System.out.println("\nalert-2 : "+e);
   System.out.println("\nMessage : "+e.getMessage());
   q=-1;
  }

  System.out.print("\nQuetient : "+q+"\n");
 }
}