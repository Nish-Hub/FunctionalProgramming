import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamOperations {
public static void main(String[] args) {

	List<Integer> l=new ArrayList<Integer>();
	  for(int i=0;i<1000;i++)
	    l.add(i);
	 
	//Iterating over the int stream and finding the minimum in the list using a lambda expression for the comparator interface  
	l.stream().min((v, k) -> v - k).get();

	//Building an int stream and then applying filter terminal operations 
	IntStream.of(1, 2, 3, 4).filter(e -> e > 2).peek(e -> System.out.println("Filtered value: " + e))
			.map(e -> e * e).peek(e -> System.out.println("Mapped value: " + e))
			.forEach(p -> System.out.println(p));
}
}
