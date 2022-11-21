import java.util.*;

class PascalTriangle
{
 public static void main(String...args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("\nEnter the No. of Rows to print : ");
  int n = sc.nextInt();
 
  int p[][]=new int[n][];
  for(int i=0; i<n; i++)
  {
   p[i]=new int[i+1];
   p[i][0]=p[i][i]=1;
   for(int j=1; j<i; j++)
     p[i][j]=p[i-1][j-1]+p[i-1][j];
  }

  System.out.println();
 
  for(int row[] : p)
  {
   for(int c : row)
    System.out.printf("%5d",c);
   System.out.println();
  }
 }
}