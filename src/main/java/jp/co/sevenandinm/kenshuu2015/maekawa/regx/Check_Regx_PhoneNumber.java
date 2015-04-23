package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import java.util.ArrayList;

public class Check_Regx_PhoneNumber {

	public Check_Regx_PhoneNumber() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check_Regx_PhoneNumber my = new Check_Regx_PhoneNumber();
		my.execute();
	}

	/**
	 * 動作確認用メソッド.
	 * 電話番号リスト.
	 *
	 */
	private void execute() {
		// TODO 自動生成されたメソッド・スタブ

		String[] strTmps = {
				"03-1234-5678",
				"042-345-6789",
				"0425-36-8456",
				"080-6641-8560",
				};

		for (String strTmp : strTmps) {
			System.out.println("◆" + strTmp);
			subExecute(strTmp);
		}
	}

	/**
	 * 動作確認用メソッド.
	 * アルゴリズムのポリモルフィズム.
	 *
	 * @param strTmp
	 */
	private void subExecute(String strTmp) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Super_Regx_PhoneNumber> logic_list = new ArrayList<Super_Regx_PhoneNumber>();
		logic_list.add(new Regx_PhoneNumber_seven001());
		logic_list.add(new Regx_PhoneNumber_seven002());
		logic_list.add(new Regx_PhoneNumber_seven003());
		logic_list.add(new Regx_PhoneNumber_seven004());
		logic_list.add(new Regx_PhoneNumber_seven005());
		logic_list.add(new Regx_PhoneNumber_seven006());
		logic_list.add(new Regx_PhoneNumber_seven007());
		logic_list.add(new Regx_PhoneNumber_seven008());
		logic_list.add(new Regx_PhoneNumber_seven009());
		logic_list.add(new Regx_PhoneNumber_seven010());

		for (Super_Regx_PhoneNumber logic : logic_list) {
			boolean ret = logic.execute(strTmp);
			System.out.println("◇" + logic.getClass().toString());
			if (ret) {
				System.out.println("入力された値[" + strTmp + "]は、OK !");

			} else {
				System.out.println("入力された値[" + strTmp + "]は、NG !!!");
			}

		}
	}

}
