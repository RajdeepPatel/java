interface Message
{
 void show(String m);
}

class AnonymousDemo
{
 public static void main(String args[])
 {
  Message m;
  //m=new Message();                                      interface cannot be instantiated
 
  m=new Message(){
                  public void show(String s)
                  {
                   System.out.println(s);
                  }
                 };
  m.show("Hi There !");
 }
}