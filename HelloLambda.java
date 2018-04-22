/*
An intro to lambda function in java
*/

import java.util.function.Function;

public class HelloLambda {
public static void main(String[] args) {
  //int x=0;
  //x -> x + 1;
  Function<Integer,Integer> add1 = x -> x + 1;
  Function<String,String> concat = x -> x + 1;
  System.out.println(add1.apply(2));
  System.out.println(concat.apply("Lambda is No : "));
  
  Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y;
  Function<Integer,Integer> add2 = makeAdder.apply(1);
  System.out.println("makeaddr with add2 is "+add2.apply(3));

}
}
 class Utils {

     public static Integer add1(Integer x) { return x + 1; }

     public static String concat1(String x) { return x + 1; }
     Function<Integer,Integer> add1 = Utils::add1;  // add1 method used as a reference 

     Function<String,String> concat1 = Utils::concat1;
     
     public static Function<Integer, Integer> adder(Integer x) {

         return y -> x + y;

      }
     Function<Integer, Function<Integer,Integer>> makeAdder = Utils::adder;

     Function<Integer,Integer> add2 = makeAdder.apply(1);
  }
