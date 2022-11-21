import java.util.*;
import java.text.SimpleDateFormat;

class SDFDemo
{
 public static void main(String...args)
 {
  SimpleDateFormat sdf= new SimpleDateFormat("EEEE MMMM d, y");

  Date d= new Date();

  System.out.println("\n"+sdf.format(d)+"\n");      //returns String while parse take input as string and give date as output
 }
}

//BookReturn.java
//issue date : dd/mm/yyyy
//return date : curr date
//fine @Rs10/day :