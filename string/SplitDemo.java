class SplitDemo
{
 public static void main(String...arg)
 {
  String x="   This    is   a string   ";
  String y="This is a String";
  String str[]=x.split(" ");

  for(int i=0;i<str.length;i++)
  {
   System.out.printf("\nToken #%2d :%s",i+1,str[i]);
  }
  System.out.println("\n\n");
  
  str=y.split(" ");
  for(int i=0;i<str.length;i++)
  {
   System.out.printf("\nToken #%2d :%s",i+1,str[i]);
  }
 
 }
}