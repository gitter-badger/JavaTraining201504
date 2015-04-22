package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Calendar;

public class CalcAgeSeven009 extends SuperCalcAge {

	public CalcAgeSeven009() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
		int ret3=0;

		Calendar now = Calendar.getInstance();

	    int today_y = now.get(Calendar.YEAR);
	    int today_m = now.get(Calendar.MONTH) + 1;
	    int today_d = now.get(Calendar.DATE);

		if(today_m  < m){
			ret3 =today_y - y -1 ;
		}else if (today_m >m){
			ret3 =today_y - y ;
		}else if(today_m == m && today_d >= d){
			ret3 =today_y - y ;
		}else if(today_m == m && today_d < d){
			ret3 =today_y - y -1;
		}return ret3;
	}

}
