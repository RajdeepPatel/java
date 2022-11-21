class Shape 
{
 private int drawColor,fillColor;
 protected int left,top,right,bottom;

 Shape(int left,int top,int right,int bottom)
 {
  this.left=left;
  this.right=right;
  this.top=top;
  this.bottom=bottom;

  System.out.println("Shape-parameerized");
 }

 void setbound(int left,int top,int right,int bottom)
 {
  this.left=left;
  this.right=right;
  this.top=top;
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
 
}

class Circle extends Shape
{
 private int cx,cy,radius;
 
 Circle()
 {
  super(0,0,0,0);
  System.out.println("Circle-default");
 }

 Circle(int cx,int cy,int radius)
 {
  super(cx-radius,cy-radius,cx+radius,cy+radius);
  this.cx=cx;
  this.cy=cy;
  this.radius=radius;
 
  System.out.println("Circle-paramerterised...");
 }

}

class Rectangle extends Shape
{
 private int width,height;

 Rectangle()
 {
  super(0,0,0,0);
  System.out.println("rectangle-default..");
 }

 Rectangle(int x,int y,int width,int height)
 {
  super(x,y,x+width,y+height);
  this.width=width;
  this.height=height;
  System.out.println("rectangle-parameterised..");
 }

}

class SuperCons
{
 public static void main(String...arg)
 {
  System.out.println();
  new Rectangle();
  System.out.println();
  new Circle(100,100,50);
  System.out.println();
 }

}