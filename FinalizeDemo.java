class Sample
{
 private int sno;

 Sample() {}

 Sample(int sno)
 {
  this.sno = sno;
  System.out.println("constructing object : "+sno);
 }

 protected void finalize()
 {
  System.out.println("destroying object   : "+sno);
 }

 public String toString()
 {
  return sno+"";
 }
}

class FinalizeDemo
{
 public static void main(String arg[])
 {
  Sample a, b, c;

  System.out.println();
  a = new Sample(1);
  new Sample(2);

  int n = 10;

  if(n>5)
  {
   c = new Sample(4);
   Sample d = new Sample(5);
  }

  a = new Sample(6);

  System.out.println("\n end of code \n");
 }
}