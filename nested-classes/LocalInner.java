class Alfa
{
 private int n=10;

 void set(int x)
 {
  class Beta
  {
   void init()
   {
    n=x; 
    //x++;                                 local variables referenced from an inner class must be final or effectively final
   }
  }
  Beta b=new Beta();
  b.init();
 }

 void show()
 {
  System.out.println("n : "+n);
 }
}

class LocalInner
{
 public static void main(String args[])
 {
  //Beta b;
  //Alfa.Beta b;

  Alfa a;
  a=new Alfa();
  a.set(25);
  a.show();
 }
}