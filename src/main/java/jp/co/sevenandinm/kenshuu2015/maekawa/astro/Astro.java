/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.astro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 生年月日から星座を求めるクラス
 *
 * @author teacher4
 *
 */
public class Astro {

	/**
	 * 年
	 */
	private int year = 1900;
	/**
	 * 月
	 */
	private int month = 1;
	/**
	 * 日
	 */
	private int day = 1;

	/**
	 * 星座
	 */
	private String constellation = "";
	/**
	 * 干支
	 */
	private String sexagenaryCycle = "";

	/**
	 * 年齢
	 */
	private int age = 20;
	/**
	 * 生年月日からの経過日数
	 */
	private long durationOfFeedingPeriod = 0;

	private static String message01 = "生年月日を入力してください。（ 例：　1991/03/24 ）";


	/**
	 * default コンストラクタ
	 */
	public Astro(){

	}

	/**
	 * コンストラクタ
	 * @param y
	 * @param m
	 * @param d
	 */
	public Astro(int y,int m,int d){
		this.year = y;
		this.month = m;
		this.day = d;
		this.age = new CalcAge().execute(y, m, d);
		this.constellation = this.searchConstellation(m, d);
	}

	/**
	 * このクラスのメソッドの動作確認として利用する。
	 * @param args
	 */
	public static void main(String[] args) {

//		staticMethod01();
//		staticMethod02();
		staticMethod03();

	}

	/**
	 *
	 */
	private static void staticMethod03() {
		// 1.0 入力
		int[] intYMD = scanInputData();
		System.out.println("生年月日：" + intYMD[0] + "/" + intYMD[1] + "/" + intYMD[2]);
		// 2.0 星座を求める
		Astro my = new Astro(intYMD[0],intYMD[1],intYMD[2]);
		System.out.println("" + intYMD[1] + "/" + intYMD[2] + ":" + my.searchConstellation(intYMD[1],intYMD[2]));
		// 3.0 年齢を求める
		my.calcAge(intYMD[0],intYMD[1],intYMD[2]);
		// 4.0 日齢を求める
		my.calcDurationOfFeedingPeriod(intYMD[0],intYMD[1],intYMD[2]);
		System.out.println("生年月日からの経過日数：" + my.getDurationOfFeedingPeriod());
		// 5.0 干支を求める
		SexagenaryCycle cycle = new SexagenaryCycle(intYMD[0]);
		System.out.println("干支：" + cycle.getTheChineseAstrology());
		System.out.println("----------------------------------------");
	}

	/**
	 *
	 */
	private static void staticMethod01() {
		Astro my = new Astro();
		String strTmp = "";

		int[][] list = {
				{1991,3,22},
				{1991,4,19},
				{1991,4,20},
				{1991,4,21},
				{1991,10,1},
				{1991,5,20}
		};

		for(int i = 0;i<list.length;i++){
			strTmp = my.searchConstellation(list[i][1],list[i][2]);
			System.out.println("" + list[i][1] + "/" + list[i][2] + ":" + strTmp);
			my.calcAge(list[i][0],list[i][1],list[i][2]);
		}

		//my.calcAge(1967,10,1);//1991,12,24
	}

	/**
	 *
	 */
	private static void staticMethod02(){
		String strTmp = "";

		int[][] list = {
				{1991,3,22},
				{1991,4,19},
				{1991,4,20},
				{1991,4,21},
				{1967,10,1},
				{1991,5,20}
		};

		for(int i = 0;i<list.length;i++){
			System.out.println("" + list[i][0] + "/" + list[i][1] + "/" + list[i][2]);
			Astro my = new Astro(list[i][0],list[i][1],list[i][2]);
			strTmp = my.searchConstellation(list[i][1],list[i][2]);
			System.out.println("" + list[i][1] + "/" + list[i][2] + ":" + strTmp);
			my.calcAge(list[i][0],list[i][1],list[i][2]);
			my.calcDurationOfFeedingPeriod(list[i][0],list[i][1],list[i][2]);
			System.out.println("生年月日からの経過日数：" + my.getDurationOfFeedingPeriod());
			SexagenaryCycle cycle = new SexagenaryCycle(list[i][0]);
			System.out.println("干支：" + cycle.getTheChineseAstrology());
			System.out.println("----------------------------------------");
		}

	}

	/**
	 *
	 * @return
	 */
	private static int[] scanInputData(){
		System.out.print(message01);
		Scanner scan = new Scanner(System.in);
		String inputDataRaw =scan.next();
		String[] strYMD = inputDataRaw.split("/",0);
		int[] intYMD = new int[3];
		for(int i = 0 ; i < strYMD.length ; i++){
			intYMD[i] = Integer.parseInt(strYMD[i]);
		}
		return intYMD;
	}

	/**
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	private long calcDurationOfFeedingPeriod(int year,int month,int day){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    Date dateTo = null;
	    Date dateFrom = null;

	    // 日付を作成します。
	    try {
	        dateFrom = sdf.parse("" + year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day));//2013/08/01
	        //dateTo = sdf.parse("2013/08/31");//
	        dateTo = new Date();

	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    // 日付をlong値に変換します。
	    long dateTimeTo = dateTo.getTime();
	    long dateTimeFrom = dateFrom.getTime();

	    // 差分の日数を算出します。
	    long dayDiff = ( dateTimeTo - dateTimeFrom  ) / (1000 * 60 * 60 * 24 );
	    setDurationOfFeedingPeriod(dayDiff);
		return dayDiff;
	}

	/**
	 * 生年月日から星座を求める。
	 * @return
	 */
	public String searchConstellation1(int month,int day){
		String strRet = "";

		Constellation[] constellation = new Constellation[12];
		constellation[0] = new Aries();
		constellation[1] = new Taurus();
		constellation[2] = new Gemini();
		constellation[3] = new Cancer();
		constellation[4] = new Leo();
		constellation[5] = new Virgo();
		constellation[6] = new Libra();
		constellation[7] = new Scorpio();
		constellation[8] = new Sagittarius();
		constellation[9] = new Capricorn();
		constellation[10] = new Aquarius();
		constellation[11] = new Pisces();

		for(int i = 0 ; i < constellation.length ; i++){
//			// 日付比較の場合は、以下のように考えてはいけない。単純に月と日で分けて比較はできない。
//			if( (constellation[i].getStartMonth() <= month
//					&& constellation[i].getEndMonth() >= month)
//					&& (constellation[i].getStartDay() <= day
//					&& constellation[i].getEndDay() >= day) ){

//			System.out.println(constellation[i].getJapaneseName() + ":" + constellation[i].dispDescription());

			if( getMMDD(constellation[i].getStartMonth(),constellation[i].getStartDay())
					<= getMMDD(month,day)
					&& getMMDD(month,day)
					<= getMMDD(constellation[i].getEndMonth(),constellation[i].getEndDay()) ){

				strRet = constellation[i].getJapaneseName();
			}
		}

		return strRet;
	}

	/**
	 * 星座を求めるロジック
	 * ポリモルフィズム
	 *
	 * @param month
	 * @param day
	 * @return
	 */
	public String searchConstellation(int month,int day){
		String strRet = "";

		Constellation[] constellation = new Constellation[12];
		constellation[0] = new Aries();
		constellation[1] = new Taurus();
		constellation[2] = new Gemini();
		constellation[3] = new Cancer();
		constellation[4] = new Leo();
		constellation[5] = new Virgo();
		constellation[6] = new Libra();
		constellation[7] = new Scorpio();
		constellation[8] = new Sagittarius();
		constellation[9] = new Capricorn();
		constellation[10] = new Aquarius();
		constellation[11] = new Pisces();

		for(Constellation element: constellation){

			if( getMMDD(element.getStartMonth(),element.getStartDay())
					<= getMMDD(month,day)
					&& getMMDD(month,day)
					<= getMMDD(element.getEndMonth(),element.getEndDay()) ){

				strRet = element.getJapaneseName();
			}
		}

		return strRet;
	}

	/**
	 * 月日を整数で扱えるように工夫
	 *
	 * @param month
	 * @param day
	 * @return
	 */
	public int getMMDD(int month,int day){
		return month * 100 + day;
	}

	/**
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year セットする year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month セットする month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day セットする day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return constellation
	 */
	public String getConstellation() {
		return constellation;
	}
	/**
	 * @param constellation セットする constellation
	 */
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	/**
	 * @return sexagenaryCycle
	 */
	public String getSexagenaryCycle() {
		return sexagenaryCycle;
	}
	/**
	 * @param sexagenaryCycle セットする sexagenaryCycle
	 */
	public void setSexagenaryCycle(String sexagenaryCycle) {
		this.sexagenaryCycle = sexagenaryCycle;
	}

	/**
	 * この実装はあくまでも参考
	 * この機能は CalcAge クラスに外だししたため、非推奨
	 * @deprecated 非推奨
	 * @return age
	 */
	public int calcAge(int year,int month,int day) {
		Calendar cal_current = Calendar.getInstance();// 2014/04/11
//		cal_current.set(2014,11,25);// 経過した場合のテスト用
		Calendar cal_target = Calendar.getInstance(); // 1991/12/24
		cal_target.set(year,(month-1),day);
		// 現在の年の日付を得る。
		Calendar cal_target2 = Calendar.getInstance();
		cal_target2.set(year,(month-1),day);
		cal_target2.set(Calendar.YEAR,cal_current.get(Calendar.YEAR));// 年だけ現在の年にしてみる。
		System.out.println(cal_target2.get(Calendar.YEAR) + "/"
				+ (cal_target2.get(Calendar.MONTH) + 1) + "/" + cal_target2.get(Calendar.DATE));
		// その日付と現在時刻を比較する。
		// cal_current＜cal_target2であるかを比較する
		boolean isBefore = cal_current.before(cal_target2);

		if(isBefore){
			System.out.println("isBefore");
			this.age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR) - 1 ;
		}else{
			System.out.println("isAfter");
			//そのまま引き算
			this.age = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR) ;
		}

		System.out.println(this.age);


		return this.age;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return durationOfFeedingPeriod
	 */
	public long getDurationOfFeedingPeriod() {
		return durationOfFeedingPeriod;
	}
	/**
	 * @param durationOfFeedingPeriod セットする durationOfFeedingPeriod
	 */
	public void setDurationOfFeedingPeriod(long durationOfFeedingPeriod) {
		this.durationOfFeedingPeriod = durationOfFeedingPeriod;
	}



}
