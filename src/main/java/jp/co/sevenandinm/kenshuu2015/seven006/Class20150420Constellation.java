package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;


public class Class20150420Constellation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("生年月日を入力してください");
		Scanner scan=new Scanner(System.in);

		System.out.print("年：");
		int year = scan.nextInt();
		System.out.print("月：");
		int month = scan.nextInt();
		System.out.print("日：");
		int day = scan.nextInt();
		star(month,day);
		int totalDay= totalDay(year , month , day);
		System.out.println(totalDay+"才");
		//System.out.println("\n生まれてから今日まで" +totalDay+"日たちました");
		String eto=eto(year);
		System.out.println(eto+"年です");

	}

	public static void star(int month,int day){
		Aries ari=new Aries();//牡羊座
		Taurus tau=new Taurus();//牡牛座
		Gemini gtm = new  Gemini();//双子座
		Cancer can = new Cancer();//かに
		Leo leo = new Leo();//しし
		Virgo vir= new Virgo();//おとめ
		Libra lib = new Libra();//天秤
		Scorpio sco =new Scorpio();//さそり
		Sagittarius sag = new Sagittarius();//いて
		Capricorn cap = new Capricorn();//やぎ
		Aquarius aqu= new Aquarius();//水瓶座
		Pisces pis =new Pisces();//魚座

		Constellation[] constellation=
			{ari,tau,gtm,can,leo,vir,lib,sco,sag,cap,aqu,pis};

		for(int i=0;i<constellation.length;i++){
			if(
				(month==constellation[i].getStartMonth() &&day >= constellation[i].getStartDay() )||
				(month==constellation[i].getEndMonth() &&day <= constellation[i].getEndDay())
			){
				System.out.println(constellation[i].getJapaneseName());
			}
		}

	}
	public static int totalDay(int year ,int month,int day){
		Calendar calendar = Calendar.getInstance();
		int todayYear= calendar.get(Calendar.YEAR);
		int todayMonth =calendar.get(Calendar.MONTH) +1;
		int todayDay = calendar.get(Calendar.DATE);
		int yy =year;
		int mm =month;
		int dd =day;
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
			if(month ==mm && day==dd){
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

	public static String eto(int year){
		String[] etoBox ={"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
		int etonum=(year+9)%12;
		return etoBox[etonum-1];
	}


}
