package jp.co.sevenandinm.kenshuu2015.seven006;

import java.util.Date;

public class App {
	static CreateUserID my = new CreateUserID();

	public static void main(String[] args) {

		Date today=new Date();
		String userID = my.getUserId(today);
		System.out.println(userID);
		String userID1 = my.getUserId(today);
		System.out.println(userID1);
		String userID2 = my.getUserId(today);
		System.out.println(userID2);

	}

}
