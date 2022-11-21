import java.util.*;
class Distint
{
 public static void main(String...args)
 {
  int x[]={20,45,25,20,40,45,25,20,40};
  int y[]=Arrays.stream(x).distinct().toArray();
  Arrays.stream(y).boxed().forEach(System.out::println);
 }
}