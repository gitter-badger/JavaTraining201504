/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven008;

/**
 * @author newemployee8
 *
 */


import java.util.Date;
public class Class20150417_02 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class20150417_02 my = new Class20150417_02();

		Date today = new Date();
		String str_Code = "085";

		String userID = my.getUserID(today);
		String userID_Plus = my.getUserID_Plus(userID,str_Code);
		String userID_Module = my.getModule(userID_Plus);

		System.out.println(userID_Module);
	}

	public String getUserID(Date today){
		String strUserId = "";
		strUserId = today.toString();
		String yyyy = strUserId.substring(24,(24 + 4) );
		String mm = getMonth(strUserId);
		String dd = strUserId.substring(8, (8 + 2));


		strUserId = yyyy + mm + dd;

		System.out.println(strUserId);

		return strUserId;
	}

	public String getMonth(String strUserId) {
		String mm1 = strUserId.substring(4, 4 + 3);
		String mm2 = mm1.replaceAll("Apr", "04");
		return mm2;
	}

	public String getUserID_Plus(String userID , String userCODE) {
		String userID_1 = userID.substring(0,1);
		String userID_2 = userID.substring(1,2);
		String userID_3 = userID.substring(2,3);
		String userID_4 = userID.substring(3,4);
		String userID_5 = userID.substring(4,5);
		String userID_6 = userID.substring(5,6);
		String userID_7 = userID.substring(6,7);
		String userID_8 = userID.substring(7,8);
		String userID_9 = userCODE.substring(0,1);
		String userID_10 = userCODE.substring(1,2);
		String userID_11 = userCODE.substring(2,3);


		String userID_Total = "0" + userID_6 + userID_10 + userID_3 + userID_5 + userID_4 + userID_8 + userID_2
				+ userID_11 + userID_7 + userID_9 + userID_1 ;
		System.out.println(userID_Total);
		return userID_Total;
	}

	public String getModule(String userID_Plus) {
		int userID_G_1 = Integer.parseInt(userID_Plus.substring(0,1));
		int userID_K_1 = Integer.parseInt(userID_Plus.substring(1,2));
		int userID_G_2 = Integer.parseInt(userID_Plus.substring(2,3));
		int userID_K_2 = Integer.parseInt(userID_Plus.substring(3,4));
		int userID_G_3 = Integer.parseInt(userID_Plus.substring(4,5));
		int userID_K_3 = Integer.parseInt(userID_Plus.substring(5,6));
		int userID_G_4 = Integer.parseInt(userID_Plus.substring(6,7));
		int userID_K_4 = Integer.parseInt(userID_Plus.substring(7,8));
		int userID_G_5 = Integer.parseInt(userID_Plus.substring(8,9));
		int userID_K_5 = Integer.parseInt(userID_Plus.substring(9,10));
		int userID_G_6 = Integer.parseInt(userID_Plus.substring(10,11));
		int userID_K_6 = Integer.parseInt(userID_Plus.substring(11,12));

		int userID_K_Total = (userID_K_1 + userID_K_2 + userID_K_3 + userID_K_4 + userID_K_5 + userID_K_6) * 3;
		int userID_G_Total =userID_G_1 + userID_G_2 + userID_G_3 + userID_G_4 + userID_G_5 + userID_G_6;
		int userID_Total = userID_K_Total + userID_G_Total;
		String str_userID_Total = String.valueOf(userID_Total);
		int userID_Total_Plus = Integer.parseInt(str_userID_Total.substring(1,2));
		int userID_Final = 10 - userID_Total_Plus;
		String str_userID_Final = userID_Plus + String.valueOf(userID_Final);



		return str_userID_Final;
	}
}
