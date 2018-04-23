/*
The parallel stream is 10 times faster than normal sequential streams 
*/


import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {
public static void main(String[] args) {
  List<Integer> l=new ArrayList<Integer>();
  for(int i=0;i<100000;i++)
    l.add(i);
  
  long t1=System.currentTimeMillis();
  l.stream().forEach(s-> Math.pow(s, s));
  long t2=System.currentTimeMillis();
  System.out.println("Sequential Operation ends at "+(t2-t1));
  
  long t3=System.currentTimeMillis();
  l.parallelStream().forEach(s->  Math.pow(s, s));
  long t4=System.currentTimeMillis();
  System.out.println("Parallel Operation ends at "+(t4-t3));
}
}
