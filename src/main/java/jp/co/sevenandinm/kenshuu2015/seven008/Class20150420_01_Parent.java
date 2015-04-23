package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150420_01_Parent {
	public String fieldA = "field A";

	public Class20150420_01_Parent() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Parent no args constructor");
	}

	public Class20150420_01_Parent(String arg) {
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
