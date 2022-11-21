import java.util.*;
import java.text.*;

class BookReturn
{
 public static void main(String...arg)
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("\nEnter Book Issue Date  : ");
  String issue= sc.nextLine();
  Date i;

  try
  {
   SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/y");
   sdf.setLenient(false);

   i= sdf.parse(issue);
   Date c= new Date();
   System.out.println("\nDate of Returning Book : "+sdf.format(c));
 
   Date x= new Date(c.getTime()-i.getTime());
   int day= (int)(x.getTime()/(1000*60*60*24));
   day = day-14;
   int fine=0; 
   if(day>=1)
   {
    fine= 10*day;
    System.out.println("\nTotal Fine (Rs.10/Day) : Rs."+fine);
   }
   else
   {
    System.out.println("\nNo Fine : Book returned on-time..");
   }
  }
  catch(ParseException e)
  {
   System.err.println("\ninvalid date - "+issue+"\n");
   i=null;
  }
 }
}