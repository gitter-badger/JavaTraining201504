package jp.co.sevenandinm.kenshuu2015.seven001;
//階乗の計算を再起で求める

public class Class20150415_01{
		public static void main (String[] args){
		
//定義		
		String message ="";
		int input = 0 ;

//画面にメッセージを出力
			message = "階乗の計算を求める。";
			System.out.println( message );			

//キーボードからの入力
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			input = stdIn.nextInt();
			
//計算メソッドの取得
			int result = factorial( input );
			
			
//出力画面
			System.out.println( result );
			
		}

//計算メソッド	
 		 private static int factorial(int input) {

      	 int result = 1;

         if (input == 0) {

         System.out.println("最後までいったので、計算を開始します。");
         ;

         } else {

          System.out.println("factorial1(" + input + ") が読み出されます。まだ計算待ちがあります。");

          result = input * factorial(input - 1);

         }

         return result;

        }
}

