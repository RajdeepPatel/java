class Alfa
{
 private int n = 10;
 protected int x = 11;
 int y = 11;

 void set(int n, int x, int y)
 {
  this.n=n;
  this.x=x;
  this.y=y;
 }

 void print()
 {
  System.out.println("Alf[n] : "+n);
  System.out.println("Alf[x] : "+x);
  System.out.println("Alf[y] : "+y);
 }
}

class Beta extends Alfa
{
 String x;
 void set(int n, int x, int y, String s)
 {
  //this.n=n;                            //error: n has private access in Alfa
  //this.x=x;                            // error: incompatible types: int cannot be converted to String
  super.x=x;
  this.y=y;
  super.y=y;
 
  set(n, x, y);
  this.x=s;
 }

 void print()
 {
  super.print();
  System.out.println("Beta[x] : "+x);
 }
 
 void show()
 {
  System.out.println();
  System.out.println("Alfa[x] : "+super.x);
  System.out.println("Alfa[y] : "+y);
  System.out.println("Beta[x] : "+x);
 }
}

class SingleInh
{
 public static void main(String args[])
 {
  Alfa a;
  a=new Alfa();
  //a.show();                             error : not a member of Alfa
  a.print();

  Beta b;
  b=new Beta();

  b.set(1, 2, 3);

  b.print();

  b.set(10, 20, 30, "Ron");

  b.show();

  a=new Beta();

  a.set(101, 102, 103);

  //a.show();                           error : super class reference cannot access exclusive members of the sub class

  a.print();                        //invokes print() of Beta

  //b=new Alfa();                       error: incompatible types: Alfa cannot be converted to Beta
 }
}
























