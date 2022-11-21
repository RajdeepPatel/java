class Sample
{
 int n = 10;
 static int x = 20;

 void set(int n, int x)
 {
  this.n = n;
  this.x = x;

  print();
  show();
 }

 static void set(int x)
 {
  //n = x;                 error: non-static variable n cannot be referenced from a static context
  //this.x = x;            error: non-static variable this cannot be referenced from a static context

  Sample.x = x;          

  //print();               error: non-static method print() cannot be referenced from a static context
  show();

  Sample s = new Sample();

  s.n = x;
  s.x = x;

  s.print();
  s.show();
 }

 void print()
 {
  System.out.println();
  System.out.println("n : "+ n);
  System.out.println("n : "+ x);
 }

 static void show()
 {
  System.out.println();
  //System.out.println("n : " + n);     error: non-static variable n cannot be referenced from a static context
  System.out.println("n : " + x);
 }
}

class StaticMethod
{
 public static void main(String arg[])
 {
  //Sample.set(1,2);         error: non-static method set(int,int) cannot be referenced from a static context
  Sample.show();

  Sample s = new Sample();
  s.set(10);
  s.print();
 }
}