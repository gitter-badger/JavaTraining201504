package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

public class Regx_PhoneNumber_seven006 extends Super_Regx_PhoneNumber {

	public Regx_PhoneNumber_seven006() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public boolean execute(String input) {
		String tel244="^0\\d-\\d{4}-\\d{4}";
		String tel424="^0\\d{3}-\\d{2}-\\d{4}";
		String tel334="^0\\d{2}-\\d{3}-\\d{4}";
		String telphone="^0\\d0-\\d{4}-\\d{4}";
		return input.matches(tel244+"|"+tel424+"|"+tel334+"|"+telphone);
	}

}
