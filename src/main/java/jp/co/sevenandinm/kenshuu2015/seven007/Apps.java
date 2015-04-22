/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven007;

import java.util.Date;
import java.util.Scanner;

public class Apps {

	public static void main(String[] args) {


		int year = 0;
		int month = 0;
		int day = 0;

		do{
			Scanner stdIn = new Scanner(System. in);
			System.out.println("生まれた年(yyyy)を入力してください");
			year = stdIn.nextInt();
			System.out.println("生まれた月(mm)を入力してください");
			month = stdIn.nextInt();
			System.out.println("生まれた日(dd)を入力してください");
			day = stdIn.nextInt();
		}while( year > 2015 || year < 1 || month > 12 || month < 1 || day > 31 || day < 1);


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
			int cal_year = int_year - year;


			//星座のシステムアウト
			String fin_seiza = method01(month,day);
			System.out.println("星座は" + fin_seiza +"です。");

			//年齢のシステムアウト
			int fin_nenrei = method02(month,day,cal_year,int_mm,int_day);
			System.out.println("年齢は" + fin_nenrei +"です。");

			//干支のシステムアウト
			String fin_eto = method03(cal_year);
			System.out.println("干支は" + fin_eto + "です。");

			//生まれてからの日数システムアウト
			int fin_umarete = method04(cal_year);
			System.out.println("生まれてから" + fin_umarete +"日目です。");



	}

	//星座の表示プログラム
	private static String method01 (int month,int day){

		Aries aries = new Aries();
		Taurus taurus = new Taurus();
		Gemini gemini = new Gemini();
		Cancer cancer = new Cancer();
		Leo leo = new Leo();
		Virgo virgo = new Virgo();
		Libra libra = new Libra();
		Scorpio scorpio = new Scorpio();
		Sagittarius sagittarius = new Sagittarius();
		Capricorn capricorn = new Capricorn();
		Aquarius aquarius = new Aquarius();
		Pisces pisces = new Pisces();

		Constellation cons[] = {aries,taurus,gemini,cancer,leo,virgo,libra,scorpio,sagittarius,capricorn,aquarius,pisces};

		String fin_method01 = "";
		for( int i = 0; i < cons.length; i++ ){
			if( (month == cons[i].getStartMonth() && day > cons[i].getStartDay() ) || (month == cons[i].getEndMonth() && day < cons[i].getEndDay()) ){
				fin_method01 =  cons[i].getJapaneseName();
			}
		}
		return fin_method01;
	}


	//年齢表示のプログラム
	private static int method02(int month,int day,int cal_year,int int_mm,int int_day){

		if( month > int_mm || month == int_mm && day > int_day){
			int fin_year =  cal_year - 1;
			return fin_year;
		}else {
			return cal_year;
		}
	}

	//干支の表示プログラム
	private static String method03(int cal_year){

		String eto[] = {"羊","馬","蛇","竜","兎","虎","丑","鼠","猪","犬","鶏","猿"};

		int fin_eto = cal_year % 12;

		String fin_method03 = "";
		for( int j = 0; j < eto.length; j++){
			if( fin_eto == j ){
				fin_method03 = eto[j];
			}
		}
		return fin_method03;
	}

	//生まれてから日数プログラム
	private static int method04(int cal_year){
		int days = cal_year * 365;
		return days;
	}


	}
