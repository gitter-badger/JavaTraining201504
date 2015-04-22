package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Date;

public class CalcAgeSeven003 extends SuperCalcAge {

	public CalcAgeSeven003() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
	    //年齢
		Date today = new Date();
		String strUserId = "";
		strUserId = today.toString();
		int ret = 0 ;

		//0123456789012345678901234567
		//Fri Apr 22 14:24:28 JST 2015

		//20150422	←これに変換したい

		String yyyy = strUserId.substring(24, 28);
		String mm = strUserId.substring(4, 7);
		String dd = strUserId.substring(8, 10);


		mm = mm.replaceAll("Jan", "01");
		mm = mm.replaceAll("Feb", "02");
		mm = mm.replaceAll("Mar", "03");
		mm = mm.replaceAll("Apr", "04");
		mm = mm.replaceAll("May", "05");
		mm = mm.replaceAll("Jun", "06");
		mm = mm.replaceAll("Jul", "07");
		mm = mm.replaceAll("Aug", "08");
		mm = mm.replaceAll("Sep", "09");
		mm = mm.replaceAll("Oct", "10");
		mm = mm.replaceAll("Nov", "11");
		mm = mm.replaceAll("Dec", "12");

		int[] int_ymd = {y,m,d};

		int yyyy1 = Integer.parseInt(yyyy);
		int mm1 = Integer.parseInt(mm);
		int dd1 = Integer.parseInt(dd);
		int fin_year = yyyy1 - int_ymd[0];

		if(int_ymd[1] > mm1 || int_ymd[1] == mm1 && int_ymd[2] > dd1){
			int a = fin_year - 1;
			System.out.println("あなたの年齢は" + a + "歳です。");
			ret = a;
		}else{
			System.out.println("あなたの年齢は" + fin_year + "歳です。");
			ret = fin_year;
		}

		return ret;
	}

}
