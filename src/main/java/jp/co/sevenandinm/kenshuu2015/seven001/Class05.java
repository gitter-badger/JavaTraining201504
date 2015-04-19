package jp.co.sevenandinm.kenshuu2015.seven001;
//３の数字の最大値を求める。
public class Class05{
	public static void main(String[] args){
	
		String message = "";
		int int_input_a = 0 ;
		int int_input_b = 0 ;
		int int_input_c = 0 ;
		int int_max = 0 ;
		
		//1画面にメッセージを出力
		message = "３の数字の最大値を求める。";
		System.out.println( message );
		
		
		//2キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		message = "1つ目の数字は";
		System.out.println( message );
		int_input_a = stdIn.nextInt() ;
		message = "2つ目の数字は";
		System.out.println( message );
		int_input_b = stdIn.nextInt() ;
		message = "3つ目の数字は";
		System.out.println( message );
		int_input_c = stdIn.nextInt() ;
		
		//3計算
		if( int_input_a > int_input_b && int_input_a > int_input_c){
			int_max = int_input_a;
		}else if( int_input_b > int_input_c){
			int_max = int_input_b;
		}else
			int_max = int_input_c;
		
		//4結果の出力
		System.out.println("最大値は" + int_max + "です。");
	}
	
}
