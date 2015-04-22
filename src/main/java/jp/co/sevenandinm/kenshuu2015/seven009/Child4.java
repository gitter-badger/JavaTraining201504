package jp.co.sevenandinm.kenshuu2015.seven009;

public class Child4 extends Parent{


	public String filedA ="filed A in Child4";
	public String filedB ="filed B";

	public Child4() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public String methodA() {
		return "method A in Child4";
	}

	public String methodB() {
		return "method B";
	}

//以下通常はやらないこと
	public static String staticMethodA(){
		return "static method A in Child4";

	}

}
