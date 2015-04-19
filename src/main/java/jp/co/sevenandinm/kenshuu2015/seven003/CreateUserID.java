/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven003;

/**
 * @author newemployee3
 *
 */

import java.util.Date;

public class CreateUserID {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CreateUserID my = new CreateUserID();


		Date today = new Date();
		String userID = my.createUserId(today);
		System.out.println(userID);
	}
		public String createUserId(Date today) {

			String strUserId = "";
			strUserId = today.toString();


			//0123456789012345678901234567
			//Fri Apr 17 14:24:28 JST 2015

			//20150417	←これに変換したい

			String yyyy = strUserId.substring(24, 28);
			String mm = strUserId.substring(4, 7);
			String dd = strUserId.substring(8, 10);
			String strMonth = mm.replaceAll("Apr", "04");
			String ymd = yyyy + strMonth + dd;
			String ID = ymd.concat("8085");
            return ID;



         }
}








