package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
public class Call {
	public Call(){

	}

	public static void main(String[] args){
		Call my = new Call();
		//my.execute01();
		my.execute02();
		//my.execute03();
	}

	private void execute01(){
		System.out.println("これから星座占いを行います");
		System.out.println("お名前を教えてください。");
		Scanner stdIn = new Scanner (System.in);
		String name = stdIn.nextLine();
		System.out.println("こんにちは、 " + name + "さん^^");

	}

	private void execute02(){
		ageMethod();
	}
	//必要な情報
	private void ageMethod(){
		System.out.println("では、まず生年月日を教えてください");
		System.out.println("例 → 1992年5月1日なら19920501と入力してください");
		Scanner stdIn_a = new Scanner (System.in);
		String age = stdIn_a.nextLine();
		Date today = new Date();
		Call my = new Call();

		//System.out.println(age);
		//1992 05 01
		//0123 45 689

		String str_yy = age.substring(0, 4);
		System.out.println(str_yy);

		String str_mm = age.substring(4, 6);
		System.out.println(str_mm);

		String str_dd = age.substring(6, 8);
		System.out.println(str_dd);

		int int_yy = Integer.parseInt(str_yy);
		int int_mm = Integer.parseInt(str_mm);
		int int_dd = Integer.parseInt(str_dd);

		int age2 = my.age1(today);
		System.out.println(age2);
		String seiza = method03(int_mm,int_dd);

	}
	//年齢
	private int age1(Date today){
		String age_real = "";
		age_real = today.toString();

		String yyyy = age_real.substring(24, 28);
		String mm = getMonth(age_real);
		String dd = age_real.substring(8, 10);

		int int_yyyy = Integer.parseInt(yyyy);
		int int_mm = Integer.parseInt(mm);
		int int_dd = Integer.parseInt(dd);

		return int_yyyy + int_mm + int_dd ;
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
		private String method03(int mm,int dd ){
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
				int startDay = element.getEndMonth();
				int endMonth = element.getEndMonth();
				int endDay = element.getEndDay();

				if(mm = startMonth && dd >= startDay ){

				}
				if (mm = endMonth && dd <= endDay){

				}
			}

			return ret;
		}
}
