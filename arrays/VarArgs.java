class VarArgs
{
 static int sum(int...arg)
 {
  int s=0;
  for(int i : arg)
    s=s+i;
  return s;
 }

 public static void main(String...args)
 {
  int x[]={1,2,3,4,5};
  System.out.println();
  System.out.println(sum(x));
  System.out.println(sum(1,2,3,4,5,6,7,8));
  System.out.println(sum(new int []{10,20,30,40}));
  System.out.println(sum(100,200,300,400));
  System.out.println();
 }
}