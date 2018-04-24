package com.code.LambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageCalculatorStream {
public static void main(String[] args) {
	List<Student> students=Arrays.asList(
			new Student(40,"Arnold",true),
			new Student(55,"Harold",false),
			new Student(65,"John",true),
			new Student(34,"Joe",true)
			);
	
	double avg=students.stream()
	.filter(p -> p.isStatus()==true)
	.mapToDouble(p -> p.getMarks())
	.average().getAsDouble();
	
	System.out.printf("Average of students is %4.2f",avg);
}
}
