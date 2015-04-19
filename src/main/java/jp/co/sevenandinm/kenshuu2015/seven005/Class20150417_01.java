/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven005;

/**
 * @author newemployee5
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
		String strA = "hello world ";
		System.out.println("長さ :" + strA.length());

		int index_s = strA.lastIndexOf(" ");
		System.out.println("間 :" + index_s);


		             //012345678901234567890123456789012345678901234567890123456789
		String strC = "001:123-12345678 152-0002 東京都目黒区黒本町　山田太郎";
		String strID = strC.substring(0, 4);
		String strSubID = strC.substring(5, 8);
		String strSubID2 = strC.substring(9, 17);
		String strSubID3 = strC.substring(26, (26+10));
		String strName = strC.substring(26,(26+10));
		String strConcat = "cares".concat("s");
		String strConcat1 = "cares" + "s";

		String strReplace1 = strA.replace("h", "H");
		strReplace1 = strReplace1.replace("w", "W");
		System.out.println(strReplace1);


	}

}
