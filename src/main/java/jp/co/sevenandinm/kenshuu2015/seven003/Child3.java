package jp.co.sevenandinm.kenshuu2015.seven003;

public class Child3 extends Parent {

	/**
	 * 通常は、親クラスと同一名のフィールドを子クラスで定義すべきではない
	 */
	public String fieldA = "field A in Child"; //親クラスと同一名称のフィールドを定義
	public String fieldB = "field B";

	public Child3() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public String methodA() {
		return "method A in Child3";
	}

	public String methodB() {
		return "method B";
	}

}