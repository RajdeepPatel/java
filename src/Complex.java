package dmatics.math;

public class Complex
{
 private float real, imag;

 public Complex() {}

 public Complex(double n)
 {
  real = imag = (float)n;
 }

 public Complex(double real, double imag)
 {
  this.real = (float)real;
  this.imag = (float)imag;
 }

 public Complex(Complex c)
 { 
  real = c.real;
  imag = c.imag;
 }

 public void set(double real, double imag)
 {
  this.real=(float) real;
  this.imag=(float) imag;
 }

 public void get()
 {
  java.util.Scanner sc=new java.util.Scanner(System.in);
  System.out.println();

  System.out.print("Enter real part : ");
  real=sc.nextFloat();

  System.out.print("Enter imag part : ");
  imag=sc.nextFloat();
 }

 public void print()
 {
  System.out.printf("(%.2f%+.2fj)",real, imag);
 }

 public Complex add(Complex c)
 {
  Complex d = new Complex();
  d.real = real + c.real;
  d.imag = imag + c.imag;
  return d;
 }

 public static Complex add(Complex c, Complex d)
 {
  Complex e = new Complex();
  e.real = c.real + d.real;
  e.imag = c.imag + d.imag;
  return e;
 }
 
 public Complex subtract(Complex c)
 {
  Complex d = new Complex();
  d.real = real - c.real;
  d.imag = imag - c.imag;
  return d;
 }

 public static Complex subtract(Complex c, Complex d)
 {
  Complex e = new Complex();
  e.real = c.real - d.real;
  e.imag = c.imag - d.imag;
  return e;
 }

 public Complex multiply(Complex c)
 {
  Complex d = new Complex();
  d.real = real*c.real - imag*c.imag;
  d.imag = real*c.imag + imag*c.real;
  return d;
 }

 public static Complex multiply(Complex c, Complex d)
 {
  Complex e = new Complex();
  e.real = c.real*d.real - c.imag*d.imag;
  e.imag = c.real*d.imag + c.imag*d.real;
  return e;  
 }

 public Complex divide(Complex c)
 {
  Complex d=new Complex();
  float q = c.real*c.real + c.imag*c.imag;
  d.real = (real*c.real + imag*c.imag)/q;
  d.imag = (imag*c.real - real*c.imag)/q;
  return d;
 }
 
 public static Complex divide(Complex c, Complex d)
 {
  Complex e = new Complex();
  float q = d.real*d.real + d.imag*d.imag;
  e.real = (c.real*d.real + c.imag*d.imag)/q;
  e.real = (c.imag*d.real - c.real*d.imag)/q;
  return e;
 }

 public String toString()
 {
  return String.format("(%.2f%+.2fj)",real, imag);
 }
}




















