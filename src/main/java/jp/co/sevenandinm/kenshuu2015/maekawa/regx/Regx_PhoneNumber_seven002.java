package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven002 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven002() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		return input.matches("^0\\d{1,2}-\\d{1,4}-\\d{4}$");
	}

}
