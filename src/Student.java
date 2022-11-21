package dmatics;

import java.util.*;

public class Student
{
 private int phy, chem, math;
 private String name;

 public Student()
 {}

 public Student(String name, int phy, int chem, int math)
 {
  this.name=name;
  this.phy=phy;
  this.chem=chem;
  this.math=math;
 }

 
 public Student(Student s)
 {
  name=s.name;
  phy=s.phy;
  chem=s.chem;
  math=s.math;
 }
 
 public void set(String name, int phy, int chem, int math)
 {
  this.name=name;
  this.phy=phy;
  this.chem=chem;
  this.math=math;
 } 

 public void get()
 {
  Scanner sc=new Scanner(System.in);

  System.out.println();
  System.out.print("Name of the Student :");  
  name = sc.nextLine(); 
  System.out.print("Marks in Physics    :");
  phy = sc.nextInt();
  System.out.print("Marks in Chemistry  :");
  chem = sc.nextInt();
  System.out.print("Marks in Maths      :");
  math = sc.nextInt();
 }

 public void print()
 {
  System.out.println();
  System.out.println("Name      : "+name);
  System.out.println("Physics   : "+phy);
  System.out.println("Chemistry : "+chem);
  System.out.println("Maths     : "+math);  
 } 

 public String toString()
 {
  return String.format("%-12s  %3d %3d %3d",name,phy,chem,math);
 }

}  

