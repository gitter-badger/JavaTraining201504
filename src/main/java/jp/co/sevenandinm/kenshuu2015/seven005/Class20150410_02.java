package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.*;

public class Class20150410_02{
	
	public static void main(String[] args){
		
		System.out.println("お名前を教えてください。");
		Scanner stdIn = new Scanner (System.in);
		String name = stdIn.nextLine();
		System.out.println("こんにちは、 " + name + "さん^^");
		
		
		Random rnd = new Random();
		int today_unsei = rnd.nextInt(100);
		
		
		String unsei = "";
		if(0 <= today_unsei && 9 >= today_unsei){
			 unsei = "大吉";	
		}
		
		else if(10 <= today_unsei && 24 >= today_unsei){
			 unsei = "中吉";	
		}
		
		else if(25 <= today_unsei && 54 >= today_unsei){
			 unsei = "小吉";	
		}
		
		else if(55 <= today_unsei && 74 >= today_unsei){
			 unsei = "吉";	
		
		}
		else if(75 <= today_unsei && 88 >= today_unsei){
			 unsei = "末吉";	
		}

		else {
			unsei = "凶";
		}
		
		int ran_color = rnd.nextInt(9);
		
		String color = "";
		
		if(ran_color == 0){
			color = "赤";	
		}
		
		else if(ran_color == 1){
			color = "青";
		}
		
		else if(ran_color == 2){
			color = "黄";
		}
		
		else if(ran_color == 3){
			color = "緑";
		}
		
		else if(ran_color == 4){
			color = "灰";
		}
		
		else if(ran_color == 5){
			color = "白";
		}
		
		else if(ran_color == 6){
			color = "黒";
		}
		
		else if(ran_color == 7){
			color = "紫";
		}
		
		else{
			color = "あずき";
		}
		
		
		System.out.println("あなたの今日の運勢は " + unsei + "です^^");
		System.out.println("あなたのラッキーカラーは " + color + "色です^^");
		
		
	}
	
	
}

