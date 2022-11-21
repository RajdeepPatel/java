import java.util.*;
import java.util.stream.*;

class UnoinIntersection
{
 public static void main(String...args)
 {
  int x[]={40,25,10,44,20,10,30,25,20,44,15,20};
  int y[]={60,27,30,25,10,30,44,50,44,25,60,25};
  int z[];

  //z=union(x,y);
    z=Intersection(x,y);

  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 }
 
  static int[] union(int x[],int y[])
 {
  x=Arrays.stream(x).distinct().toArray();
  y=Arrays.stream(y).distinct().toArray();

  Vector <Integer> v=new Vector<>();

  Arrays.sort(x);
  Arrays.sort(y);

  int i=0,j=0;
  int n;  
  while(i<x.length&&j<y.length)
  {

   if(x[i]<y[j])
    n=x[i++];
   else
   if(y[j]<x[i])
    n=y[j++];
   else
   {
    n=x[i++];
    j++;
   } 
   v.add(n);
  }
  
  while(i<x.length) v.add(x[i++]);
  while(j<y.length) v.add(y[j++]);

  int z[]=new int[v.size()];
  for(i=0;i<z.length;i++)
   z[i]=v.get(i);
  
  return z;
 }

 static int[] Intersection(int x[], int y[])
 {
  int a[]=Arrays.stream(x).distinct().toArray();
  int b[]=Arrays.stream(y).distinct().toArray();

  Arrays.sort(a);
  Arrays.sort(b);

  Vector<Integer> v=new Vector<>();

  Arrays.sort(x);
  Arrays.sort(y);

  int i=0,j=0;
  int n;  
  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    n=x[i++];
   else
   if(y[j]<x[i])
    n=y[j++];
   else
   {
    n=x[i++];
    j++;
   } 
   v.add(n);
  }
  
  int z[]= new int[v.size()];
  for(i=0;i<z.length;i++)
   z[i]=v.get(i);
  
  return z;
 }
}