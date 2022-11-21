class Alfa
{
 private static int n = 10;
 private int x = 11;

 Alfa() {}
 Alfa(int n)
 {
  this.n = n;
 }
 
 static void display()
 {
  System.out.println();
  System.out.println("Alfa[n] : "+n);  
 }  

 void show()
 {
  System.out.println();
  System.out.println("Alfa[n] : "+n);
  System.out.println("Alfa[x] : "+x);
 }
  
 class Beta
 {
  private static int m = 20;                  //OK since JDK 16
  private int y = 21;
 
  Beta() {}
  Beta(int y)
  {
   this.y = y;
  }

  void set(int /*x*/ n, int y)
  {
   //this.x = x;                              x not a member of Beta
   //Alfa.x = x;                              Non-static members cannot be accessed using classname

   x = n;
   this.y = y;
  }
 
  void disp()
  {
   display();
   show();
   System.out.println("Beta[m] : "+m);
   System.out.println("Beta[y] : "+y);
  }

  void print()
  {
   System.out.println();
   System.out.println("Alfa[x] : "+x);
   System.out.println("Beta[y] : "+y);  
  }
 }
}

class InnerDemo
{
 public static void main(String arg[])
 {
  Alfa a=new Alfa();
  //a.print();                              not a memeber of Alfa
  a.show();

  //Beta b;                                 Beta nested inside Alfa 
  Alfa.Beta b;
  //b=new Alfa.Beta();                      Inner class objects must be built upon outer class objects
  b=new Alfa().new Beta();
  //b.display();                            not a member of Beta
  //b.show();                               not a member of Beta  
  b.print();

  Alfa.Beta b1, b2, b3;
  b1=a.new Beta();
  b2=a.new Beta(22);
  b3=a.new Beta(23);

  b1.print();
  b2.set(101, 201);
  b2.print();
  b3.print();
 }
}
 


























