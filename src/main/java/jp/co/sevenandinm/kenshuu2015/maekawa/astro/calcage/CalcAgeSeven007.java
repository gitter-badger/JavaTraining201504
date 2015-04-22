package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Date;

public class CalcAgeSeven007 extends SuperCalcAge {

	public CalcAgeSeven007() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
		//年齢表示のプログラム
		Date date = new Date();
		String ID = date.toString();
		String yyyy = ID.substring(24,28);
		String mm = ID.substring(4,7);
		String dd = ID.substring(8,10);
		mm = mm.replaceAll("Jan", "01");
		mm = mm.replaceAll("Feb", "02");
		mm = mm.replaceAll("Mar", "03");
		mm = mm.replaceAll("Apr", "04");
		mm = mm.replaceAll("May", "05");
		mm = mm.replaceAll("Jul", "07");
		mm = mm.replaceAll("Aug", "08");
		mm = mm.replaceAll("Sep", "09");
		mm = mm.replaceAll("Oct", "10");
		mm = mm.replaceAll("Nov", "11");
		mm = mm.replaceAll("Dec", "12");

		int int_mm = Integer.parseInt(mm);
		int int_year = Integer.parseInt(yyyy);
		int int_day = Integer.parseInt(dd);
		int cal_year = int_year - y;

		int ret = 0;
		if( m > int_mm || m == int_mm && d > int_day){
			int fin_year =  cal_year - 1;
			System.out.println("年齢は" +  fin_year+"歳です。");
			ret = fin_year;
		}else {
			System.out.println("年齢は" +  cal_year+"歳です。");
			ret = cal_year;
		}

		return ret;


	}

}
