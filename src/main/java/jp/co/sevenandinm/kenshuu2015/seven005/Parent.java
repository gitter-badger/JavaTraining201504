package jp.co.sevenandinm.kenshuu2015.seven005;

public class Parent {

	public String fieldA = "fieldA";

	public Parent(){
		System.out.println("Parent no args constructor");
	}

	public Parent(String arg){
		System.out.println("Parent one arg constructor arg = " + arg);
	}

	public String methodA() {
		return "method A";
	}

	public static String staticMethodA() {
		return "static method A";
	}
}
