package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
public class Call {
	public Call(){

	}

	public static void main(String[] args){
		Call my = new Call();
		my.name01();
		my.age02();
		my.seiza03(0, 0);
		my.eto04(0);
	}

	private void name01(){
		System.out.println("これから星座占いを行います");
		System.out.println("お名前を教えてください。");
		Scanner stdIn = new Scanner (System.in);
		String name = stdIn.nextLine();
		System.out.println("こんにちは、 " + name + "さん^^");

	}

	private void age02(){
		ageMethod();
	}
	//必要な情報
	private void ageMethod(){
		System.out.println("では、まず生年月日を教えてください");
		System.out.println("例 → 1992年5月1日なら19920501と入力してください");
		Scanner stdIn_a = new Scanner (System.in);
		String age = stdIn_a.nextLine();

		Call my = new Call();

		//System.out.println(age);
		//1992 05 01
		//0123 45 689

		String str_yy = age.substring(0, 4);
		//System.out.println(str_yy);

		String str_mm = age.substring(4, 6);
		//System.out.println(str_mm);

		String str_dd = age.substring(6, 8);
		//System.out.println(str_dd);

		int int_yy = Integer.parseInt(str_yy);
		int int_mm = Integer.parseInt(str_mm);
		int int_dd = Integer.parseInt(str_dd);


		String seiza_a = seiza03(int_mm,int_dd);
		System.out.println("あなたの星座は"+ seiza_a + "です");
		int age_a = age1(int_yy, int_mm, int_dd);
		System.out.println("あなたの年齢は"+age_a + "才です");
		char eto_1 = eto04(int_yy);
		System.out.println("あなたの干支は" + eto_1 + "です");
	}
	//年齢


	private int age1(int yyyy1,int mm1, int dd1){
		Date today = new Date();
		String age_real = "";
		age_real = today.toString();
		int ret = 0 ;

		String yyyy = age_real.substring(24, 28);
		String mm = getMonth(age_real);
		String dd = age_real.substring(8, 10);

		int int_yyyy = Integer.parseInt(yyyy);
		int int_mm = Integer.parseInt(mm);
		int int_dd = Integer.parseInt(dd);


		if(mm1 > int_mm){
			ret =int_yyyy - yyyy1-1;
		}else if(mm1 < int_mm){
			ret = int_yyyy - yyyy1;
		}else if(dd1 < int_dd){
			ret = int_yyyy - yyyy1;
		}else{
			ret = int_yyyy - yyyy1 -1;
		}

		return ret;
	}

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

	//星座を求める
		private String seiza03(int mm,int dd ){
			String ret = "";


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


			for(Constellation element : seiza){
				int startMonth = element.getStartMonth();
				int startDay = element.getStartDay();
				int endMonth = element.getEndMonth();
				int endDay = element.getEndDay();

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
}
