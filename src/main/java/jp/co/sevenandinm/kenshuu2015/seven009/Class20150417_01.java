/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven009;

/**
 * @author newemployee9
 *
 */
public class Class20150417_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class20150417_01 my =new Class20150417_01();
		my.method01();
	}

	private void method01() {
		// TODO 自動生成されたメソッド・スタブ

			//文字の長さ
			String strA ="hello world !!!";
			System.out.println("長さ："+ strA.length());

			//wの位置
			int index_w = strA.indexOf('w');
			System.out.println("wの位置"+ index_w);

			//九文字目は何か
			int index = 9 - 1;
			System.out.println("9文字目:"+ strA.charAt(index));

			//指定した文字はどこにあるか（前から
			int index_s =strA.indexOf(' ');
			System.out.println("speceの位置："+ index_s);

			//指定した文字はどこにあるか（後ろから
			int index_s2 = strA.lastIndexOf(' ');
			System.out.println("speceの位置："+ index_s2);


			//指定した文字で区切って配列
			String strB ="123,456,,789,012,";
			System.out.println("スペースで区切った場合の配列");
			String [] strArray1 = strB.split(",", -1);
			for(String element : strArray1){
				System.out.println(element);
			}

			//指定した文字で区切って配列
			String strBC ="123,456,,789,012,";
			System.out.println("スペースで区切った場合の配列");
			String [] strArray2 = strBC.split(",", 0);
			for(String element : strArray2){
				System.out.println(element);
			}

			//            01234567890123456789012345678901234567890123456789012345678
			String strC ="0001:123-12345678 152-0002 東京都目黒区目黒本町 山田　太郎";
				System.out.println(strC.substring(1,4));
				String SubID = strC.substring(5, 8);
				String SubID2 = strC.substring(9, 17);
				System.out.println (SubID);
				System.out.println (SubID2);
				String SubYubin = strC.substring(18, 26);
				String SubAdress = strC.substring(27,27 + 10 );
				System.out.println (SubYubin);
				System.out.println (SubAdress);
				String SubName = strC.substring(27+ 10+ 1 ,27 + 10 + 6 );
				System.out.println(SubName);

				String strConcat = "cares" .concat("s");
				String strConcat2 = "cares" +"s";

				String strReplace1 =strA.replace("h", "H");
				strReplace1 = strReplace1.replace('w', 'W');
				System.out.println(strReplace1);





	}

}
