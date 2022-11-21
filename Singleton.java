class Sample
{
 private int n;
 private static Sample s = new Sample();

 private Sample() {}

 void set(int n)
 {
  this.n = n;
 }
 
 void print()
 {
  System.out.println("n  : "+n);
 }
 
 static Sample getObject()
 {
  return s;
 }

 public String toString()
 {
  return n +"";
 }
}

class Singleton
{
 public static void main(String args[])
 {
  Sample x,y,z;

  //x = new Sample();         error: Sample() has private access in Sample

  x=Sample.getObject();
  y=Sample.getObject();
  z=Sample.getObject();

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);

  x.set(10);
  y.set(20);
  z.set(30);

  System.out.println();
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
  System.out.println();
 }
}
















