import dmatics.*;
import dmatics.math.*;

class UsingPkg
{
 public static void main(String args[])
 {
  Complex c,d,e;

  c=new Complex(1,2);

  d=new Complex();
  d.get();

  e=c.add(d);

  System.out.println();
  System.out.println("c : "+c);
  System.out.println("d : "+d);
  System.out.println("e : "+e);
  System.out.println(); 

  Student x,y;
  x=new Student("Debbie",57,80,75);
  y=new Student();
  y.get();

  System.out.println("\n");
  System.out.println(x);
  System.out.println(y);
  System.out.println();

 }
}