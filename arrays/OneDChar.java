import java.util.*;
class OneDChar
{
 public static void main(String...args)
 {
  char x[]={'M','I','C','K','E','Y'};
  char y[]=new char[10];
  char z[];
  z=new char[]{'R','O','N'}; //anonymous array

  System.out.println();
  System.out.println(x.length);
  System.out.println(x);         // o/p: MICKEY 
  System.out.println("X : "+x);  // o/p: reference of X

  System.out.print("Y : |");
  System.out.print(y);
  System.out.println("|");
 }
}