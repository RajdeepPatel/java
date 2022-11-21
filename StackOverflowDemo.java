class Sample
{
 private int n;
 //private Sample s = new Sample();
 private static Sample s = new Sample(); 

 Sample()
 {
  n = 0;
  System.out.println("Object created..");
 } 
}

class StackOverflowDemo
{
 public static void main(String[] arg)
 {
  System.out.println();
  new Sample();
 }
}
