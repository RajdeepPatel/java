import java.util.*;
import java.time.*;
import java.time.format.*;

class BookIssue
{
 public static void main(String...arg)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter date");
  String d=sc.nextLine();
  
  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/y");
  try
  {
   LocalDate di=LocalDate.parse(d,fmt);
   LocalDate dr=di.plusDays(15);
   System.out.println(di);
   System.out.println(dr);
  }
  catch(DateTimeParseException e)
  {
   System.out.println(e); 
  }
   
 }
}