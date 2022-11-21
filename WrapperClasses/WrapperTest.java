class WrapperTest
{
 public static void main(String...arg)
 {
  Integer a,b,c,d;

  a=100;
  b=100;
  c=new Integer(100);
  d=new Integer(100);
  
  System.out.println();
  System.out.println(a==b); /*both a and b reference the same integer object in the integer pool.
                              Integer pool contains pre-defined integer object for the values in the range -128 to 127*/

  System.out.println(c==d); 
  
  System.out.println(a==100);
  System.out.println(c==100); //100 are not Integer object and they are basic type and a and c first they unboxed and then compared

  System.out.println();
  a=128;
  b=128;
  
  System.out.println(a==b);
  System.out.println(a.equals(b));
 
  System.out.println(a.compareTo(b));
 
  a--;
  b=b-1;

  System.out.println(a==b); 
  System.out.println();

 }
}  