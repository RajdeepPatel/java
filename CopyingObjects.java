class Complex
{
 private float real, imag;
  
 Complex() {}
 Complex(double real, double imag)
 {
  this.real=(float)real;
  this.imag=(float)imag;
 }
 
 Complex(Complex c)
 {
  real=c.real;
  imag=c.imag;
 }
 
 void set(double real, double imag)
 {
  this.real = (float)real;
  this.imag = (float)imag;
 }

 public String toString()
 {
  return "("+real+","+imag+"j)";
 }
}

class CopyingObjects
{
 public static void main(String[] args)
 {
  Complex x,y,z;
  x=new Complex(1.5, 7.3);

  y=x; //creates a copy of reference
 
  z=new Complex(x);
 
  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("Z : "+z);

  x.set(1.1,1.2);
  y.set(2.1,2.2);
  z.set(3.1,3.2);

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("Z : "+z);

  System.out.println();
 }
}