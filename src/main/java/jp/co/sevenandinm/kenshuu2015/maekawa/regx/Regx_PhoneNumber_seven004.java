package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven004 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven004() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		String pattern = "^[0-9][0-9]+-[0-9][0-9][0-9][0-9]+-[0-9][0-9][0-9][0-9]+$";
		return input.matches(pattern);
	}

}
