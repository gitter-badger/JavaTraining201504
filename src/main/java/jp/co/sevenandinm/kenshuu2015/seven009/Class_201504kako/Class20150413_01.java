package jp.co.sevenandinm.kenshuu2015.seven009.Class_201504kako;

public class Class20150413_01 {
	public static void main (String[]args){
		String message ="";

			
	    	//画面にメッセージ出力
		message = "三つの数字の最大値を求めます";
		System.out.println ( message );
			
			//キーボードからの入力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		System.out.println ("一つ目の値を入力してください");int a = stdIn.nextInt();
		System.out.println ("二つ目の値を入力してください");int b = stdIn.nextInt();
		System.out.println ("三つ目の値を入力してください");int c = stdIn.nextInt();
	   		

		int max = max3(a,b,c);
			//最大値の出力
		System.out.println ("最大値は"+ max +"です");
					
	}
	
	//最大値を求める
	public static int max3(int a, int b, int c){
		int max =0;
			
			
		if( a > b && a > c ){
			max = a;
		}else if ( b > c ){
			max = b;
		}else{
			max = c;
		}
		return max;
	}
	   		
			

}