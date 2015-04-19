package jp.co.sevenandinm.kenshuu2015.seven001;
//３の数字の最大値を求める。
public class Class20150413_01{
	public static void main(String[] args){

			String message = "";
			int in_input_a = 0; 
			int in_input_b = 0;
			int in_input_c = 0;

		
			//1画面にメッセージを出力
			message = "３の数字の最大値を求める。";
			System.out.println( message );
			
			//2キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			message = "1つ目の数字は";
			System.out.println( message );
			in_input_a = stdIn.nextInt() ;
			message = "2つ目の数字は";
			System.out.println( message );
			in_input_b = stdIn.nextInt() ;
			message = "3つ目の数字は";
			System.out.println( message );
			in_input_c = stdIn.nextInt() ;
		
			int in_max = max3 (in_input_a , in_input_b , in_input_c);
		
			//3画面に出力
			System.out.println("最大値は" + in_max + "です。");		
		
			}
	
			public static int max3 (int in_input_a , int in_input_b , int in_input_c){
				int in_max = 0;
				
				if( in_input_a > in_input_b && in_input_a > in_input_c){
					in_max = in_input_a;
				}else if( in_input_b > in_input_c){
					in_max = in_input_b;
				}else{
					in_max = in_input_c;
				}
			
				return in_max;
				
			}
}
