package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven006 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven006() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		String tel244="[0-9]{2}-[0-9]{4}-[0-9]{4}|";
		String tel424="[0-9]{4}-[0-9]{2}-[0-9]{4}|";
		String tel334="[0-9]{3}-[0-9]{3}-[0-9]{4}";
		return input.matches(tel244+tel424+tel334);
	}

}
