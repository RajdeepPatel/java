import static java.lang.System.*;
import java.util.*;

class JaggedArray
{
 public static void main(String...agrs)
 {
  Scanner sc = new Scanner(System.in);
  out.print("\nEnter the No. of Row[s] : ");
  int r = sc.nextInt();
  int arr[][]=new int[r][];
  for(int i=0; i<r; i++)
  {
   out.printf("\nEnter the No.of Column[s] in Row[%d] : ",i);
   int c = sc.nextInt();
   arr[i]=new int[c];
   for(int j=0; j<c; j++)
   {
    out.printf("\narr[%d][%d] : ",i,j);
    arr[i][j]=sc.nextInt();
   } 
  }
  
  out.println();

  for(int a[] : arr)
  {
   for(int j : a)
    out.printf("%5d",j);
   out.println();
  }
 }

}