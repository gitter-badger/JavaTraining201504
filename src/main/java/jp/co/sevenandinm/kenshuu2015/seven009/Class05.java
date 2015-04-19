package jp.co.sevenandinm.kenshuu2015.seven009;
public class Class05 {
		public static void main (String[]args){
			String message ="";
			int a;
			int b;
			int c;
			int Max = 0;
			
	    	//画面にメッセージ出力
			message = "三つの数字の最大値を求めます";
			System.out.println ( message );
			
			//キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			System.out.println ("一つ目の値を入力してください");a = stdIn.nextInt();
			System.out.println ("二つ目の値を入力してください");b = stdIn.nextInt();
			System.out.println ("三つ目の値を入力してください");c = stdIn.nextInt();
	   		
			//最大値を求める
			if( a > b && a > c ){
				Max = a;
			}else if ( b > c ){
				Max = b;
			}else{
				Max = c;
			}
			
	   		//最大値の出力
			System.out.println ("最大値は"+ Max +"です");
					
	}

}