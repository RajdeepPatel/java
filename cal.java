import java.text.*;
import java.util.*;

class cal
{
 public static void main(String...arg)
 {
  SimpleDateFormat sdf=new SimpleDateFormat("dd MMM y");
  sdf.setLenient(false);

  Date d=new Date();
  d=new Date(d.getYear(),d.getMonth(),1); 

  try
  {
   if(arg.length==1)
   {
    d=sdf.parse("01 "+arg[0]+" "+(new Date().getYear()+1900));
   }
   else
   if(arg.length==2)
   { 
    d=sdf.parse("01 "+arg[0]+" "+arg[1]);
   }
  }
  catch(ParseException e)
  {
   System.err.println("\ninvalid argument..\n");
   System.exit(1);
  } 

  String hm=new SimpleDateFormat("MMMM y").format(d);
  String hw="Sun Mon Tue Wed Thu Fri Sat";
  
  int m,y;
  m=d.getMonth()+1;
  y=d.getYear()+1900;

  int tot=28;
  if(m==2)
  {
   if(y%4==0&&y%100!=0||y%400==0)
    tot++;
  }
  else
  if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
   tot+=3;
  else
   tot+=2;  
  
  int w=d.getDay(); 
  StringBuffer spc=new StringBuffer();
  spc.setLength((27-hm.length())/2);
  System.out.println("\n\n\t"+spc+hm);
  System.out.println("\n\t"+hw);
  spc=new StringBuffer();
  spc.setLength(4*w);

  System.out.print("\t"+spc);

  for(int i=1;i<=tot;i++,w++)
  {
   System.out.printf("%3d ",i);
   if(w==6)
   {
    System.out.printf("\n\t");
    w=-1;
   }
  }  
    
  System.out.println();
 }
}