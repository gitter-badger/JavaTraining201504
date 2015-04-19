package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Parent {

	public String fieldA = "field A";

	public Parent() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Parent no args constructor");
	}

	public Parent(String arg) {
        System.out.println("Parent one arg constructor arg = " + arg);
    }

	/**
	 * デフォルトの処理を親クラスで定義しておく.
	 *
	 * @return
	 */
	public String methodA() {
		return "method A";
	}

    public static String staticMethodA() {
        return "static method A";
    }

}
