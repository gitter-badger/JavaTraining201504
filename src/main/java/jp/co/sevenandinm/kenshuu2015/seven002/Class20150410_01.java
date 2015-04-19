package jp.co.sevenandinm.kenshuu2015.seven002;

//運勢とラッキーカラーの表示

public class Class20150410_01{
	public static void main (String[] args){
	String message = "";
	String st_lucky = "";	
	String st_color = "";
		
	//1.画面にメッセージを入浴
	
		message = "お名前は？";
		System.out.println(message);
		
		//2.キーボードからの出力
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		String name = stdIn.nextLine();
		
		System.out.print("こんにちは"+ name + "さん");

	//3.計算
		java.util.Random rand = new java.util.Random();
		int rand_lucky = rand.nextInt (100);
		int rand_color = rand.nextInt(9);
		
		if (rand_lucky >= 1 && rand_lucky <=10){
			st_lucky = "大吉";
		}else if (rand_lucky >= 11 && rand_lucky <=25){
			st_lucky = "中吉";
		}else if (rand_lucky >= 26 && rand_lucky <=55){
			st_lucky = "小吉";
		}else if (rand_lucky >= 56 && rand_lucky <=75){
			st_lucky = "吉";
		}else if (rand_lucky >= 76 && rand_lucky <=90){
			st_lucky = "末吉";
		}else if (rand_lucky >= 91 && rand_lucky <=100){
			st_lucky = "凶";
		}
		
		if (rand_color == 1){
			st_color = "赤";
		}else if (rand_color == 2){
			st_color = "青";
		}else if (rand_color == 3){
			st_color = "黄";
		}else if (rand_color == 4){
			st_color = "緑";
		}else if (rand_color == 5){
			st_color = "灰";
		}else if (rand_color == 6){
			st_color = "白";
		}else if (rand_color == 7){
			st_color = "黒";
		}else if (rand_color == 8){
			st_color = "紫";
		}else if (rand_color == 9){
			st_color = "小豆";
		}
		
		
	//4.結果の出力
	System.out.println("あなたの今日の運勢は" + st_lucky + "です。");
	System.out.println("あなたの今日のラッキーカラーは" + st_color + "です。");
	
 }
}