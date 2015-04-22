package jp.co.sevenandinm.kenshuu2015.seven009;

public class Child5 extends Parent {

	public String fieldA ="field A in Child4";
	public String filedB ="field B";

	public Child5() {
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.println("Child5 no args constructor");
	}

	@Override
	public String methodA(){
			return " method A in Child4";

		}
	public String methodB(){
		return "method B";
	}
	//以下通常はやらない
	public static String staticMethodA(){
		return "static method A in Child4";

	}

}
