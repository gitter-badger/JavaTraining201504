package jp.co.sevenandinm.kenshuu2015.maekawa;


public class App {

	public App() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println( "Hello World!" );



		// p56.UserID発行するためのクラス
		System.out.println( "【演習】：p56.UserID発行するためのクラス" );

//		int renban = 0;
//		Date today = new Date();

		CreateUserID my = new CreateUserID();
		String userID1 = my.createUserId();
		System.out.println(userID1);
		String userID2 = my.createUserId();
		System.out.println(userID2);
		String userID3 = my.createUserId();
		System.out.println(userID3);


	}

}
