import java.util.*;
class SBDemo
{
 public static void main(String...arg)
 {
  pyramid(5);
  String str="abcmalayalamxyxmalexykminitini";
  String s[]=getPalindromes(str);
  for(int i=0;i<s.length;i++)
   System.out.println(s[i]);
 
  String a=longestPalindrome(str);
   System.out.println(a);
 }

 static void pyramid(int n)
 {
  StringBuffer spc=new StringBuffer(n);
  
  spc.setLength(n);
  String ast="*";
  
  for(int i=1;i<=n;i++)
  {
   spc.deleteCharAt(0);
   System.out.println(spc+ast);
   ast=ast+"**";
  }
  System.out.println();
 }

 static String[] getPalindromes(String str)
 {
  Vector<String> vct=new Vector<>();
  int i=0;
  while(i<str.length())
  {
   int j=str.lastIndexOf(str.charAt(i));
    while(j>i)
    {
     String s=str.substring(i,j+1);
     String r=new StringBuffer(s).reverse().toString();
     if(s.equals(r))
     { 
      vct.add(s);
      i=j;
     }
    else
    j=str.lastIndexOf(str.charAt(i),j-1);
   }
  i++;
  }
 String arr[]=new String[vct.size()];
  for(i=0;i<vct.size();i++)
   arr[i]=vct.get(i);

  return arr;
 }

 static String longestPalindrome(String str)
 {
  String p="";
  int i=0;
  while(i<str.length()) 
  {
   int j=str.lastIndexOf(str.charAt(i));
   while(j>1 && j-i>p.length())
   { 
   String s=str.substring(i,j+1);
   String r=new StringBuffer(s).reverse().toString();
   if(s.equals(r))
   {
    p=s;
    break;
   }
   else
    j=str.lastIndexOf(str.charAt(i),j-1);
   }
   i++;
  }
  if(p.length()>0)
   return p;
  
   return null;
 }
} 
 