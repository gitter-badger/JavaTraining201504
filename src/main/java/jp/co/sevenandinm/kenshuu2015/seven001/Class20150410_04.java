package jp.co.sevenandinm.kenshuu2015.seven001;
//３の数字の最大値を求める。
public class Class20150410_04{
	public static void main(String[] args){
		
		
		String message = "";
		int int_input_a = Integer.parseInt( args[0] ) ;
		int int_input_b = Integer.parseInt( args[1] ) ;
		int int_input_c = Integer.parseInt( args[2] ) ;
		int int_max = 0 ;
		
				
//1画面にメッセージを出力
		
		System.out.println("３つの数字の最大値を求める。" );
		
		System.out.print( "1つ目の数字は:");
		System.out.println( args[0] );
		
		System.out.print( "2つ目の数字は:");
		System.out.println( args[1] );
		
		System.out.print( "3つ目の数字は:");
		System.out.println( args[2] );
				
		
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
