class Complex
{
 private float real, imag;

 Complex()
 {
  this(0);
  System.out.println("No Argument Constructor..");
 }
 
 Complex(double imag)
 {
  this(0, imag);                                  //1-can be written only inside a constructor  2-must be the first line of statement
  System.out.println("One Argument Constructor..");
 }
 
 Complex(double real, double imag)
 {
  this.real = (float)real;
  this.imag = (float)imag;
  System.out.println("Two Arguments Constructor..");
 }

 Complex(Complex c)
 {
  this(c.real, c.imag);
  System.out.println("No Argument Constructor..");
 }

 public String toString()
 {
  return String.format("(%.2f%+.2fj)",real, imag);
 }
}

class ConsDemo
{
 public static void main(String[] args)
 {
  Complex x,y;

  System.out.println();
  x = new Complex();

  System.out.println();
  y = new Complex(1.5, -7.3);


  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println();
 }
}




























