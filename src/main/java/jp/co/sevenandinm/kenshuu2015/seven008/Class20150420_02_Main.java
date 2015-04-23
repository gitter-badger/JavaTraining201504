package jp.co.sevenandinm.kenshuu2015.seven008;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Class20150420_02_Main{
	Class20150420_02_Main(){

	}


	//メインメソッド
	public static void main(String[] args) {
	Class20150420_02_Main my = new Class20150420_02_Main();
	Date today = new Date();

	//入力画面
	System.out.println("生年月日を入力してください");
	Scanner stdIn = new Scanner(System.in);
	System.out.print("年：");
	int int_year =stdIn.nextInt();
	System.out.print("月：");
	int int_month = stdIn.nextInt();
	System.out.print("日：");
	int int_day = stdIn.nextInt();


	//星座ステップ①
	Class20150420_02_Class01Aries aries = new Class20150420_02_Class01Aries();
	Class20150420_02_Class02Taurus taurus = new Class20150420_02_Class02Taurus();
	Class20150420_02_Class03Gemini gemini = new Class20150420_02_Class03Gemini();
	Class20150420_02_Class04Cancer cancer = new Class20150420_02_Class04Cancer();
	Class20150420_02_Class05Leo leo = new Class20150420_02_Class05Leo();
	Class20150420_02_Class06Virgo virgo = new Class20150420_02_Class06Virgo();
	Class20150420_02_Class07Libra libra = new Class20150420_02_Class07Libra();
	Class20150420_02_Class08Scorpio scorpio = new Class20150420_02_Class08Scorpio();
	Class20150420_02_Class09Sagittarius sagittarius = new Class20150420_02_Class09Sagittarius();
	Class20150420_02_Class10Capricorn capricom = new Class20150420_02_Class10Capricorn();
	Class20150420_02_Class11Aquarius aquarius = new Class20150420_02_Class11Aquarius();
	Class20150420_02_Class12Pisces pisces = new Class20150420_02_Class12Pisces();

	Class20150420_02_Constellation[] constellation =
		{aries,taurus,gemini,cancer,leo,virgo,libra,scorpio,sagittarius,capricom,aquarius,pisces};


	//星座ステップ②（完成）
	for(int i = 0;i < constellation.length ; i++){
		if((int_month == constellation[i].getStart_month() && int_day >= constellation[i].getStart_day())
		||(int_month == constellation[i].getEnd_month() && int_day <= constellation[i].getEnd_day() ) ){
			System.out.println("あなたの星座は" + constellation[i].getJapanese_name() + "です") ;
		}
	}

	//干支ステップ
	my.etoMethod(int_year);

	//年齢ステップ
	my.ageMethod(int_year, int_month, int_day);


	//日数ステップ
	my.ageCalMethod(int_year, int_month, int_day);
	}

	//日数メソッド
	private void ageCalMethod(int int_year,int int_month, int int_day) {
		Calendar now = Calendar.getInstance(); //現在の日付
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(int_year,int_month,int_day);

		int int_now_time = now.get(Calendar.DAY_OF_MONTH);
		int int_birth_time =birthDay.get(Calendar.DAY_OF_MONTH);
		int int_day_time = 0;

		for(int i = birthDay.get(Calendar.YEAR);i < now.get(Calendar.YEAR);i++){
			int_day_time = int_day_time + birthDay.get(Calendar.DAY_OF_MONTH);
		}
		//System.out.println(int_day_time);
		//System.out.println(int_now_time);
		//System.out.println(int_birth_time);
	}

	//年齢計算メソッド①
	private void ageMethod(int int_year, int int_month, int int_day) {
		int_month = int_month -1;
		Calendar now = Calendar.getInstance(); //現在の日付
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(int_year,int_month,int_day);

		int age = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
//		System.out.println("if手前のAGE：" + age);


		if(now.get(Calendar.MONTH) == birthDay.get(Calendar.MONTH)){
//			System.out.println("メソッドを抜ける前のAGE：" + age);
			age = int_dayCal(now,birthDay,age);
//			System.out.println("メソッドを抜けた後のAGE：" + age);
		}else if(now.get(Calendar.MONTH) < birthDay.get(Calendar.MONTH)){
			age = age - 1;
		}

		if(age < 0){
			System.out.println("エラー：あなたはまだ生まれていません" + age);
		}else{
			System.out.println("あなたの年齢は" + age + "歳です");
		}

//		System.out.println();
//		System.out.println("now.get(Calendar.MONTH)：" + now.get(Calendar.MONTH));
//		System.out.println("birthDay.get(Calendar.MONTH)：" + birthDay.get(Calendar.MONTH));
//		System.out.println("now.get(Calendar.DAY_OF_MONTH)：)" + now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("birthDay.get(Calendar.DAY_OF_MONTH)：)" + birthDay.get(Calendar.DAY_OF_MONTH));
	}

	//年齢計算メソッド②
	private int int_dayCal(Calendar now ,Calendar birthDay, int age) {
			if(now.get(Calendar.DAY_OF_MONTH) < birthDay.get(Calendar.DAY_OF_MONTH)){
				age = age - 1;
//				System.out.println("★");
			}else{
//				System.out.println("★★★");
			}

		return age;
	}


	//干支を計算するメソッド
	private void etoMethod(int int_year) {
		// TODO 自動生成されたメソッド・スタブ
		String eto[] = {"子", "丑", "寅", "卯", "辰", "巳","午", "未", "申", "酉", "戌", "亥"};
		int i = (int_year + 8) % 12;
		System.out.println("あなたの干支は" + eto[i] + "です");
	}

}
