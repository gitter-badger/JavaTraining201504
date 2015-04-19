package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Child5 extends Parent {

	/**
	 * 通常は、親クラスと同一名のフィールドを子クラスで定義すべきではない
	 */
	public String fieldA = "field A in Child4"; //親クラスと同一名称のフィールドを定義
	public String fieldB = "field B";

	public Child5() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Child5 no args constructor");
	}

	@Override
	public String methodA() {
		return "method A in Child4";
	}

	public String methodB() {
		return "method B";
	}

	/**
	 * 通常はやりません
	 *
	 * @return
	 */
    public static String staticMethodA() {
        return "static method A in Child4";
    }

}
