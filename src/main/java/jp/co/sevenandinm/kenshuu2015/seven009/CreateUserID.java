package jp.co.sevenandinm.kenshuu2015.seven009;

import java.util.Date;


//クラス
public class CreateUserID {

	//メインメソッド…ユーザーＩＤを表示する------------------------------------------
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		CreateUserID my = new CreateUserID();
		Date today = new Date ();
	// userIDは「createUserId」の戻り値
		String userID =my.createUserId(today);


		System.out.println(userID );
	}

	//クラスメソッド「createUserId」引数todayからIDを返す-----------------------------------------
	public String createUserId(Date today){
		String strUserId ="";
		strUserId = today.toString();

		//fri apr 17 14:27:23 jst 2015
		//0123456789012345678901234567890

		String yyyy = strUserId.substring(24, 28);
		String mm = getMonth(strUserId);
		String dd = strUserId.substring(8, 10);
        String ymd = yyyy + mm + dd;
		String ID = ymd.concat("085");
		return ID;
	}

	//クラスメソッド「getMonth」引数strUserIdから月を数字にして返す----------------------------------
	private String getMonth(String strUserId){
		String mm = strUserId.substring(4, 7);
		mm=mm.replaceAll("Jan", "01");
		mm=mm.replaceAll("Feb", "02");
		mm=mm.replaceAll("Mar", "03");
		mm=mm.replaceAll("Apr", "04");
		mm=mm.replaceAll("May", "05");
		mm=mm.replaceAll("Jun", "06");
		mm=mm.replaceAll("Jul", "07");
		mm=mm.replaceAll("Aug", "08");
		mm=mm.replaceAll("Sep", "09");
		mm=mm.replaceAll("Oct", "10");
		mm=mm.replaceAll("Nov", "11");
		mm=mm.replaceAll("Dec", "12");

		return mm;

	}



}
