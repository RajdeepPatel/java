import java.text.*;
import java.util.*;

class ParsingDate
{
 public static void main(String...arg)
 {
  System.out.print("\nEnter Date (dd/mm/ccyy) : ");
  String s=System.console().readLine();
  Date d;
  try
  {
   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/y");
   sdf.setLenient(false);
   d=sdf.parse(s);
  }
  catch(ParseException e)
  {
   System.err.println("\ninvalid date - "+s+"\n");
   d=null;
  }
 
  System.out.println("\nd : "+d);
 }
}