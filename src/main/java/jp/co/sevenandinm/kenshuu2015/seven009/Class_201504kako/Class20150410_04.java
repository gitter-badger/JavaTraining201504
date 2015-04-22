package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

public class Class20150410_04 {
		public static void main (String[]args){
			String message ="";
			int max = 0;
			
	    	
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			
			//キーボードからの入力
			
			System.out.println ("一つ目の数字 " + a );
			System.out.println ("二つ目の数字 " + b ); 
			System.out.println ("三つ目の数字 " + c );	   		
			
			//最大値を求める
			if( a > b && a > c ){
				max = a;
			}else if ( b > c ){
				max = b;
			}else{
				max = c;
			}
			
	   		//最小値の出力
			System.out.println ("最小値は"+ max +"です");
		}
}