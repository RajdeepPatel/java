import java.io.*;

class Login
{
 public static void main(String[] args) throws IOException
 {
  String log, pas;

  System.out.println();
  System.out.print("Enter Login-Id : ");
  log= System.console().readLine();

  System.out.print("Enter Password : ");
  pas= new String(System.console().readPassword()); //return object of console class

  if(log.equals("rajdeep") && pas.equals("dmatics"))
  {
   System.out.println();
   System.out.println("Login-Id : "+log);
   System.out.println("Password : "+pas);
   System.out.println();
   System.out.println("O/S   : "+System.getenv("os"));
   System.out.println("Path  : "+System.getenv("path"));
   System.out.println();
   System.out.println("Version      : "+System.getProperty("java.version"));
   System.out.println("Vendor       : "+System.getProperty("java.vendor"));
   System.out.println("Home         : "+System.getProperty("java.home"));
   System.out.println("Compiler     : "+System.getProperty("java.compiler"));
   System.out.println("Name         : "+System.getProperty("java.name"));
   System.out.println("Architecture : "+System.getProperty("java.arch"));
   System.out.println("VM Name      : "+System.getProperty("java.vm.name"));
   System.out.println("VM Vendor    : "+System.getProperty("java.vm.vendor"));
   System.out.println("VM Version   : "+System.getProperty("java.vm.version"));
   System.out.println();
  }
  else
  {
   System.err.println("\nInvalid Login-Id or Password..\n");
   System.err.println("System Shutdown initiated..\n");
   Runtime r= Runtime.getRuntime();
   r.exec("shutdown /s /t 3");
 //System.exit(3);
  }

//System.out.println("\nEnd of Code..\n");
 }
}