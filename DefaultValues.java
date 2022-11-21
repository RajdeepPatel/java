class DefaultValues
{
 int n;
 float f;
 char c;
 boolean b;
 String s;

 void show()
 {
  System.out.println();
  System.out.println("n : |"+n+"|");
  System.out.println("f : |"+f+"|");
  System.out.println("c : |"+c+"|");
  System.out.println("b : |"+b+"|");
  System.out.println("s : |"+s+"|");

  //int x;
  //System.out.println(x);

 }
 public static void main(String...arg)
 {
  new DefaultValues().show();
 }
}