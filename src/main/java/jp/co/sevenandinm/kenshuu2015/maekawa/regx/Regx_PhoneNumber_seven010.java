package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven010 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven010() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		// TODO 自動生成されたメソッド・スタブ
		boolean isTelNo = false;
		String  regex =   "(0\\d0-(\\d{4})-(\\d{4}))";
				regex += "|(0(\\d{1})-(\\d{4})-(\\d{4}))";
				regex += "|(0(\\d{2})-(\\d{3})-(\\d{4}))";
				regex += "|(0(\\d{3})-(\\d{2})-(\\d{4}))";

		isTelNo = input.matches(regex);
		return isTelNo;
	}

}
