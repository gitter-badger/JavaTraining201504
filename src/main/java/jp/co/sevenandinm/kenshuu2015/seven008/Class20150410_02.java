package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150410_02{
	public static void main(String[] args){
		String st_Message = "";
		String st_Result = "";
		
		//メッセージ画面
		st_Message = "二桁の数字を入力してください：";
		System.out.print(st_Message);
		
		//入力画面
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int in_No = stdIn.nextInt();
		
		//条件分岐
		if(in_No >= 0 && in_No <= 9){
			st_Result = "エラー（10以下）";
		}else if(in_No >= 10 && in_No <= 99){
			st_Result = "" + in_No + "";
		}else{
			st_Result = "エラー（100以上）";
		}
		
		//画面出力
		System.out.println(st_Result);
		
	}
}