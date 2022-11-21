import java.util.*;

class ScannerTest
{
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);

  String nam;
  int rno;

  System.out.println();

  System.out.print("Enter Roll no. : ");
  rno = sc.nextInt();

  System.out.print("Enter Name     : ");
  sc.nextLine();
  nam = sc.nextLine();

  System.out.println();

  System.out.println("Roll No. : "+ rno);

  System.out.println("Name     : "+ nam);

  System.out.println();
  
 }
}