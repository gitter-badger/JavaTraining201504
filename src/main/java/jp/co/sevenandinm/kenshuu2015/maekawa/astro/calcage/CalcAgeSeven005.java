package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Date;
import java.util.HashMap;

public class CalcAgeSeven005 extends SuperCalcAge {

	public CalcAgeSeven005() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
		Date today = new Date();
		String age_real = "";
		age_real = today.toString();
		int ret = 0 ;

		String yyyy = age_real.substring(24, 28);
		String mm = getMonth(age_real);
		String dd = age_real.substring(8, 10);

		int int_yyyy = Integer.parseInt(yyyy);
		int int_mm = Integer.parseInt(mm);
		int int_dd = Integer.parseInt(dd);


		if(m > int_mm){
			ret =int_yyyy - y-1;
		}else if(m < int_mm){
			ret = int_yyyy - y;
		}else if(d < int_dd){
			ret = int_yyyy - y;
		}else if(d > int_dd){
			ret = int_yyyy - y -1;
		}else{
			ret = int_yyyy - y;
		}

		return ret;

	}

	private String getMonth(String mmm){
		HashMap<String, String> hm = new HashMap<String, String>();
		String mm1 = mmm.substring(4, 7);
		hm.put("Jar", "01");
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
		String mm = hm.get(mm1);

		return mm;
	}


}
