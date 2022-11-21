class SystemDemo
{
 public static void main(String arg[])
 {
  System.out.println();
  System.out.println("O/S     : "+ System.getenv("os"));
  System.out.println("Path    : "+ System.getenv("path"));
  System.out.println("Ver     : "+ System.getProperty("java.version"));
  System.out.println("Run Ver : "+ System.getProperty("java.runtime.version"));
  System.out.println("Ven     : "+ System.getProperty("java.vendor"));
  System.out.println("Ven URL : "+ System.getProperty("java.vendor.url"));
  System.out.println("Home    : "+ System.getProperty("java.home"));
  System.out.println("Vm Nam  : "+ System.getProperty("java.vm.nam"));
  System.out.println("Vm Ver  : "+ System.getProperty("java.vm.name"));
  System.out.println("Com     : "+ System.getProperty("java.compliler"));
  System.out.println("Os Nam  : "+ System.getProperty("os.name"));
  System.out.println("Os Arc  : "+ System.getProperty("os.arch"));
  System.out.println("Os Ver  : "+ System.getProperty("os.version"));
  System.out.println();
 }
}