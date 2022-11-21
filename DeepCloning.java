class Sample implements Cloneable
{
 private int n;
 private Complex c;

 Sample()
 {
  System.out.println("constructing plain object..");
 }

 Sample(int n, double real, double imag)
 {
  System.out.println("constructing parameterized object..");
 
  this.n = n;
  c = new Complex(real, imag); 
 }

 void set(int n, double real, double imag)
 {
  this.n = n;
  c.set(real, imag);
 }

 public Sample clone() throws CloneNotSupportedException
 {
  Sample s = (Sample) super.clone();
  s.c = new Complex(c);
  
  return s;
 }

 public String toString()
 {
  return "[n : "+n+" , c : "+c+"]";
 }
}

class DeepCloning
{
 public static void main(String[] arg) throws CloneNotSupportedException
 {
  Sample x = new Sample(10, 1.5, 7.3);
  Sample y = x.clone(); //error: clone() has protected access in Object , incompatible types: Object cannot be converted to Sample

  System.out.println();
  System.out.println("x -"+x);
  System.out.println("y -"+y);

  y.set(20, 9.6, -2.3);

  System.out.println();
  System.out.println("x -"+x);
  System.out.println("y -"+y);
  
 }
}


















