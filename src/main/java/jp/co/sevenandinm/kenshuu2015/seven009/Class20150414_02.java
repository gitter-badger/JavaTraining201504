package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class20150414_02 {
	public static void main (String[] args){
		
		//メッセージ出力
		System.out.println ( "値を入力してください。" );
		
		
		
		//入力してもらう
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int n = stdIn.nextInt();
		
		int factorial = factorial_n(n);
		
		//結果の出力
		System.out.println ( n +"の階乗は"+ factorial +"です");
	
	}
	public static int factorial_n( int n ){
		int factorial = 1;
		for ( int i = 1; i<= n ; i ++ ){
			 factorial = i * factorial ;
		}
		return factorial;
	}





}


