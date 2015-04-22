package jp.co.sevenandinm.kenshuu2015.seven001;
import java.util.Calendar;
public class Application{
	public static void main(String[] args){

	Application my = new Application();
	my.execute01();

	}

	private void execute01() {

	String message = "";
	int year = 0;
	int month = 0;
	int day = 0;

//入力
	message = "生年月日から星座、年齢、干支を判定します。";
	System.out.println(message);

	message = "生まれた年を入力してください。";
	System.out.println(message);
	java.util.Scanner stdIn03 = new java.util.Scanner(System.in);
	year = stdIn03.nextInt();

	message = "生まれた月を入力してください。";
	System.out.println(message);
	java.util.Scanner stdIn01 = new java.util.Scanner(System.in);
	month = stdIn01.nextInt();

	message = "生まれた日を入力してください。";
	System.out.println(message);
	java.util.Scanner stdIn02 = new java.util.Scanner(System.in);
	day = stdIn02.nextInt();

//getSEIZAメソッドの取得
	String getseiza = getSEIZA(month,day);
//getAGEメソッドの取得
	int getage = getAGE(year,month,day);
//getETOメソッドの取得
	String geteto = getETO(year);
//getELAPSEDメソッドの取得
	int getelapsed =getELAPSED(year,month,day);

//出力
	System.out.println("あなたの星座は" + getseiza + "です。");
	System.out.println("あなたの年齢は" + getage + "です。");
	System.out.println("あなたの干支は" + geteto + "です。");
	System.out.println("あなたは生まれてから" + getelapsed + "日経過しています。");

	}
	private int getELAPSED(int year, int month, int day) {
		Calendar elap_current = Calendar.getInstance();    //現在の日付
		Calendar elap_target = Calendar.getInstance();	//入力した日付
		elap_target.set(year, month-1, day);

		int getelapsed;
		int elap_year =elap_current.get(Calendar.YEAR) - elap_target.get(Calendar.YEAR);
		int elap_day = elap_current.get(Calendar.DAY_OF_YEAR) - elap_target.get(Calendar.DAY_OF_YEAR);
		int elap_uruu = elap_year / 4;

		getelapsed = (365 * elap_year) + elap_day + elap_uruu;

		return getelapsed;
	}

	private String getETO(int year) {
		String geteto ="";
		int eto_no = 0;
		String etoTable[] = {"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
		for(int i=0; i < etoTable.length ; i++){
		eto_no = (year + 8) % 12 ;
		geteto = etoTable[eto_no];

		}


		return geteto;
	}

	private int getAGE(int year, int month, int day) {

		Calendar cal_current = Calendar.getInstance();    //現在の日付
		Calendar cal_target = Calendar.getInstance();	//入力した日付
		cal_target.set(year, month-1, day);
		int getage = cal_current.get(Calendar.YEAR) - cal_target.get(Calendar.YEAR);
		if(cal_current.get(Calendar.MONTH) < cal_target.get(Calendar.MONTH)){
			getage --;
		}else if(cal_current.get(Calendar.DAY_OF_MONTH) < cal_target.get(Calendar.DAY_OF_MONTH)){
			getage --;

		}
		return getage;
	}

	public  String getSEIZA(int month,int day){
		String getseiza = "";

		Constellation[] seiza = new Constellation[12];
			seiza[0] = new Ohituziza();
			seiza[1] = new Ousiza();
			seiza[2] = new Hutagoza();
			seiza[3] = new Kaniza();
			seiza[4] = new Shishiza();
			seiza[5] = new Otomeza();
			seiza[6] = new Tenbinza();
			seiza[7] = new Sasoriza();
			seiza[8] = new Iteza();
			seiza[9] = new Yagiza();
			seiza[10] = new Mizukameza();
			seiza[11] = new Uoza();

			for(int i=0;i < seiza.length;i++){
				if(month == seiza[i].getStartMonth() && day >= seiza[i].getStartDay()){
					getseiza = seiza[i].getJapaneseName();
				}else if(month == seiza[i].getEndMonth() && day <= seiza[i].getEndDay()){
					getseiza = seiza[i].getJapaneseName();
				}
			}
//			for( Constellation element : seiza){
//				int startmonth = element.getStartMonth();
//				int endmonth = element.getEndMonth();
//				int startday = element.getStartDay();
//				int endday = element.getEndDay();
//
//				if(month == startmonth && day >= startday){
//					getseiza = element.getJapaneseName();
//				}else if(month == endmonth && day <= endday){
//					getseiza = element.getJapaneseName();
//				}

			return getseiza;
		}

	}


