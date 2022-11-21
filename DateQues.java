import java.util.*;
class DateQues
{
 public static void main(String...arg)
 {
  Date d= new Date();
  //Date e= new Date(2000-1900,11-1,29);
  Date e= new Date("2000/11/29");

  Date x= new Date(d.getTime()- e.getTime());

  int sec= (int)(x.getTime()/1000L);
  int mins= sec/60;
  int hrs= mins/60;
  mins= mins%60;
  int days= hrs/24;
  hrs= hrs%24;
  int y= days/365;
  days= days%365;
  int mon= days/30;
  days = days%30;

  System.out.println();
  System.out.println("Birth Date : "+e);
  System.out.println("\nYears  : "+y);
  System.out.println("Months : "+mon);
  System.out.println("Days   : "+days);
  System.out.println("Hours  : "+hrs);
  System.out.println("Mins   : "+mins);
  System.out.println();
  System.out.printf("Your age : %d years %d months %d days %d hours and %d minutes\n",y,mon,days,hrs,mins);
 }
}