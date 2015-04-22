package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Calendar;
import java.util.HashMap;

public class CalcAgeSeven006 extends SuperCalcAge {

	public CalcAgeSeven006() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar calendar = Calendar.getInstance();
		int todayYear= calendar.get(Calendar.YEAR);
		int todayMonth =calendar.get(Calendar.MONTH) +1;
		int todayDay = calendar.get(Calendar.DATE);
		int yy =y;
		int mm =m;
		int dd =d;
		int totalDay =0;
		int age=0;

		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		hm.put(1,31);
		hm.put(2,28);
		hm.put(3,31);
		hm.put(4,30);
		hm.put(5,31);
		hm.put(6,30);
		hm.put(7,31);
		hm.put(8,31);
		hm.put(9,30);
		hm.put(10,31);
		hm.put(11,30);
		hm.put(12,31);

		while( !(todayYear==yy && todayMonth == mm && todayDay== dd )){
			dd++;
			totalDay++;
			if( dd > hm.get(mm)){
				mm++;
				dd=1;
			}
			if(m ==mm && d==dd){
				age++;
			}
			if(mm>12){
				yy++;
				mm=1;

				if (yy%4==0 && yy%100!=0 || yy%400==0){
					hm.put(2,29);
				}
				else{
					hm.put(2, 28);
				}

			}
		}
		return age;
	}

}
