import java.util.function.BiConsumer;

public class AddingElementToArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4};
	printSum(arr,3,(key,element) -> System.out.println(key+element)); // Here we often get confused as to what names to write inside the 
																	 // lambda paranthesis. The key to remember here is that we are passing a body
																     //to the method, not sending some parameters like we call a method method(1,2)
																	//. Here we are doing something like this. A method(int a,int b) is defined. We are
																	//passing a method body with parameters along with its declaration i.e we make new
//We can similarly do other operations	
	printSum(arr,3,(key,element) -> System.out.println(key*element)); 
	printSum(arr,3,(key,element) -> System.out.println(key/element)); 
	printSum(arr,3,(key,element) -> System.out.println(key-element)); 
}
public static void printSum(int[] arr,int key,BiConsumer<Integer,Integer> bi)
{
	for(int element:arr)
		bi.accept(key, element);
}
}
