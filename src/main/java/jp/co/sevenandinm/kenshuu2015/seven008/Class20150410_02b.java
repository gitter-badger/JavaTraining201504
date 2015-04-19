package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150410_02b{
	public static void main(String[] args){
		String st_Message = "";
		String st_Result = "";
		
		//メッセージ画面
		st_Message = "二桁の数字を入力してください：";
		System.out.print(st_Message);
		
		//入力画面
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int in_No = stdIn.nextInt();
		
		while(in_No <= 9 || in_No >= 100){
			System.out.print(st_Message);
			in_No = stdIn.nextInt();
		}
		
		//画面出力
		System.out.println("入力された数値は" + in_No + "です");
		
	}
}