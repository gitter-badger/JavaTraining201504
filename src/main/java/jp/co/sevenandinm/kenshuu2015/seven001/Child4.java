package jp.co.sevenandinm.kenshuu2015.seven001;

public class Child4 extends Parent {
	public String fieldA = "field A in Child4"; //親クラスと同一名称のフィールドを定義
	public String fieldB = "field B in Child4";

	public Child4() {
	}
	public String methodA() {
		return "method A in Child4";
	}

	public String methodB() {
		return "method B in Child4";
	}
	 public static String staticMethodA() {
	        return "static method A in Child4";
	    }
}
