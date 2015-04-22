package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
public class Call {
	public Call(){

	}

	//mainのメソッド
	public static void main(String[] args){
		Call my = new Call();
		my.name01();
		my.age02();
		my.seiza03(0, 0);
		my.eto04(0);
		my.numday05(0, 0, 0);
	}

	//nameを入力
	private void name01(){
		System.out.println("これから星座占いを行います");
		System.out.println("お名前を教えてください。");
		Scanner stdIn = new Scanner (System.in);
		String name = stdIn.nextLine();
		System.out.println("こんにちは、 " + name + "さん^^");
	}

	//年齢を求め、情報を得る
	private void age02(){
		ageMethod();
	}

	//必要な情報
	private void ageMethod(){
		System.out.println("では、まず生年月日を教えてください");
		System.out.println("例 → 1992年5月1日なら19920501と入力してください");
		Scanner stdIn_a = new Scanner (System.in);
		String age = stdIn_a.nextLine();

		//年齢の情報を得る
		//System.out.println(age);
		//1992 05 01
		//0123 45 689


		//Stringで取った情報を部分で切り取る(年)
		String str_yy = age.substring(0, 4);
		//System.out.println(str_yy);

		//Stringで取った情報を部分で切り取る(月)
		String str_mm = age.substring(4, 6);
		//System.out.println(str_mm);

		//Stringで取った情報を部分で切り取る(日)
		String str_dd = age.substring(6, 8);
		//System.out.println(str_dd);


		//Stringを計算で使うので、intに変換(年、月、日)
		int int_yy = Integer.parseInt(str_yy);
		int int_mm = Integer.parseInt(str_mm);
		int int_dd = Integer.parseInt(str_dd);

		//age1のメソッドへの引数を渡して、age1で求めた数値がここに戻ってくるところ
		int age_a = age1(int_yy, int_mm, int_dd);
		//ここで年齢を出力
		System.out.println("あなたの年齢は"+age_a + "才です");

		//seiza03のメソッドへの引数を渡して、seiza03で求めた数値がここに戻ってくるところ
		String seiza_a = seiza03(int_mm,int_dd);
		//ここで星座を出力
		System.out.println("あなたの星座は"+ seiza_a + "です");

		//eto04のメソッドへの引数を渡して、eto04で求めた数値がここに戻ってくるところ
		char eto_1 = eto04(int_yy);
		//ここで干支を出力
		System.out.println("あなたの干支は" + eto_1 + "です");

		int numday_a = numday05(int_yy, int_mm, int_dd);
		System.out.println("あなたが生まれてから、今日までの経過日数は" + numday_a +" 日です!!");
	}


	//年齢			ここは、↓ageMethodで得た情報を引数として持ってきている
	private int age1(int yyyy1,int mm1, int dd1){
		//今日の日付をここで生成
		Date today = new Date();
		String age_real = "";
		//Dateだから、Stringに変換させる
		age_real = today.toString();

		//戻り値をまずは設定しておく
		int ret = 0 ;

		//ここで、Stringに戻した日付で年、月、日を取り出す
		//System.out.println(age_real);
		//Wed Apr 22 11:38:11 JST 2015
		//0123456789012345678901234567
		String yyyy = age_real.substring(24, 28);
		//System.out.println(yyyy);

		//日付は、英語で表喫されるから、異なるメソッドで英語を数値に戻す
		String mm = getMonth(age_real);
		//System.out.println(mm);
		String dd = age_real.substring(8, 10);
		//System.out.println(dd);


		//取り出したものを計算するためにintに戻す
		int int_yyyy = Integer.parseInt(yyyy);
		int int_mm = Integer.parseInt(mm);
		int int_dd = Integer.parseInt(dd);

		//年齢の計算
		if(mm1 > int_mm){
			ret =int_yyyy - yyyy1-1;
		}else if(mm1 < int_mm){
			ret = int_yyyy - yyyy1;
		}else if(dd1 < int_dd){
			ret = int_yyyy - yyyy1;
		}else if(dd1 > int_dd){
			ret = int_yyyy - yyyy1 -1;
		}else{
			ret = int_yyyy - yyyy1;
		}
		return ret;
	}

	//英語の月を数値に変換
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

	//星座を求める	　　　ここで、ageMethodから、星座を求めるために必要な月と日を引数として持ってくる
	private String seiza03(int mm,int dd ){
			String ret = "";
			//Constellationという型に新しい配列を１２個生成する
			Constellation[] seiza = new Constellation[12];
			seiza[0] = new Aries();
			seiza[1] = new Taurus();
			seiza[2] = new Gemini();
			seiza[3] = new Cnacer();
			seiza[4] = new Leo();
			seiza[5] = new Virgo();
			seiza[6] = new Libra();
			seiza[7] = new Scorpio();
			seiza[8] = new Sagittarius();
			seiza[9] = new Capricorn();
			seiza[10] = new Aquarius();
			seiza[11] = new Pisces();

			//ここで、forを使ってConstellationの配列をぐるぐる回す
			//for(要素型　任意の変数名 : 配列変数名)
			for(Constellation element : seiza){

				//elementという変数名に星座の始まる月日、終わる月日をそれぞれの変数に取り込む
				int startMonth = element.getStartMonth();
				int startDay = element.getStartDay();
				int endMonth = element.getEndMonth();
				int endDay = element.getEndDay();

				//if文で、その星座の名前を持ってくる
				if(mm == startMonth  &&  dd >= startDay){
					ret = element.getJapanesename();
				}else if(mm == endMonth &&  dd <= endDay){
					ret = element.getJapanesename();
				}
			}

			return ret;
		}

	private char eto04(int yyyy){

		char eto_a[] ={'申','酉','戌','亥','子','丑','寅','卯','辰','巳','午','未'};
		int eto_b =yyyy%12;
		char eto_c = eto_a[eto_b];


		return eto_c;
	}

	private int numday05(int yyyy1,int mm1, int dd1){
		int ret = 0 ;
		Calendar real = Calendar.getInstance();

		int real_yyyy = real.get(Calendar.YEAR);
		int real_mm = real.get(Calendar.MONTH ) + 1;
		int real_dd = real.get(Calendar.DATE);

		//System.out.println(real_yyyy);
		//System.out.println(real_mm);
		//System.out.println(real_dd);

		int by_today = 0;
		by_today = 365 * real_yyyy +(real_yyyy/4);
		by_today = by_today + real_mm * 30;
		by_today = by_today + (real_mm + 1) * 3 / 5 + real_dd -33 ;


		int by_birth = 0;
		by_birth = 365 * yyyy1 +(yyyy1/4);
		by_birth = by_birth + mm1 * 30;
		by_birth = by_birth + (mm1 + 1) * 3 / 5 + dd1 -33 ;

		ret = by_today - by_birth;
		return ret;
	}


}
