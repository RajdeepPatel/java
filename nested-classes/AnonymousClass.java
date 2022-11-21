abstract class Shape
{
 int length, height;
 Shape(int length, int height)
 {
  this.length=length;
  this.height=height;
 }
 abstract double area();
}

class AnonymousClass
{
 public static void main(String args[])
 {
  Shape s;
  //s=new Shape(2,3);                              object cannot be created of anonymous class

  Shape rectangle=new Shape(10,5){
                                  double area()
                                  {
                                   return length*height;
                                  }
                                 };
  System.out.println(rectangle.area());
 }
}