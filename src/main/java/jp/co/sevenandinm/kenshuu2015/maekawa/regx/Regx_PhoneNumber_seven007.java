package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven007 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven007() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		return input.matches("[0-9]{2,4}-[0-9]{3,4}-[0-9]{4}");
	}

}
