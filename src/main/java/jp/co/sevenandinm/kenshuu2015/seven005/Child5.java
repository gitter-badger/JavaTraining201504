package jp.co.sevenandinm.kenshuu2015.seven005;

public class Child5 extends Parent{


	public String fieldA = "field A in Child4";
	public String fieldB = "field B";


	public Child5(){
		System.out.println("Child no args constructor");
	}

	public String methodA(){
		return "method A in Child4";
	}

	public String methodB(){
		return "method B";
	}
	public static String staticMethodA(){
		return "static method A in Child4";
	}
}
