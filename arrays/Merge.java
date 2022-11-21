//concept of merging is 
//  1. pickup smaller items
//  2. and collection must be sorted

import java.util.*;
import java.util.stream.*;

class Merging
{
 public static void main(String...arg)
 {
  int x[]={25,60,10,30,45,15,30,10,50,30,15,15,27};
  int y[]={20,50,30,12,40,35,30,45,50,30,12,55,12};

  //int z[]=mergeAAA(x,y);
  //int z[]=mergeAAD(x,y);
  //int z[]=mergeADA(x,y);
  //int z[]=mergeADD(x,y);
  //int z[]=mergeDDD(x,y);
  //int z[]=mergeDAD(x,y);
  //int z[]=mergeDDA(x,y);
 
  int z[]=union(x,y);
 
  System.out.println();
  System.out.println("x : "+Arrays.toString(x));
  System.out.println("y : "+Arrays.toString(y));
  System.out.println("z : "+Arrays.toString(z));
  System.out.println();
 }

 static void sortDsc(int arr[])
 {
  List <Integer>lst=Arrays.stream(arr).boxed().collect(Collectors.toList());
  Collections.sort(lst,Collections.reverseOrder());
  int i=0;
  for(int n:lst.stream().mapToInt(x->x).toArray())
   arr[i++]=n;
 }

 static int[] mergeAAA(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);
  
  int z[]=new int[x.length+y.length];
  int i,j,k;
  
  i=j=k=0;
  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    z[k++]=x[i++];
   else
    z[k++]=y[j++];
  }
  while(i<x.length) z[k++]=x[i++];
  while(j<y.length) z[k++]=y[j++];
   
  return z;
 }

 static int[] mergeAAD(int x[],int y[])
 {
  Arrays.sort(x);
  Arrays.sort(y);

  int z[]=new int[x.length + y.length];
  int i,j,k;

  i=j=0;
  k=z.length-1;

  while(i<x.length&&j<y.length)
  {
   if(x[i]<y[j])
    z[k--]=x[i++];
   else
    z[k--]=y[j++];
  }
     
  while(i<x.length) z[k--]=x[i++];
  while(j<y.length) z[k--]=y[j++];
   
  return z;
 } 

 static int[] mergeADA(int x[],int y[])
 {
  Arrays.sort(x);
  sortDsc(y);

  int z[]=new int[x.length + y.length];
  int i,j,k; 
 
  i=0;
  j=y.length-1;
  k=0;

  while(i<x.length&&j>=0)
  {
   if(x[i]<y[j])
    z[k++]=x[i++];
   else
    z[k++]=y[j--];
  }
     
  while(i<x.length) z[k++]=x[i++];
  while(j>=0) z[k++]=y[j--];
   
  return z;
 } 

 static int[] mergeADD(int x[],int y[])
 {
  Arrays.sort(x);
  sortDsc(y);
  
  int z[]=new int[x.length+y.length];
  int i,j,k;
  
  i=0;
  j=y.length-1;
  k=z.length-1;
  while(i<x.length&&j>=0)
  {
   if(x[i]<y[j])
    z[k--]=x[i++];
   else
    z[k--]=y[j--];
  }
  while(i<x.length) z[k--]=x[i++];
  while(j>=0) z[k--]=y[j--];
   
  return z;
 }

 static int[] mergeDDD(int x[],int y[])
 {
  sortDsc(x);
  sortDsc(y);
  
  int z[]=new int[x.length+y.length];
  int i,j,k;
  
  i=x.length-1;
  j=y.length-1; 
  k=z.length-1;
  while(i>=0&&j>=0)
  {
   if(x[i]<y[j])
    z[k--]=x[i--];
   else
    z[k--]=y[j--];
  }
  while(i>=0) z[k--]=x[i--];
  while(j>=0) z[k--]=y[j--];
   
  return z;
 }


 static int[] mergeDAD(int x[],int y[])
 {
  sortDsc(x);
  Arrays.sort(y);
  
  int z[]=new int[x.length+y.length];
  int i,j,k;
  
  i=x.length-1;
  j=0;
  k=z.length-1;

  while(i>=0&&j<y.length)
  {
   if(x[i]<y[j])
    z[k--]=x[i--];
   else
    z[k--]=y[j++];
  }
  while(i>=0) z[k--]=x[i--];
  while(j<y.length) z[k--]=y[j++];
   
  return z;
 }


 static int[] mergeDDA(int x[],int y[])
 {
  sortDsc(x);
  sortDsc(y);
  
  int z[]=new int[x.length+y.length];
  int i,j,k;
  
  i=x.length-1;
  j=y.length-1;
  k=0;

  while(i>=0&&j>=0)
  {
   if(x[i]<y[j])
    z[k++]=x[i--];
   else
    z[k++]=y[j--];
  }
  while(i>=0) z[k++]=x[i--];
  while(j>=0) z[k++]=y[j--];
   
  return z;
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

 static int[] intersection(int x[], int y[])
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
    i++;
   else
   if(y[j]<x[i])
    j++;
   else
   {
    n=x[i++];
    j++;
   } 
   v.add(n);
  }
  
  int z[]=
 }
}