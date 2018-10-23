package com.github.app;

public class App {

	public void addedMethod(){
		System.out.println("Welcome to new method");
	public static void add(String str) {

		if (str.length() > 5) {
			System.out.println("Hello " + str);
		} else {
			System.out.println("Hi " + str);
		}
		if (str.equals(Constant.DATA_TYPE)) {
			System.out.println("Exact Strings");
		}
	}

	public static void main(String[] args) {

		System.out.println("Hello World!");
		add("ZEESHAN");
	}

}
