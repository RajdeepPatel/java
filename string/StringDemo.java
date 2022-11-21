import java.util.*;
class StringDemo
{
 public static void main(String...arg)
 {
  String s="this is his decision";
  int n=countOccurance(s,"is");
  System.out.println(n);
  String a=strUpr("abcd");
  System.out.println(a);
  boolean t=anagrams("pin","nip");
  System.out.println(t);
  pyramid(5);
  t=contains("hello","hello");
  System.out.println(t);
 }

 static int countOccurance(String ms,String ss)
 {
  int cnt=0,i=ms.indexOf(ss);
  while(i!=-1)
  {
   cnt++;
   i=ms.indexOf(ss,i+ss.length()); 
  }
  return cnt;
 }

 static String strUpr(String s)
 {
  char arr[]=s.toCharArray();
  for(int i=0;i<arr.length;i++)
  {
   if(arr[i]>='a'&&arr[i]<='z')
    arr[i]=(char)(arr[i]-32);
  }
  return new String(arr);
 }

 /*anagram(s1,s2)
  anagram=two string are made up os same character but the places may different*/

 static boolean anagrams(String x,String y)
 {
  char a[]=x.toCharArray();
  char b[]=y.toCharArray();
  Arrays.sort(a);
  Arrays.sort(b);

  return new String(a).equals(new String(b));
 }
 
 static void pyramid(int n)
 {
  String spc=new String(new char[n]);
  String ast="*";
  System.out.println();
  for(int i=1;i<=n;i++) 
  {
   spc=spc.substring(0,n-i);
   System.out.println(spc+ast);
   ast=ast+"**";
  }
  System.out.println();
 }
 
 static boolean contains(String ms,String ss)
 {
  for(char c : ss.toCharArray())
  {
   int i=ms.indexOf(c);
   if(i==-1) return false;
   ms=ms.substring(0,1)+ms.substring(i+1);
  }
  return true;
 }
 
}