package com.class29;
//super recap

public class Parent {

	String str = "Hello";
	int age;

	public Parent(int age) {
		this.age = age;
	}

	public void hello() {
		System.out.println("Hello");
	}

}

class Child extends Parent {

	Child(int age) {
		super(age);
	}

	String str = "Bye";

	public void access() {
		System.out.println(str);
		System.out.println(super.str);

	}

	public void hello() {
		System.out.println("hello");
	}

	public void display() {
		hello();
		super.hello();
	}
}
