package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

public class CalcAgeApp {

	public CalcAgeApp() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		execute(1992,4,21,"昨日が誕生日の人");
		execute(1992,4,22,"今日が誕生日の人");
		execute(1992,4,23,"明日が誕生日の人");

	}

	private static void execute(int y,int m,int d,String message) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("" + y + "/" + m + "/" + d );
		SuperCalcAge[] calc = new SuperCalcAge[10];
		int index = 0;
		calc[index++] = new CalcAgeSeven001();
		calc[index++] = new CalcAgeSeven002();
		calc[index++] = new CalcAgeSeven003();
		calc[index++] = new CalcAgeSeven004();
		calc[index++] = new CalcAgeSeven005();
		calc[index++] = new CalcAgeSeven006();
		calc[index++] = new CalcAgeSeven007();
		calc[index++] = new CalcAgeSeven008();
		calc[index++] = new CalcAgeSeven009();
		calc[index++] = new CalcAgeSeven010();

		for(int i = 0 ; i < calc.length ; i++){
			int ret = calc[i].getAgeByCalc(y, m, d);
			System.out.println("" + calc[i].getClass().getName());
			System.out.println("年齢：" + ret);
			System.out.println("--------------------------------------");
		}
	}

}
