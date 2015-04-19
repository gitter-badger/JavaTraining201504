package jp.co.sevenandinm.kenshuu2015.seven009;

public class Class20150410_01{
	public static void main (String[] args){
		String unnsei = "";
		String color ="";
	//メッセージを表示
		System.out.println("お名前は？");
		
	//名前を入力してもらう
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
			String name = stdIn.next();	
		
	//こんにちは名前さん表示
		System.out.println("こんにちは、" + name + "さん。");
	
	//運勢の乱数
		java.util.Random rnd = new java.util.Random();
			int ran = rnd.nextInt(100);
		
	//運勢if文
		if ( 0 <= ran && ran <= 9 ){
			 unnsei = "大吉";
		}else if( 10 <= ran && ran <= 24 ){
			 unnsei = "中吉";
		}else if( 25 <=  ran && ran <= 54 ){
			 unnsei = "小吉";
		}else if( 55 <=  ran && ran <= 74 ){
			 unnsei = "吉";
		}else if( 75 <= ran && ran <= 89 ){
			 unnsei = "末吉";
		}else {
			 unnsei = "凶";
			
		}	
		
	//色の乱数
		java.util.Random rnd2 = new java.util.Random();
			int ran2 = rnd2.nextInt(9);
		
	//色if文
		if ( ran2 == 0 ){
			 color = "赤";
		}else if( ran2 == 1 ){
			  color = "青";
		}else if( ran2 == 2 ){
			  color = "黄";
		}else if( ran2 == 3 ){
			  color= "緑";
		}else if( ran2 == 4 ){
			  color = "灰色";
		}else if( ran2 == 5 ){
			  color = "黒";
		}else if( ran2 == 6 ){
			 color = "白";
		}else if( ran2 == 7 ){
			  color = "紫";
		}else{
			  color = "小豆";	
		}	
	
		//運勢を表示
		System.out.println ("あなたの運勢は「"+ unnsei +"」です");
		System.out.println ("あなたのラッキーカラーは「"+ color +"」です");
	}
}