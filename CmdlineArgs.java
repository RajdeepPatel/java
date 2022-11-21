class CmdlineArgs
{
 public static void main(String arg[])
 {
  System.out.println();
  System.out.println("No. of Arguments : "+ arg.length);
  
  for(int i=0 ; i<arg.length ; i++)
  {
   System.out.printf("\nArguments #%d : %s", i+1, arg[i]);
  }
  System.out.println();
 }
}