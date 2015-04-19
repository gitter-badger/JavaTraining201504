package jp.co.sevenandinm.kenshuu2015.seven002;

//1からnまでの和

public class Class20150410_03{
	public static void main (String[] args){
	String message = "";
	//String st_result = "";	
			
	//1.画面にメッセージを入浴
	
		message = "数値入力";
		System.out.println(message);
		
		//2.キーボードからの出力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		int in_number = stdIn.nextInt();
		
		//3.計算
		int sum = 0;
		for (int i=1; i <= in_number;i++){
			sum+= i;
		}
		
		
		
		
				
	//4.結果の出力
	System.out.println(sum);
	
	 }
	}
	