package jp.co.sevenandinm.kenshuu2015.seven002;
//2桁の数字を出力

public class Class20150410_02{
	public static void main (String[] args){
	String message = "";
	String st_result = "";	
			
	//1.画面にメッセージを入浴
	
		message = "数値入力";
		System.out.println(message);
		
		//2.キーボードからの出力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int st_number = stdIn.nextInt();
		
		//3.計算
		if (st_number >= 10 && st_number <=99){
			st_result = " ";
		}else if (st_number<= 9 && st_number >= 100){
			st_result = "エラー";
		}
		
		
				
	//4.結果の出力
	System.out.println(st_result);
	
	 }
	}
	