package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.Date;
import java.util.HashMap;
public class CreateUserID {

	private static final String String = null;

	private int renban = 0;

	static CreateUserID my=new CreateUserID();
	public static void main(String[] args) {

		System.out.println("登録年月日８桁と通し番号を入力して下さい");
	    Date today=new Date();
	    String userID= my.getUserId(today);
	    System.out.println(userID);
	}

	/**
	 * userIdを返却する機能
	 */
	public String getUserId(Date today){
	String strUserId="";
    strUserId=today.toString();

	//Fri Apr 17 14:05:04 JST 2015

	String yyyy=strUserId.substring(24,(24+4));
    String mm =getMonth(strUserId);
    String dd =strUserId.substring(8,10);
	return yyyy + mm + dd;

	//20150417

}


	private String getMonth(String strUserId) {
		HashMap<String,String> hm=new HashMap<String,String>();

		String mm1 = strUserId.substring(4,7);

		hm.put("Apr","04");
		hm.put("May","05");
		hm.put("Jun","06");
		hm.put("Jul","07");
		hm.put("Aug","08");
		hm.put("Sep","09");
		hm.put("Oct","10");
		hm.put("Nov","11");
		hm.put("Dec","12");
		String mm = hm.get(mm1);
		return mm;

	}
}
