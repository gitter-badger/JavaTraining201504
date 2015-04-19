package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150413_01{
	//メインメソッド
	public static void main(String[] args){
		//変数初期値設定
		String message = "";
		int a,b,c;
		
		//入力画面
		message = "3つの数字の最大値を求めます";
		System.out.println(message);
		
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		c = stdIn.nextInt();
		
		//最大値メソッド取得
		int in_max = max_Evaluate(a,b,c);
		
		//出力画面
		System.out.println("最大値は" + in_max + "です。");
	}
	
		//最大値計算メソッド
		public static int max_Evaluate(int a,int b,int c){
		int in_max = 0;
		if(a > b && a > c){
			in_max = a;
		}else if(b > c) {
			in_max = b;
		}else{
			in_max = c;
		}
			return in_max;
		}
	
}