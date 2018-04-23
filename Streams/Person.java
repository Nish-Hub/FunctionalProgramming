package com.code.lambdaInCollections;

public class Person implements Comparable<Person>{

String firstName;
String lastName;
int age;
Person(String firstName,String lastName,int age)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.age=age;
}
Person()
{
	this("Default","Default",10);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Person o) {
	return this.lastName.compareTo(o.lastName);
}
@Override
	public String toString() {
		return firstName+" "+lastName+" aged "+age;
	}
}
