class ArrayTest
{
 int a[],b;
 int []c,d,e[]/*,[]f*/;
 int x[][][]={{{1}}};
 int y[][][]={{{1,2,3},{4,5}},{{6}}};
  
 void show()
 {
  System.out.println();
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println();

  System.out.println(x.length);
  System.out.println(x[0].length);
  //System.out.println(x[1].length);
  System.out.println(x[0][0].length);
  //System.out.println(x[0][0][0].length);

  System.out.println();
  System.out.println(y.length);
 }

 public static void main(String...args)
 {
  new ArrayTest().show();
 }
}