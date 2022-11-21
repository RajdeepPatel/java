abstract class Shape
{
 private int drawColor, fillColor;
 protected int left, top, right, bottom;
 
 Shape(int left, int top, int right, int bottom)
 {
  this.left=left;
  this.top=top;
  this.right=right;
  this.bottom=bottom;  

 }

 final void setBounds(int left, int top, int right, int bottom)
 {
  this.left=left;
  this.top=top;
  this.right=right;
  this.bottom=bottom;
 }

 void setDrawColor(int drawColor)
 {
  this.drawColor=drawColor;
 }

 void setFillColor(int fillColor)
 {
  this.fillColor=fillColor;
 }

 abstract public void create();
 abstract protected void show();
 abstract float area();
 abstract float perimeter();
}

class Circle extends Shape
{
 private int cx, cy, radius;

 Circle()
 {
  super(0, 0, 0, 0);
 }

 Circle(int cx,int cy,int radius )
 {
  super(cx-radius, cy-radius, cx+radius, cy+radius);

  this.cx=cx;
  this.cy=cy;
  this.radius=radius;
 }


 //void create()                error: create() in Circle cannot override create() in Shape | default has less privilage than public
 public void create()
 {
  int dx=(right-left)/2;
  int dy=(bottom-top)/2;

  cx=left+dx;
  cy=top+dy;
  radius=dx<dy?dx:dy;

  System.out.println("Circle created..");
 }

 public void show()
 {
  System.out.println("\nShowing Circle..");
 }

 protected float area()
 {
  return (float)(Math.PI*Math.pow(radius,2));
 }

 public float perimeter()
 {
  return(float)(2*Math.PI*radius);
 } 
}

class Rectangle extends Shape
{
 private int width, height;

 Rectangle()
 {
  super(0, 0, 0, 0);  
 }

 Rectangle(int x, int y, int width, int height)
 {
  super(x, y, x+width, y+height);
  this.width=width;
  this.height=height;
 }

 public void create()
 {
  width=right-left;
  height=bottom-top;
 }

 protected void show()
 {
  System.out.println("\nShowing Rectangle..\n");
 }

 float area()
 {
  return width*height; 
 }

 float perimeter()
 {
  return 2*(width+height);
 }
}

class AbstractDemo
{
 public static void main(String args[])
 {
  String shp;
  System.out.print("\nEnter the Shape to draw([R]ectangle/[C]ircle) : ");
  shp=System.console().readLine();

  Shape s=null;                                                      //Shape=s; error: variable s might not have been initialized
  switch(shp)
  {
   case "R":
   case "r": s=new Rectangle();
             break;
   case "C":
   case "c": s=new Circle(100,100,20);
             break;
   default : System.out.println("\nInvalid shape..aborting..\n");
             System.exit(25);
  }

  s.setBounds(100, 100, 150, 130);
  s.setDrawColor(4);
  s.setFillColor(10);

  s.create();                                                               //
  s.show();                                                                //  Dynamic Method Dispatch
  System.out.println("Area      : "+s.area());                            //
  System.out.println("Perimeter : "+s.perimeter());                      //
  System.out.println();
 }
}




























































