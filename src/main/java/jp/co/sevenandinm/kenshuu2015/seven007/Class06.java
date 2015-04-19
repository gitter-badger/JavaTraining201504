package jp.co.sevenandinm.kenshuu2015.seven007;

public class Class06{
	public static void main(String[] args){
			
		String name = "";
		int ran;
		int ran_time;
		
	
		System.out.print("お名前は:");
		
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		name = stdIn.nextLine();
		
		System.out.println("こんにちは" +name +"さん。");
		
		java.util.Random rand = new java.util.Random();
		ran = rand.nextInt(10);
		ran_time = rand.nextInt(24);
		
		System.out.println("あなたのラッキーナンバーは" +ran +"です。");
		System.out.println("あなたのラッキータイムは" +ran_time +"です。");
		
		
	}
}


