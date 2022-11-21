class TypePromotion
{
 public static void main(String arg[])
 {
  byte x,y,z;
  //x=200;     //invalid.. possibly lossy conversion

  x=20;
  y=21;

  //z=x+y;     //invalid.. possibly lossy conversion

  z=(byte)(x+y);
  
  System.out.println();
  
  System.out.println();
  System.out.println(x+y);
 
  System.out.println("x+y : "+x+y);

  System.out.println("x+y ; "+(x+y)); 

  System.out.println(y-x);
  System.out.println("y-x : "+y-x);

  System.out.println("y-x : "+(y-x));
  System.out.println();

 }
}