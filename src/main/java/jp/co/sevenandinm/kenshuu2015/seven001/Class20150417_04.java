package jp.co.sevenandinm.kenshuu2015.seven001;
import java.util.Date;
public class Class20150417_04 {

	public static void main(String[] args) {
		Class20150417_04 my = new Class20150417_04();
		//Date関数で
		Date today = new Date();
		System.out.println(today);

		//0123456789012345678901234567890
		//Fri Apr 17 14:20:45 JST 2015

		String userID = my.getUserID(today);

		int renban = 0;

	}
	public String getUserID(Date today){
		String strUserId = "";
		strUserId = today.toString();    //Data型をString型に変える
		String yyyy = strUserId.substring(24,(24 + 4) );    //数値を抽出
		String mm = getMonth(strUserId);					//月を数値化
		String dd = strUserId.substring(8, (8 + 2));		//数値を抽出
		String ymd = yyyy + mm + dd ;
		String Id = ymd.concat("085");
		return Id;
	}

	public String getMonth(String strUserId) {
		String mm = strUserId.substring(4, 4 + 3);
				 mm = mm.replaceAll("January", "01");
				 mm = mm.replaceAll("February", "02");
				 mm = mm.replaceAll("March", "03");
				 mm = mm.replaceAll("April", "04");
				 mm = mm.replaceAll("May", "05");
				 mm = mm.replaceAll("June", "06");
				 mm = mm.replaceAll("July", "07");
				 mm = mm.replaceAll("August", "08");
				 mm = mm.replaceAll("September", "09");
				 mm = mm.replaceAll("October", "10");
				 mm = mm.replaceAll("November", "11");
				 mm = mm.replaceAll("December", "12");

		return mm;
}
}
