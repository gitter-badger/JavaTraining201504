/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven007;
import java.util.Date;
/**
 * @author newenployee7
 *
 */
public class CreateUserID {
	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {
//		 TODO 自動生成されたメソッド・スタブ
		CreateUserID my = new CreateUserID();

		Date today = new Date();
		String userID = my.createUserID(today);
		System.out.println(userID);
	}

	public String createUserID(Date today) {
		// TODO 自動生成されたメソッド・スタブ

		String ID = "";
		ID = today.toString();

		//0123456789012345678901234567
		//Fri Apr 17 14:24:28 JST 2015
		//20150417 に変換したい

		String yyyy = ID.substring(24,28);
		String mm = ID.substring(4,7);
		String dd = ID.substring(8,10);
		String strMonth = mm.replaceAll("Apr", "04");

		String ymd = yyyy+strMonth+dd;
		String strA = ymd.concat("8085");

		return "0"+strA;
	}
}

