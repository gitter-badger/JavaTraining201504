package jp.co.sevenandinm.kenshuu2015.seven002;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CreateUserID my = new CreateUserID();
		String userid = my.createUserId(new Date());
		System.out.println(userid);
	}

}
