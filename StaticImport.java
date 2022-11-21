import static java.lang.System.*;
import static java.lang.Math.*;

class StaticImport
{
 public static void main(String arg[])
 {
  out.println("\nusing out without System..");
  System.out.println("\nusing out with System..");
  out.println("\nSqr. Root of 10 : "+sqrt(10));       //Math.sqrt(10)
  exit(0);                                            //System.exit(0)

  err.println("\nunreachable code..");
 }
}