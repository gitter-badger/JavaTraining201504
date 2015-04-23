package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven003 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven003() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		boolean isTelNo = false;
		 String regex = "[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";
			isTelNo = input.matches(regex);
		 return isTelNo;
	}

}
