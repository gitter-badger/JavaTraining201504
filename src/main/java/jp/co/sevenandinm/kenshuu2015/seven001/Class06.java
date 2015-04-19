package jp.co.sevenandinm.kenshuu2015.seven001;
//3つの数字の最大値を求める。
public class Class06{
	public static void main(String[] args){
	
		String message = "";
		int int_input01 = 0 ;
		int int_input02 = 0 ;
		int int_input03 = 0 ;
		int int_max = 0 ;
		
		//1画面にメッセージを出力
		message = "３の数字の最大値を求める。";
		System.out.println( message );
		
		
		//2キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		message = "1つ目の数字は";
		System.out.println( message );
		int_input01 = stdIn.nextInt() ;
		message = "2つ目の数字は";
		System.out.println( message );
		int_input02 = stdIn.nextInt() ;
		message = "3つ目の数字は";
		System.out.println( message );
		int_input03 = stdIn.nextInt() ;
		
		//3計算
		
		if ( int_input01 > int_input02 && int_input01 > int_input03 ){
			int_max = int_input01 ;
		}else if (int_input02  > int_input03){
			int_max = int_input02;
		}else{
			int_max = int_input03;
		}
		
		
		//4結果の出力
		System.out.println("最大値は" + int_max + "です。");	
	}
}
	