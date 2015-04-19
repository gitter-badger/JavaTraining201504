package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class07{
	public static void main(String[] args){
		String st_message = "";
		String st_name = "";
		
		st_message = "お名前は：";
		System.out.print(st_message);
		
		
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
		st_name = stdIn.next();
		
		System.out.println("こんにちわ" + st_name + "さん。");
		
		
		java.util.Random rnd = new java.util.Random();
		int Ran_No = rnd.nextInt(10);
		int Ran_Time = rnd.nextInt(24);
		
		System.out.println("あなたのラッキーナンバーは「" + Ran_No + "」です");
		System.out.println("あなたのラッキータイムは「" + Ran_Time + "」です");
	}
}