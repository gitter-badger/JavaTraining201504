package jp.co.sevenandinm.kenshuu2015.seven005;

import java.util.*;

public class Class06
{
	public static void main(String[] args){
		
		System.out.println("お名前を教えてください");
		Scanner stdIn = new Scanner (System.in) ;
		String name = stdIn.nextLine();
		System.out.println("こんにちは、" + name +"さん");
		
		Random rnd = new Random();
		int ran = rnd.nextInt(10);
		int ran_time = rnd.nextInt(24);
		
		System.out.println("あなたの今日のラッキーナンバーは" + ran +"です。");
		System.out.println("あなたの今日のラッキータイムは、" + ran_time +"時です。");
		
	}
}


