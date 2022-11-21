class Sample
{
 int n = 10;
 static int x = 20;

 Sample()
 {
  System.out.println("\nDefault Constructor..");
 }

 Sample(int n)
 {
  System.out.println("\nParameterized constructor..");
  System.out.println("n : "+n);
  System.out.println("x : "+x);
 
  this.n = n;
 }

 static void show()
 {
  System.out.println("\nshow[x] : "+ x);
 }

 static
 {
  System.out.println("\nstatic block..");
  //System.out.println("n : "+n);                   error: non-static variable n cannot be referenced from a static context
  System.out.println("x : "+x);
  x = 200;
 }
}

class StaticBlock
{
 public static void main(String arg[]) throws ClassNotFoundException
 {
  Sample s;              //creating an object reference does not invoke static block
  
  //System.out.println(Sample.x);
  
  //Sample.show();
  
  /*
  Sample.x = 2000;
  System.out.println(Sample.x);
  */

  //s = new Sample(100);
 
  Class.forName("Sample");   //loads the class into the memory
 }
}

























