class Alfa
{
 private int n=10;
 private static int x=20, y=30;

 void set(int n)
 {
  this.n = n;
 }

 static void show()
 {
  //System.out.println("n : "+n);          (1) non-static members cannot be accessed inside static context
  System.out.println("x : "+x);
 }
 
 static class Beta
 {
  String x;
  
  void set(int n, int x, int y, String s)
  {
   //this.n = n;                            (2) not a member of Beta
   //Alfa.n = n;                            (3) Non-static members cannot be accessed using class name

   //this.x = x;                            incompatible types
   Alfa.x = x;

   //this.y = y;                            (2)
   Alfa.y = y;
  
   this.x = s;
   //set(n);                                (1)
  } 
  
  void print()
  {
   show();
   System.out.println("Beta[x] : "+x);
  }

  void disp()
  {
   System.out.println();
   //System.out.println("Alfa[n] : "+n);       non-static members cannot be accessed inside static context
   System.out.println("Alfa[x] : "+Alfa.x);
   System.out.println("Alfa[y] : "+y);
   System.out.println("Beta[x] : "+x);
  }
 }
}

class StaticNested
{
 public static void main(String args[])
 {
  Alfa a;
  a = new Alfa();
  //a.disp();                                   not a member of Alfa
  a.show();

  //Beta b;                                       Beta nested inside Alfa
  Alfa.Beta b;
  b = new Alfa.Beta();
  b.disp();
  //b.show();                                   Not a member of Beta
 }
}




















































