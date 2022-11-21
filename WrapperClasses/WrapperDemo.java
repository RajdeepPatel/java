import static java.lang.Math.*;

class WrapperDemo
{
 public static void main(String...arg)
 {
  System.out.println();
  System.out.println("Type              :"+Float.TYPE);
  System.out.println("size              :"+Float.SIZE);
  System.out.println("Negative Infinity :"+Float.NEGATIVE_INFINITY);
  System.out.println("Positive Infinity :"+Float.POSITIVE_INFINITY);
  System.out.println("Max value         :"+Float.MAX_VALUE);
  System.out.println("Min Value         :"+Float.MIN_VALUE);
  System.out.println("Not a Number      :"+Float.NaN);
  System.out.println();
  float x=1.5f/0;
  if(x==Float.POSITIVE_INFINITY)
  {
   System.out.println("x is infinite :"+x);
  }
  System.out.println();
  System.out.println("0.0/0.0     :"+(0.0/0.0));
  System.out.println("inf/inf     :"+(x/x));
  System.out.println("sqrt of -ve :"+sqrt(-10));
  System.out.println();

  Float f=130.75f;
  byte b;
  int i;
  float n;
  
  b=f.byteValue();
  i=f.intValue();
  n=f.floatValue();
  
  System.out.println("b :"+b);
  System.out.println("i :"+i);
  System.out.println("n :"+n);
  System.out.println();
 }
}	