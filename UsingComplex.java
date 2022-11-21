import dmatics.math.*;

class UsingComplex
{
 public static void main(String arg[])
 {
  Complex c,d,x,y;
  c = new Complex();
  c.set(1.5,7.3);
  d = new Complex();
  d.set(6.3,-2.5);
  x = c.add(d);
  y = Complex.subtract(c,d);

  System.out.print("\nC : ");
  c.print();
  System.out.print("\nd : ");
  d.print();
  System.out.print("\nx : ");
  x.print();
  System.out.print("\ny : ");
  y.print();

  System.out.println();
 }
}