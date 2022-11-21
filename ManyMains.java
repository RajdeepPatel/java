class main
{
 public main(String arg)
 {
  System.out.println("constructor - "+arg);
 }

 public static void main(String arg[])
 {
  System.out.println("\nexecutable main..");
  new main("Jaiveer")
 }
}