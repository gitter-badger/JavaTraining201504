package jp.co.sevenandinm.kenshuu2015.seven007;

public class Child3 extends Parent {

	public String fieldA = "field A in Child"; //親クラスと同一名称のフィールドを定義
	public String fieldB = "field B";

	@Override
	public String methodA() {
		return "method A in Child3";
	}

	public String methodB() {
		return "method B";
	}
}

