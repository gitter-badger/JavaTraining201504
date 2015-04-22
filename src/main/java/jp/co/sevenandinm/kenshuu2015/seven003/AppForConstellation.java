package jp.co.sevenandinm.kenshuu2015.seven003;
import java.util.Date;
import java.util.Scanner;

public class AppForConstellation {

	/**
	 * @param args
	 * @return
	 */
	public static void main(String[] args) {

		System.out.println("生年月日を入力してください(例：　yyyy-mm-dd)");

		Scanner stdIn = new Scanner (System.in);
		String seinengappi = stdIn.next();

		String[] ymd = seinengappi.split("-",0);

			int[] int_ymd = new int[3];
		for(int i = 0 ; i < ymd.length ; i++ ){
			int_ymd[i] = Integer.parseInt(ymd[i]);
		}

		//星座
		Constellation[] seiza = new Constellation[12];
		seiza[0] = new Aries();
		seiza[1] = new Taurus();
		seiza[2] = new Gemini();
		seiza[3] = new Cancer();
		seiza[4] = new Leo();
		seiza[5] = new Virgo();
		seiza[6] = new Libra();
		seiza[7] = new Scorpio();
		seiza[8] = new Sagittarius();
		seiza[9] = new Capricorn();
		seiza[10] = new Aquarius();
		seiza[11] = new Pisces();

		//int_ymd[0] = yyyy
		//int_ymd[1] = mm
		//int_ymd[2] = dd

		for (int i =0; i < seiza.length ; i++){
			if(int_ymd[1] == seiza[i].getStartMonth() && int_ymd[2] > seiza[i].getStartDay() ||
					int_ymd[1] == seiza[i].getEndMonth() && int_ymd[2] < seiza[i].getEndDay() ) {
				System.out.println("あなたの星座は" +  seiza[i].getJapaneseName() + "です。");
		}
			}

	    //年齢
		Date today = new Date();
		String strUserId = "";
		strUserId = today.toString();
		int ret = 0 ;

		//0123456789012345678901234567
		//Fri Apr 22 14:24:28 JST 2015

		//20150422	←これに変換したい

		String yyyy = strUserId.substring(24, 28);
		String mm = strUserId.substring(4, 7);
		String dd = strUserId.substring(8, 10);


		mm = mm.replaceAll("Jan", "01");
		mm = mm.replaceAll("Feb", "02");
		mm = mm.replaceAll("Mar", "03");
		mm = mm.replaceAll("Apr", "04");
		mm = mm.replaceAll("May", "05");
		mm = mm.replaceAll("Jun", "06");
		mm = mm.replaceAll("Jul", "07");
		mm = mm.replaceAll("Aug", "08");
		mm = mm.replaceAll("Sep", "09");
		mm = mm.replaceAll("Oct", "10");
		mm = mm.replaceAll("Nov", "11");
		mm = mm.replaceAll("Dec", "12");


		int yyyy1 = Integer.parseInt(yyyy);
		int mm1 = Integer.parseInt(mm);
		int dd1 = Integer.parseInt(dd);
		int fin_year = yyyy1 - int_ymd[0];

		if(int_ymd[1] > mm1 || int_ymd[1] == mm1 && int_ymd[2] > dd1){
			int a = fin_year - 1;
			System.out.println("あなたの年齢は" + a + "歳です。");
		}else{
			System.out.println("あなたの年齢は" + fin_year + "歳です。");
		}
	}
}


	/*
	//干支

		char eto_a[] ={'申','酉','戌','亥','子','丑','寅','卯','辰','巳','午','未'};
		int eto_b = int_ymd[0]%12;
		char eto_c = eto_a[eto_b];

			int keika;
			keika =nenrei*365;
				System.out.println("生まれてから" + keika + "日経過しています。");

		 */






