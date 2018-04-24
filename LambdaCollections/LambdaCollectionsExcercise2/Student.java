package com.code.LambdaStreams;

public class Student {
int marks;
boolean status;
String name;
public Student(int marks,String name,boolean status) {
this.marks=marks;
this.name=name;
this.status=status;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [Name : "+name+"  Marks : "+marks+" Active : "+status+" ]";
	}
}
