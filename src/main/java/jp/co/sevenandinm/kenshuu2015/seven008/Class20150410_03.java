package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150410_03{
	public static void main(String[] args){
		String st_Message = "";
		String st_Result = "";
		int in_Sum = 0;
		
		//メッセージ画面
		st_Message = "数値を入力してください";
		System.out.print(st_Message);
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int in_Flag = stdIn.nextInt();
		
		//繰り返し
		int i = 0;
		for(i = 1; i <= in_Flag; i++){
			in_Sum = in_Sum + i;
		}
		
		st_Result = "結果は" + in_Sum + "です";
		System.out.println(st_Result);
	}
}

