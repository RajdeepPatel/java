class Sample
{
 private int n;

 private static int cnt;

 private Sample(int n)
 {
  this.n = n;
 }

 void set(int n)
 {
  this.n = n;
 } 
 
 static Sample getObject()
 {
  Sample s=null;
  if(cnt<3)
  {
   cnt++;
   s= new Sample(cnt);
  }
  return s;
 }
 
 public String toString()
 {
  return n + "";
 } 
}

class LimitedObjects
{
 public static void main(String args[])
 {
  Sample a,b,c,d,e;

  a = Sample.getObject();
  b = Sample.getObject();
  c = Sample.getObject();
  d = Sample.getObject();
  e = Sample.getObject();

  System.out.println();
  System.out.println("a : "+a);
  System.out.println("b : "+b);
  System.out.println("c : "+c);
  System.out.println("d : "+d);
  System.out.println("e : "+e);
  
  System.out.println();
 
 }
}
























