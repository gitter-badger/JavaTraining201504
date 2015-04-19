package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.*;
public class Class06{
	public static void main(String [] args){
	
		Scanner scan = new Scanner(System.in);
		int luckeyNumber=(int)Math.floor(Math.random()*6)+1;
		int luckeyTime=(int)Math.floor(Math.random()*23)+1;
		Random rnd=new Random();
		int ran =rnd.nextInt(10);
		
		System.out.print("お名前は:");
		String userName = scan.nextLine();
		System.out.println("こんにちは"+userName+"さん");
		System.out.println("あなたの今日のラッキーナンバーは「"+luckeyNumber+"」です。");
		System.out.println("あなたの今日のラッキータイムは"+luckeyTime+"時です。");
		System.out.println(ran);
	}
	
	public static void MaxNum(){
		
	}
	
}