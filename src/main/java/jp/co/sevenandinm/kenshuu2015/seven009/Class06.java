package jp.co.sevenandinm.kenshuu2015.seven009;
public class Class06 {
		public static void main (String[]args){
			String message ="";
			int a;
			int b;
			int c;
			int min = 0;
			
	    	//画面にメッセージ出力
			message = "三つの数字の最小値を求めます";
			System.out.println ( message );
			
			//キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			System.out.println ("一つ目の値を入力してください");a = stdIn.nextInt();
			System.out.println ("二つ目の値を入力してください");b = stdIn.nextInt();
			System.out.println ("三つ目の値を入力してください");c = stdIn.nextInt();
	   		
			//最大値を求める
			if( a < b && a < c ){
				min = a;
			}else if ( b < c ){
				min = b;
			}else{
				min = c;
			}
			
	   		//最小値の出力
			System.out.println ("最小値は"+ min +"です");
		}
}
