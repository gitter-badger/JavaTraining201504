/**
 * 年齢の計算クラス
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.astro;

import java.util.Calendar;


/**
 * 年齢の計算クラス
 * @author teacher4
 *
 */
public class CalcAge {

	/**
	 * 動作確認用メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CalcAge my = new CalcAge();
		int age = 0;
		int[] ymd = {1991,8,24};

		for(int i = 0 ; i < 100 ; i++){
			age = my.execute_withBag(ymd[0],ymd[1],ymd[2]);
//			System.out.println(age);
			// check
			if(age == 22){
				System.out.println("22 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;
			}
		}
//		age = my.execute_matsumoto(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//		age = my.execute_kimoto(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//		age = my.execute_yamaguchi(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//		age = my.execute_shiomi(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//		age = my.execute_koshigoe(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//		age = my.execute_withBag(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//
//		age = my.execute_kuriki(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//
//		age = my.execute(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);
//
//		age = my.execute2(ymd[0],ymd[1],ymd[2]);
//		System.out.println(age);



	}

	/**
	 * 年齢を計算する。
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute(int year,int month,int day) {
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
		cal_target.set(year,(month-1),day);
		// 現在の年の日付を得る。
		Calendar cal_target2 = Calendar.getInstance();
		cal_target2.set(year,(month-1),day);
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

	/**
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute_kuriki(int year, int month, int day) {
		System.out.println("execute_kuriki:");
		int age = 0;
		// ------------------------------------ edit start

		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);// 経過した場合のテスト用
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(year, (month - 1), day);

		age = cal_current.get(Calendar.YEAR)
				- cal_target.get(Calendar.YEAR);


		if (cal_current.get(Calendar.MONTH) < cal_target.get(Calendar.MONTH)) {
			age -= 1;

		} else if (cal_current .get(Calendar.DAY_OF_MONTH) < cal_target.get(Calendar.DAY_OF_MONTH)){
			age -= 1;
		}
			System.out.println("年齢は、" + age + "歳です");

		// ------------------------------------ edit end
		return age;
	}

	/**
	 * 年齢を計算する。
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute_withBag(int year,int month,int day) {
		System.out.println("execute_withBag:");
		int age = 0;
		// ------------------------------------ edit start
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);// 経過した場合のテスト用:8月は7
//		cal_current.clear(Calendar.HOUR);
//		cal_current.clear(Calendar.MINUTE);
//		cal_current.clear(Calendar.SECOND);
//		cal_current.clear(Calendar.MILLISECOND);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(year,(month-1),day);
		// 現在の年の日付を得る。
		Calendar cal_target2 = Calendar.getInstance();
		cal_target2.set(year,(month-1),day);
		cal_target2.set(Calendar.YEAR,cal_current.get(Calendar.YEAR));// 年だけ現在の年にしてみる。
//		cal_target2.clear(Calendar.HOUR);
//		cal_target2.clear(Calendar.MINUTE);
//		cal_target2.clear(Calendar.SECOND);
//		cal_target2.clear(Calendar.MILLISECOND);
		System.out.println(cal_target2.get(Calendar.YEAR) + "/"
				+ (cal_target2.get(Calendar.MONTH) + 1) + "/" + cal_target2.get(Calendar.DATE));
		// その日付と現在時刻を比較する。
		// cal_current＜cal_target2であるかを比較する
		// 実は時間まで比較してしまう。
		boolean isBefore = cal_current.before(cal_target2);
		boolean isAfter = cal_current.after(cal_target2);

		if(isBefore){
			System.out.println("isBefore");
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

	/**
	 * 年齢を計算する。
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute2(int year,int month,int day) {
		System.out.println("execute2:");
		int age = 0;
		// ------------------------------------ edit start
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);// 経過した場合のテスト用:8月は7
//		cal_current.clear(Calendar.HOUR);
//		cal_current.clear(Calendar.MINUTE);
//		cal_current.clear(Calendar.SECOND);
//		cal_current.clear(Calendar.MILLISECOND);
		Calendar cal_target = (Calendar)cal_current.clone(); // 1991/8/24
		cal_target.set(year,(month-1),day);
		// 現在の年の日付を得る。
		Calendar cal_target2 = (Calendar)cal_current.clone();
		cal_target2.set(year,(month-1),day);
		cal_target2.set(Calendar.YEAR,cal_current.get(Calendar.YEAR));// 年だけ現在の年にしてみる。
//		cal_target2.clear(Calendar.HOUR);
//		cal_target2.clear(Calendar.MINUTE);
//		cal_target2.clear(Calendar.SECOND);
//		cal_target2.clear(Calendar.MILLISECOND);
		System.out.println(cal_target2.get(Calendar.YEAR) + "/"
				+ (cal_target2.get(Calendar.MONTH) + 1) + "/" + cal_target2.get(Calendar.DATE));
		// その日付と現在時刻を比較する。
		// cal_current＜cal_target2であるかを比較する
		// 実は時間まで比較してしまう。
		boolean isBefore = cal_current.before(cal_target2);
		boolean isAfter = cal_current.after(cal_target2);

		if(isBefore){
			System.out.println("isBefore");
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

	/**
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute_koshigoe(int year, int month, int day) {
		// ------------------------------------ edit start
//		System.out.println("execute_koshigoe:");
		int age = 0;
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		Calendar cal_dummy = Calendar.getInstance();

		cal_target.set(year, (month - 1), day);
		cal_dummy.set(cal_current.get(Calendar.YEAR), month, day);
		boolean b = cal_target.after(cal_dummy);// dummyのが大きい
		if (b == true) {
			cal_target.set((cal_target.get(Calendar.YEAR) - 1), month, day);
			age = (cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR));
		} else {
			age = (cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR));
		}
		// ------------------------------------ edit end
		return age;
	}

	/**
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int execute_shiomi(int year, int month, int day) {
		int age = 0;
		// ------------------------------------ edit start
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(year, (month - 1), day);

		//年齢の計算
		age = cal_current.get(cal_current.YEAR) - cal_target.get(cal_target.YEAR);

		//誕生日が来ているか判定
		//同じ月で日付を超えていなければ１歳引く
		if (cal_current.get(cal_current.MONTH) == cal_target.get(cal_target.MONTH) &&
				cal_current.get(cal_current.DATE) < cal_target.get(cal_target.DATE)){
			age = age - 1;}
		//月を超えていなければ１歳引く
		else if  (cal_current.get(cal_current.MONTH) < cal_target.get(cal_target.MONTH)) {
			age = age - 1 ;
		}

		// ------------------------------------ edit end
		return age;
	}

	public int execute_yamaguchi(int year, int month, int day) {
		int age = 0;
		// ------------------------------------ edit start
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(year, (month - 1), day);

		age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR);

		if (cal_current.get(Calendar.MONTH) < cal_target.get(Calendar.MONTH)) {
			age--;
		} else if (cal_current.get(Calendar.DAY_OF_MONTH) < cal_target.get(Calendar.DAY_OF_MONTH)) {
			age--;
			return age;
		}

		// ------------------------------------ edit end
		return age;
	}

	public int execute_kimoto(int year, int month, int day) {

		// ------------------------------------ edit start

		int age = 0;// 最終的な OUTPUT 用の変数
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
		cal_current.set(2014,7,24);
		Calendar cal_target = Calendar.getInstance(); // 1991/8/24
		cal_target.set(year, (month - 1), day);

		age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR);
		if (cal_current.get(Calendar.MONTH) < cal_target.get(Calendar.MONTH)) {
			age -= 1;
		}
		if (cal_current.get(Calendar.MONTH) == cal_target.get(Calendar.MONTH)) {
			if (cal_current.get(Calendar.DAY_OF_MONTH) < cal_target.get(Calendar.DAY_OF_MONTH)) {
				age -= 1;
			}
			if (cal_current.get(Calendar.DAY_OF_MONTH) >= cal_target.get(Calendar.DAY_OF_MONTH)) {
				age -= 0;
			}
		}
		return age;
	}

	public int execute_matsumoto(int year,int month,int day) {

		int age = 0;// 最終的な OUTPUT 用の変数

        Calendar cal1_current = Calendar.getInstance();// 2014/04/11
        cal1_current.set(2014,7,24);
        Calendar cal2_target = Calendar.getInstance(); // 1991/8/24
        cal2_target.set(year,(month-1),day);

	    age = cal1_current.get(Calendar.YEAR) - cal2_target.get(Calendar.YEAR);

	    if (cal1_current.get(Calendar.MONTH) < cal2_target.get(Calendar.MONTH)) {
			age -= 1;
		} else if(cal1_current.get(Calendar.DAY_OF_MONTH) < cal2_target.get(Calendar.DAY_OF_MONTH)){
				age -= 1;
		}

		System.out.println(age);

		return age;
	}

}
