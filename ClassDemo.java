class Complex
{
 private float real=0;
 float imag;

 void set(double real, double imag)
 {
  this.real = (float)real;
  this.imag = (float)imag;
  print();
 }
 
 void print()
 {
  System.out.printf("(%.2f%+.2fj)",real,imag);
 }
}

class ClassDemo
{
 public static void main(String arg[])
 {
  //real=0;
  //print();

  Complex x,y;
  x=new Complex();
  y=new Complex();
  
  //x.real=1;
  x.imag=2;

  x.set(1.5,7.2);
  y.set(5,7);
 }
}