package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150410_01{
	public static void main(String[] args){
		String st_Message = "";
		String st_Name = "";
		String st_Fortune = "";
		String st_Color = "";
		
		//メッセージ画面
		st_Message = "お名前は：";
		System.out.print(st_Message);
		
		//入力画面
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		st_Name = stdIn.next();
		
		System.out.println("こんにちは" + st_Name + "さん。");
		
		//乱数形成
		java.util.Random rnd = new java.util.Random();
		int ran_Fortune = rnd.nextInt(100);
		int ran_Color = rnd.nextInt(9);
		
		//条件分岐
		if(ran_Fortune >= 0 && ran_Fortune <= 9){
			st_Fortune = "大吉";
		}else if(ran_Fortune >= 10 && ran_Fortune <= 24){
			st_Fortune = "中吉";
		}else if(ran_Fortune >= 25 && ran_Fortune <= 54){
			st_Fortune = "少吉";
		}else if(ran_Fortune >= 55 && ran_Fortune <= 74){
			st_Fortune = "吉";
		}else if(ran_Fortune >= 75 && ran_Fortune <= 89){
			st_Fortune = "末吉";
		}else{
			st_Fortune = "凶";
		}
		
		if(ran_Color == 0){
			st_Color = "赤";
		}else if(ran_Color == 1){
			st_Color = "青";
		}else if(ran_Color == 2){
			st_Color = "黄";
		}else if(ran_Color == 3){
			st_Color = "緑";
		}else if(ran_Color == 4){
			st_Color = "灰";
		}else if(ran_Color == 5){
			st_Color = "白";
		}else if(ran_Color == 6){
			st_Color = "黒";
		}else if(ran_Color == 7){
			st_Color = "紫";
		}else{
			st_Color = "小豆";
		}
		
		
		//結果出力
		System.out.println("あなたの今日の運勢は「" + st_Fortune + "」です");
		System.out.println("あなたの今日のラッキーカラーは「" + st_Color + "」です");
	}
}
