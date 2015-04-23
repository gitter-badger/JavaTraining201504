package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven008 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven008() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		return input.matches("^\\d{3}-\\d{4}-\\d{4}$");
	}

}
