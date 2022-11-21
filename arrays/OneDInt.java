import java.util.*;
class OneDInt
{
 public static void main(String...args)
 {
  int x[]={1,2,3,4,5};
  int y[]=new int[10];
  int z[];
  //z={10,20,30};  //error: illegal start of expression
  z=new int[] {10,20,30};  //Anonymous Array

  System.out.println();
  System.out.println(x);  //[I@...]
  System.out.println(x.length);  //5

  System.out.println(x[2]);  //3
  System.out.println(y[3]); //0
  //System.out.println(z[4]); //ArrayIndexOutOfBoundException
  System.out.println();

  //printing array

  //Using for(...) loop
    System.out.println();
    for(int i=0; i<x.length; i++)
      System.out.print(x[i]+" ");
    System.out.println();

  //Using For...in loop -> can be used only with arrays
    System.out.println();
    for(int n : x)
      System.out.print(n+" ");  
    System.out.println();

  //Using Array.toString()
    System.out.println();
    System.out.print(Arrays.toString(x));
    System.out.println();
 }
}