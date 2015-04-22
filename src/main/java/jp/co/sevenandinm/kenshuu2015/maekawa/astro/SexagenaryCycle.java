package jp.co.sevenandinm.kenshuu2015.maekawa.astro;

public class SexagenaryCycle {

	//十二支名の配列
	public static String theTwelveHorarySignNames[] ={"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
	//十干名の配列
	public static String theCelestialStemNames[] ={"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};

	private int year = 0;
	private int theCelestialStemNumber = 0;
	private int theTwelveHorarySignNumber = 0;
	private String theCelestialStemName = "";
	private String theTwelveHorarySignName = "";
	private String theChineseAstrology = "";

	public SexagenaryCycle(int year) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.year = year;
		this.theCelestialStemNumber = this.calcCelestialStemNumber(year);
		this.theTwelveHorarySignNumber = this.calcTwelveHorarySignNumber(year);
		this.theCelestialStemName = theCelestialStemNames[this.theCelestialStemNumber];
		this.theTwelveHorarySignName = theTwelveHorarySignNames[this.theTwelveHorarySignNumber];
		this.theChineseAstrology = this.theTwelveHorarySignName + this.theCelestialStemName;
	}

	public static void main(String[] args){
		SexagenaryCycle my = new SexagenaryCycle(1967);
		System.out.println(my.theTwelveHorarySignNumber);
		System.out.println(my.theTwelveHorarySignName);
		System.out.println(my.theCelestialStemNumber);
		System.out.println(my.theCelestialStemName);
	}

	/**
	 * 十干番号取得
	 * @param i
	 */
	private int calcCelestialStemNumber(int year) {
		// TODO 自動生成されたメソッド・スタブ
		return (year + 6) % 10;
	}

	/**
	 * 十干取得
	 * @param year
	 * @return
	 */
	public String calcCelestialStemName(int year) {
		// TODO 自動生成されたメソッド・スタブ
		return theCelestialStemNames[(year + 6) % 10];
	}

	/**
	 * 十二支番号取得
	 * @param i
	 */
	private int calcTwelveHorarySignNumber(int year) {
		// TODO 自動生成されたメソッド・スタブ
		return (year + 8) % 12;
	}

	/**
	 * 十二支取得
	 * @param year
	 * @return
	 */
	public String calcTwelveHorarySignName(int year) {
		// TODO 自動生成されたメソッド・スタブ
		return theTwelveHorarySignNames[(year + 8) % 12];
	}

	/**
	 * 干支取得する
	 *
	 * @param year
	 * @return
	 */
	public String calcChineseAstrology(int year) {
		// TODO 自動生成されたメソッド・スタブ
		return theTwelveHorarySignNames[(year + 8) % 10] + theCelestialStemNames[(year + 6) % 10];
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
	 * @return theCelestialStemNumber
	 */
	public int getTheCelestialStemNumber() {
		return theCelestialStemNumber;
	}

	/**
	 * @param theCelestialStemNumber セットする theCelestialStemNumber
	 */
	public void setTheCelestialStemNumber(int theCelestialStemNumber) {
		this.theCelestialStemNumber = theCelestialStemNumber;
	}

	/**
	 * @return theTwelveHorarySignNumber
	 */
	public int getTheTwelveHorarySignNumber() {
		return theTwelveHorarySignNumber;
	}

	/**
	 * @param theTwelveHorarySignNumber セットする theTwelveHorarySignNumber
	 */
	public void setTheTwelveHorarySignNumber(int theTwelveHorarySignNumber) {
		this.theTwelveHorarySignNumber = theTwelveHorarySignNumber;
	}

	/**
	 * @return theCelestialStemName
	 */
	public String getTheCelestialStemName() {
		return theCelestialStemName;
	}

	/**
	 * @param theCelestialStemName セットする theCelestialStemName
	 */
	public void setTheCelestialStemName(String theCelestialStemName) {
		this.theCelestialStemName = theCelestialStemName;
	}

	/**
	 * @return theTwelveHorarySignName
	 */
	public String getTheTwelveHorarySignName() {
		return theTwelveHorarySignName;
	}

	/**
	 * @param theTwelveHorarySignName セットする theTwelveHorarySignName
	 */
	public void setTheTwelveHorarySignName(String theTwelveHorarySignName) {
		this.theTwelveHorarySignName = theTwelveHorarySignName;
	}

	/**
	 * 干支取得する
	 * @return theChineseAstrology
	 */
	public String getTheChineseAstrology() {
		return theChineseAstrology;
	}

	/**
	 * @param theChineseAstrology セットする theChineseAstrology
	 */
	public void setTheChineseAstrology(String theChineseAstrology) {
		this.theChineseAstrology = theChineseAstrology;
	}

}
