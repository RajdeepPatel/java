import java.util.*;
import java.util.stream.*;

class Sorting
{
 public static void main(String Args[])
 {
  int arr[]={25,60,33,15,40,75,20,45,10};

  //Ascending Order Sort
  System.out.println();
  System.out.println("Items in the Array : "+Arrays.toString(arr)+"\n");
  Arrays.sort(arr);
  System.out.println("Ascending Order    : "+Arrays.toString(arr)+"\n");


  //Descending Order Sort

  Integer obj[]={25,60,33,15,40,75,20,45,10};
  Arrays.sort(obj,Collections.reverseOrder());
  System.out.println("Descending Order   : "+Arrays.toString(obj)+"\n");

  Integer tmp[]=new Integer[arr.length];
  for(int i=0;i<arr.length;i++) tmp[i]=arr[i];
  Arrays.sort(tmp,Collections.reverseOrder());
  for(int i=0;i<arr.length;i++) arr[i]=tmp[i];

  System.out.println("Descending Order   : "+Arrays.toString(arr)+"\n");

  List<Integer>lst= Arrays.stream(arr).boxed().collect(Collectors.toList());
  Collections.sort(lst,Collections.reverseOrder());
  arr=lst.stream().mapToInt(i->i).toArray();

  System.out.println("Descending Order   : "+Arrays.toString(arr)+"\n");

  //Distnct
  int x[]={20,45,25,20,40,45,25,20,40};
  int y[]=Arrays.stream(x).distinct().toArray();
  System.out.println(Arrays.toString(y));
  //print by stream (for each)
  System.out.println();
  Arrays.stream(x).boxed().forEach(System.out::println);
    
 }
}
