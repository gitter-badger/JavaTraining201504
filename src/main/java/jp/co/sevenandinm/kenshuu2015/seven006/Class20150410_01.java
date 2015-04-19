package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class20150410_01{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String userFortune = fortunes();
		String luckeyColor = luckeyColor();

		System.out.print("お名前は：");
		String userName = scan.nextLine();
		System.out.println("こんにちは"+userName);
		System.out.println("あなたの今日の運勢は「"+userFortune+"」です");
		System.out.println("あなたの今日のラッキーカラーは「"+luckeyColor+"」です。");
		
	}
	
	private static String   fortunes(){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		String userFortune="";
		
		int ran =rnd.nextInt(100);
		if(ran<10){
			userFortune="凶";
		}
		else if(10<=ran&&ran<25){
			userFortune="末吉";
		}
		else if(25<=ran&&ran<45){
			userFortune="吉";
		}
		else if(45<=ran&&ran<75){
			userFortune="小吉";
		}
		else if(75<=ran&&ran<90){
			userFortune="中吉";
		}
		else{
			userFortune="大吉";
		}
	return userFortune;
		
	}
	
	private static String luckeyColor(){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int ran =rnd.nextInt(6);
		 String colorBox[]={"赤","青","緑","黄","白","黒"};
		return colorBox[ran];
	}
}
