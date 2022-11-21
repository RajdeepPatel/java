class Alfa
{
 private int n=10;
 protected int x=11;
 public int y=12;
 int z=13;

 void set(int n, int x, int y, int z)
 {
  this.n=n;
  this.x=x;
  this.y=y;
  this.z=z;
 }

 void print()
 {
  System.out.println();
  System.out.println("n : "+n);
  System.out.println("x : "+x);
  System.out.println("y : "+y);
  System.out.println("z : "+z);
 }
}

class Beta extends Alfa
{
 private int x=21;
 public String z;

 void set(int x, int y, String z)
 {
  this.x=x;
  this.y=y;
  this.z=z;
 }

 void set(int x, int y, int z, int n, String s)
 {
  super.x=x;
  this.y=y;
  super.z=z;
  this.x=n;
  this.z=s;
 }

 void disp()
 {
  System.out.println();
  System.out.println("Beta[x] : "+x);
  System.out.println("Alfa[y] : "+y);
  System.out.println("Beta[z] : "+z);
 } 

 void display()
 {
  System.out.println();
  System.out.println("Alfa[x] : "+super.x);
  System.out.println("Alfa[y] : "+y);
  System.out.println("Alfa[z] : "+z);
  System.out.println("Beta[x] : "+x);
  System.out.println("Beta[z] : "+z);
 }
}

class Gama extends Beta
{
 void set(int y, String z)
 {
  this.y=y;
  this.z=z;
 }
  
 void show()
 {
  System.out.println();
  System.out.println("Gama[y] : "+y);
  System.out.println("Gama[z] : "+z);
 }
}

class MultiLevelInh
{
 public static void main(String args[])
 {
  Alfa a;
  a=new Alfa();
  //a.show();                              error : not a member of Alfa
  a.set(10, 20, 30, 40);

  Beta b;
  b=new Beta();
  b.set(1, 2, 3, 4);
  //b.show();                              error : not a member of Beta
  b.disp();
  b.print();

  Gama g;
  g=new Gama();
  g.disp();
  g.set(1, 2,"Ron");
  g.print();

  g.set(1, 2, 3, 4);
  g.disp();
  g.set(10, 20, 30, 40,"Tim");
  g.show();

  a=new Gama();
  //a.disp();                              error :
  //a.show();
  a.print();

  b=new Gama();
  b.disp();
  //b.show();
 }
}


















































































