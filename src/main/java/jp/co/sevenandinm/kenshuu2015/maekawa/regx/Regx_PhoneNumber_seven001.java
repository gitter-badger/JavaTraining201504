package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven001 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven001() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		boolean judge;
//		judge = input.matches("\\d{2}-\\d{4}-\\d{4}");
		judge = input.matches("0\\d{1,4}-\\d{1,4}-\\d{4}");
		return judge;
	}

}
