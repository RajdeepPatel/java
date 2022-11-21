import java.util.Scanner;

class ScannerDemo
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);

  String nam;
  int age;
  float bas;

  System.out.println();

  System.out.print("Enter Name  : ");
  nam = sc.next();

  System.out.print("Enter age   : ");
  while(!sc.hasNextInt())
  {
   nam = nam + " " + sc.next();
  }
  age = sc.nextInt();

  System.out.print("Enter basic : ");
  bas = sc.nextFloat();

  System.out.println();
  System.out.println("Name  : "+nam);
  System.out.println("Age   : "+age);
  System.out.println("Basic : "+bas);
  System.out.println(); 
 }
}