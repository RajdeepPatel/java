class Sample
{
 static
 {
  System.out.println("static - 1");
 }
 
 {
  System.out.println("initializer - 1");
 }
 
 Sample()
 {
  System.out.println("default constructor..");
 }
 
 Sample(int n)
 {
  System.out.println("parameterized constructor..");
 }
 
 {
  System.out.println("initializer - 2"); 
 }

 static
 {
  System.out.println("static - 2");
 }
}

class InitializerBlock
{
 public static void main(String args[])
 {
  System.out.println();

  new Sample(10);
 
  System.out.println();

  new Sample(); 
 } 
}