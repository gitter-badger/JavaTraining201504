/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven008;

/**
 * @author newemployee8
 *
 */
public class Class20150417_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class20150417_01 my = new Class20150417_01();
		my.method01();
	}

	private void method01() {
		// TODO 自動生成されたメソッド・スタブ

		String strA = "hello world !!!";
		System.out.println("長さ：" + strA.length());

		int index_w =strA.indexOf('w');
		System.out.println("wの位置" + index_w);

		int index = 9 - 1;
		strA.charAt(index);
		System.out.println("9文字目:" + strA.charAt(index));

		int index_s =strA.indexOf(' ');
		System.out.println("spaceの位置" + index_s);

		int index_s2 = strA.lastIndexOf(' ');
		System.out.println("spaceの位置" + index_s2);

		System.out.println("spaceで区切った場合の配列");
		String[] strArray1 = strA.split(" ", -1);
		for(String element:strArray1){
			System.out.println(element);
		}

		String strB = "123,456,,789,012";
		System.out.println(",で区切った場合の配列①");
		System.out.println("----------------------------");
		String[] strArray2 = strB.split(",", -1);
		for(String element:strArray2){
			System.out.println(element);
		}

		System.out.println("----------------------------");
		System.out.println(",で区切った場合の配列②");
		String[] strArray3 = strB.split(",", 0);
		for(String element:strArray3){
			System.out.println(element);
		}
		System.out.println("----------------------------");

		//             012345678901234567890123456789012345678901234567890123456789
		String strC = "0001:123-12345678 152-0002 東京都目黒区目黒本庁 山田　太郎";
		String strId = strC.substring(0, 4);
		String strSubId = strC.substring(5,8);
		String strSubId2 = strC.substring(9,17);
		String strSubId3 = strC.substring(18,25);
		String strSubId4 = strC.substring(27,(27+10));
		String strSubId5 = strC.substring((27+10+1),(27+10+1+5));
		System.out.println(strId);
		System.out.println(strSubId);
		System.out.println(strSubId2);
		System.out.println(strSubId3);
		System.out.println(strSubId4);
		System.out.println(strSubId5);


		String strConcat1 = "cares".concat("s");
		String strConcat2 = "cares" + "s";
		System.out.println(strConcat1);
		System.out.println(strConcat2);

		String strReplace1 = strA.replace('h', 'H');
		System.out.println(strReplace1);

	}

}
