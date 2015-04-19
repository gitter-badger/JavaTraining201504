package jp.co.sevenandinm.kenshuu2015.seven001;
//9*9の問題
public class Class20150413_03{
		public static void main (String[] args){
		
		String message ="";
		int result = 0 ;
		
		
//1画面にメッセージを出力
			message = "9×9を計算する。";
			System.out.println( message );
					
//計算
			for( int i = 1 ; i <= 9  ; i++ ){
				for( int j = 1 ; j <= 9  ; j++ ){
				result = i * j ;
					if( i == 1){
					System.out.print( result + "  " );
					}else if( i == 2 && j == 2){
					System.out.print( result + "  " );
					}
					
					
					else{
					System.out.print( result + " " );
					}
				}
				System.out.println();
		}
}
}

