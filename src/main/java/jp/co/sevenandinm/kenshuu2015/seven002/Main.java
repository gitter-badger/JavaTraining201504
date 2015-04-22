package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main my = new Main();

		System.out.println("生年月日を入力してください");

		Scanner stdIn = new Scanner(System.in);
		int int_year = stdIn.nextInt();
		int int_month = stdIn.nextInt();
		int int_day = stdIn.nextInt();

		Ohituzi_za ohituzi_za = new Ohituzi_za();
		Ousi_za ousi_za = new Ousi_za();
		Hutago_za hutago_za = new Hutago_za();
		Kani_za kani_za = new Kani_za();
		Sisi_za sisi_za = new Sisi_za();
		Otome_za otome_za = new Otome_za();
		Tenbin_za tenbin_za = new Tenbin_za();
		Sasori_za sasori_za = new Sasori_za();
		Ite_za ite_za = new Ite_za();
		Yagi_za yagi_za = new Yagi_za();
		Mizugame_za mizugame_za = new Mizugame_za();
		Uo_za uo_za = new Uo_za();

		Constellation constellation[] = { ohituzi_za, ousi_za, hutago_za,
				kani_za, sisi_za, otome_za, tenbin_za, sasori_za, ite_za,
				yagi_za, mizugame_za, uo_za };
		//
		for (int i = 0; i < constellation.length; i++) {
			if ((int_month == constellation[i].getStart_month() && int_day >= constellation[i]
					.getEnd_day())
					|| (int_month == constellation[i].getEnd_month() && int_day <= constellation[i]
							.getEnd_day())) {

				System.out.println(constellation[i].getJapanese_name());

			}

		}
		// 十二支表示プロセス
		String eto[] = { "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌",
				"亥" };
		int i1 = (int_year + 8) % 12;
		System.out.println(eto[i1]);

		my.getAge(int_year, int_month, int_day);

	}

	private int getAge(int int_year, int int_month, int int_day) {
		Calendar now = Calendar.getInstance();
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(int_year, int_month, int_day);
		int age = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);

		if (now.get(Calendar.MONTH) == birthDay.get(Calendar.MONTH)){

			age = age - 1;

		} else if (now.get(Calendar.MONTH) < birthDay.get(Calendar.MONTH)) { {

			if (now.get(Calendar.DAY_OF_MONTH) < birthDay.get(Calendar.DAY_OF_MONTH)) {
				age = age - 1;

			}
		}
		if (age > 0) {
			System.out.println(age);
		} else if(age == 0){
			System.out.println("0");
		}else{
			System.out.println("生まれてない");



	}




	}
		return age;
	}
}


// my.execute01();
// my.execute02();
// my.execute03();
// my.execute04();
// my.execute05();
// my.execute06();
// my.execute07();
// my.execute08();
// my.execute09();
// my.execute10();
// my.execute11();
// my.execute12();
//
// }
// private void execute01(){
//
//
// Ohituzi_za ohituzi_za = new Ohituzi_za();
// System.out.println(ohituzi_za.getJapanese_name());
//
//
//
//
// }
//
// private void execute02(){
// Ousi_za ousi_za = new Ousi_za();
// System.out.println(ousi_za.getJapanese_name());
//
// }
//
// private void execute03(){
//
// Hutago_za hutago_za = new Hutago_za();
// System.out.println(hutago_za.getJapanese_name());
//
// }
//
// private void execute04(){
// Kani_za kani_za = new Kani_za();
// System.out.println(kani_za.getJapanese_name());
//
// }
//
// private void execute05(){
// Sisi_za sisi_za = new Sisi_za();
// System.out.println(sisi_za.getJapanese_name());
//
//
// }
//
// private void execute06(){
// Otome_za otome_za = new Otome_za();
// System.out.println(otome_za.getJapanese_name());
//
// }
//
// private void execute07(){
// Tenbin_za tenbin_za = new Tenbin_za();
// System.out.println(tenbin_za.getJapanese_name());
//
//
// }
//
// private void execute08(){
// Sasori_za sasori_za = new Sasori_za();
// System.out.println(sasori_za.getJapanese_name());
//
//
// }
//
// private void execute09(){
// Ite_za ite_za = new Ite_za();
// System.out.println(ite_za.getJapanese_name());
//
//
// }
//
// private void execute10(){
// Yagi_za yagi_za = new Yagi_za();
// System.out.println(yagi_za.getJapanese_name());
//
//
// }
//
// private void execute11(){
// Mizugame_za mizugame_za = new Mizugame_za();
// System.out.println(mizugame_za.getJapanese_name());
//
//
// }
//
// private void execute12(){
// Uo_za uo_za = new Uo_za();
// System.out.println(uo_za.getJapanese_name());
//
//
// }
