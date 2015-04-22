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




		//星座の表示プログラム
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


		for( int i = 0; i < cons.length; i++ ){
			if( (month == cons[i].getStartMonth() && day > cons[i].getStartDay() ) || (month == cons[i].getEndMonth() && day < cons[i].getEndDay()) ){
				System.out.println("星座は" +cons[i].getJapaneseName() +"です。");
			}
		}

		/*	if( month == 3 && day > 20 || month == 4 && day < 21 ){
				System.out.println(cons[0].getJapaneseName());
			}else if( month == 4 && day > 20 || month == 5 && day < 21 ){
				System.out.println(cons[1].getJapaneseName());
			}else if( month == 5 && day > 20 || month == 6 && day < 22 ){
				System.out.println(cons[2].getJapaneseName());
			}else if( month == 6 && day > 21 || month == 7 && day < 24 ){
				System.out.println(cons[3].getJapaneseName());
			}else if( month == 7 && day > 23 || month == 8 && day < 24 ){
				System.out.println(cons[4].getJapaneseName());
			}else if( month == 8 && day > 23 || month == 9 && day < 24 ){
				System.out.println(cons[5].getJapaneseName());
			}else if( month == 9 && day > 23 || month == 10 && day < 24 ){
				System.out.println(cons[6].getJapaneseName());
			}else if( month == 10 && day > 23 || month == 11 && day < 23 ){
				System.out.println(cons[7].getJapaneseName());
			}else if( month == 11 && day > 22 || month == 12 && day < 23 ){
				System.out.println(cons[8].getJapaneseName());
			}else if( month == 12 && day > 22 || month == 1 && day < 21 ){
				System.out.println(cons[9].getJapaneseName());
			}else if( month == 1 && day > 20 || month == 2 && day < 20 ){
				System.out.println(cons[10].getJapaneseName());
			}else if( month == 2 && day > 19 || month == 3 && day < 21 ){
				System.out.println(cons[11].getJapaneseName());
			}
			*/

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
		int cal_year = int_year - year;

		if( month > int_mm || month == int_mm && day > int_day){
			int fin_year =  cal_year - 1;
			System.out.println("年齢は" +  fin_year+"歳です。");
		}else {
			System.out.println("年齢は" +  cal_year+"歳です。");
		}


		//干支の表示プログラム
		String eto[] = {"羊","馬","蛇","竜","兎","虎","丑","鼠","猪","犬","鶏","猿"};

		int fin_eto = cal_year % 12;

		for( int j = 0; j < eto.length; j++){
			if( fin_eto == j ){
				System.out.println(eto[j] +"年です。");
			}
		}

		//生まれてから日数プログラム
		int days = cal_year * 365;
		System.out.println("生まれてから" +days +"日目です。" );



	}
}
