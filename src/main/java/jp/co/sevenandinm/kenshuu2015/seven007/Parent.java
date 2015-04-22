package jp.co.sevenandinm.kenshuu2015.seven007;

public class Parent {


	public String fieldA = "field A";

	public Parent() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Parent no args constructor");
	}

	public Parent(String arg) {
	    System.out.println("Parent one arg constructor arg = " + arg);
	}

	public String methodA() {
		return "method A";
	}

	public static String staticMethodA() {
	    return "static method A";
	}
}
