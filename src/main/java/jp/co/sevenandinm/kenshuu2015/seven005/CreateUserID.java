package jp.co.sevenandinm.kenshuu2015.seven005;

import java.util.Date;
import java.util.HashMap;

//クラス名
public class CreateUserID {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		CreateUserID my = new CreateUserID();
		Date today = new Date();
		String userID = my.createUserId(today);
		System.out.println(userID + "085");


	}
	//012345678901234567890123456789
	//Fri Apr 17 14:20:45 JST 2015
	//userIdを返却するメソッド
	public String createUserId(Date today) {


		// TODO 自動生成さたメソッド・スタブ
		String strUserId = "";
		strUserId = today.toString();

		String yyyy = strUserId.substring(24, 28);
		String mm = getMonth(strUserId);
		String dd = strUserId.substring(8, 10);

		return yyyy + mm + dd ;
	}


	//つきの表示変換
	private String getMonth(String strUserId) {
		HashMap<String, String> hm = new HashMap<String, String>();

		String mm1 = strUserId.substring(4, 7);
		hm.put("Jar", "01");
		hm.put("Feb", "02");
		hm.put("Mar", "03");
		hm.put("Apr", "04");
		hm.put("May", "05");
		hm.put("Jun", "06");
		hm.put("Jul", "07");
		hm.put("Aug", "08");
		hm.put("Sep", "09");
		hm.put("Oct", "10");
		hm.put("Nov", "11");
		String mm = hm.get(mm1);

		return mm;
	}

}
