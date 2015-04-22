package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import java.util.Calendar;

public class CalcAgeSeven010 extends SuperCalcAge {

	public CalcAgeSeven010() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getAgeByCalc(int y, int m, int d) {
		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("execute:");
		int age = 0;
		// ------------------------------------ edit start
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
//		cal_current.set(2014,7,24);// 経過した場合のテスト用:8月は7
		cal_current.clear(Calendar.HOUR);
		cal_current.clear(Calendar.MINUTE);
		cal_current.clear(Calendar.SECOND);
		cal_current.clear(Calendar.MILLISECOND);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(y,(m-1),d);
		// 現在の年の日付を得る。
		Calendar cal_target2 = Calendar.getInstance();
		cal_target2.set(y,(m-1),d);
		cal_target2.set(Calendar.YEAR,cal_current.get(Calendar.YEAR));// 年だけ現在の年にしてみる。
		cal_target2.clear(Calendar.HOUR);
		cal_target2.clear(Calendar.MINUTE);
		cal_target2.clear(Calendar.SECOND);
		cal_target2.clear(Calendar.MILLISECOND);
		System.out.println("今年の誕生日は？" + cal_target2.get(Calendar.YEAR) + "/"
				+ (cal_target2.get(Calendar.MONTH) + 1) + "/" + cal_target2.get(Calendar.DATE));
		// その日付と現在時刻を比較する。
		// cal_current＜cal_target2であるかを比較する
		// 実は時間まで比較してしまう。
		boolean isBefore = cal_current.before(cal_target2);
		boolean isAfter = cal_current.after(cal_target2);

		if(isBefore){
			System.out.println("isBefore：今年の誕生日はまだです。");
			age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR) - 1 ;
//		}else if(isAfter){
//			System.out.println("isAfter");
//			//そのまま引き算
//			age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR) ;
		}else{
			System.out.println("same date");
			age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR) ;
		}
		// ------------------------------------ edit end
		return age;

	}

}
