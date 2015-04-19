package jp.co.sevenandinm.kenshuu2015.seven007;

//二桁の数字のみ表示する

public class Class20150410_02{
	public static void main (String[] args){
		
		int in_number;
		String st_number_check = "";
		
		System.out.print ("数値を入力してください：");
		
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		in_number = stdIn.nextInt();
		
		if( 10 <= in_number && in_number <= 99 ){
			st_number_check = "入力された数値は" +in_number +"です。";
		}else {
			st_number_check = "入力された数値は二桁ではありません。";
		}
		
		System.out.println( st_number_check );
	}
}
