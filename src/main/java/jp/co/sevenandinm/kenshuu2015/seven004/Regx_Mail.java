package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.Scanner;

public class Regx_Mail {
	public static void  main(String[] args) {

	Scanner stdIn = new Scanner(System.in);
	String address = stdIn.nextLine();
	System.out.println(Mailcheck(address));

	}

	public static boolean Mailcheck(String address) {
		   String pattern = "^^([a-zA-Z0-9])+([a-zA-Z0-9._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9._-]+)+$";

		   boolean flag=address.matches(pattern);

	if(flag){
		System.out.println("メールアドレスとして正しいです");
	}else{
		System.out.println("メールアドレスとして正しくありません");
	}
	return flag;
	}
}
