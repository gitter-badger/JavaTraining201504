package jp.co.sevenandinm.kenshuu2015.seven001;
//数値を入力して２進数に変換する
public class Class20150413_04{
		public static void main (String[] args){
		
		String message = "";
		
//画面表示
		message = "数値を入力してください。";
		System.out.println( message );
		
//２進数に変換			
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		String c = Integer.toString( a , b );
		 
//画面表示		
		System.out.println( c );
		}
}
		