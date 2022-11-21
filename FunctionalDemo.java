@FunctionalInterface
interface MyMath
{
 boolean isOdd(int n);
}

class MathClass implements MyMath
{
 public boolean isOdd(int x)
 {
  return x%2!=0;
 }
}

class FunctionalDemo
{
 public static void main(String args[])
 {
  MyMath a=new MyMath(){
                        public boolean isOdd(int n)
                        {
                         return n%2!=0;
                        }
                       };

  MyMath f=(m)-> m%2!=0;

  MathClass c=new MathClass();

  System.out.println();
  System.out.println("using class                  : "+c.isOdd(7));
  System.out.println("using anonymous class        : "+a.isOdd(7));
  System.out.println("using functional programming : "+f.isOdd(7));
  System.out.println();
 } 
}  