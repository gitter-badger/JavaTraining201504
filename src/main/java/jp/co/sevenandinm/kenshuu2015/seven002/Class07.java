package jp.co.sevenandinm.kenshuu2015.seven002;

//10個の数字を表示させます

public class Class07{
	public static void main (String[] args){
	String message = "";
	
		
	//1.画面にメッセージを入浴
	
		message = "お名前は？";
		System.out.println(message);
		
		//2.キーボードからの出力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String name = stdIn.nextLine();
		
		System.out.print("こんにちは"+ name + "さん");

	//3.計算
		java.util.Random rnd = new java.util.Random();
		int ran = rnd.nextInt (10);
		int ran_time = rnd.nextInt(24);
		
	//4.結果の出力
	System.out.println("あなたの今日のラッキーナンバーは" + ran + "です。");
	System.out.println("あなたの今日のラッキータイムは" + ran_time + "です。");
	
 }
}