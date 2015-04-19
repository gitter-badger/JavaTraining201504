package jp.co.sevenandinm.kenshuu2015.maekawa;

import java.util.Date;
import java.util.HashMap;

/**
 * UserID発行するためのクラス
 *
 * @author newemployee10
 *
 */
public class CreateUserID {

	// menber field ----------------------------
	private int renban = 0;
	private Date today = null;

	// member method ---------------------------
	/**
	 * ユーザIDを生成する.
	 *
	 * @return ユーザID
	 */
	public String createUserId() {

		this.renban++;
		this.today = new Date();

		// 20150417
		return createUserId(today,renban);
	}

	/**
	 * usridを返却する機能.
	 *
	 * @param today
	 * @param renban
	 * @return ユーザID
	 */
	public String createUserId(Date today,int renban) {

//		this.renban++;

		// TODO 自動生成されたメソッド・スタブ
		String strUserId = "";
		strUserId = today.toString();
		// 0123456789012345678901234567890
		// Fri Apr 17 14:05:04 JST 2015
		// 20150417
		String yyyy = strUserId.substring(24, 28);
		String mm = getMonth2(strUserId);
		String dd = strUserId.substring(8, 10);

		// 20150417
		String strRenban = String.format("%03d", renban);
		return yyyy + mm + dd + strRenban;
	}

	/**
	 * 月の表示変換.
	 *
	 * @param strUserId
	 * @return
	 */
	private String getMonth2(String strUserId) {
		String mm = strUserId.substring(4, 7);
//		System.out.println(mm);

		// やりかた２
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Jan", "01");
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
		hm.put("Dec", "12");

		mm = mm.replaceAll(mm, hm.get(mm));

		return mm;
	}

	private String getMonth1(String strUserId) {
		String mm = strUserId.substring(4, 7);
//		System.out.println(mm);
		// やりかた１
		mm = mm.replaceAll("Jan", "01");System.out.println(mm);
		mm = mm.replaceAll("Feb", "02");System.out.println(mm);
		mm = mm.replaceAll("Mar", "03");System.out.println(mm);
		mm = mm.replaceAll("Apr", "04");System.out.println(mm);
		mm = mm.replaceAll("May", "05");System.out.println(mm);
		mm = mm.replaceAll("Jun", "06");System.out.println(mm);
		mm = mm.replaceAll("Jul", "07");System.out.println(mm);
		mm = mm.replaceAll("Aug", "08");System.out.println(mm);
		mm = mm.replaceAll("Sep", "09");System.out.println(mm);
		mm = mm.replaceAll("Oct", "10");System.out.println(mm);
		mm = mm.replaceAll("Nov", "11");System.out.println(mm);
		mm = mm.replaceAll("Dec", "12");System.out.println(mm);

		return mm;
	}


}
