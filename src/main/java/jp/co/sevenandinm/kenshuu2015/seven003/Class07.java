package jp.co.sevenandinm.kenshuu2015.seven003;

public class Class07 {
	public static void main(String[] args) {
	
	//画面にメッセージを出力
	System.out.println("名前を入力してください。");
	
	
	//キーボードからの入力
	java.util.Scanner stdIn = new java.util.Scanner (System.in);
	String name = stdIn.nextLine();
	
		System.out.println("こんにちは、" + name + "さん。");
	
	//乱数処理
	java.util.Random rnd = new java.util.Random();
	int ran = rnd.nextInt(10);
	int ran_time = rnd.nextInt(24);
	
	//結果の出力
	System.out.println("あなたのラッキーナンバーは" + ran + "です。");
	System.out.println("あなたのラッキータイムは" + ran_time + "です。");
	
	
	}
	
	}