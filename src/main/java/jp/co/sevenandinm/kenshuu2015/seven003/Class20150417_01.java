/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven003;

/**
 * @author newemployee3
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

		int index_w =  strA.indexOf('w');
		System.out.println("wの位置:" + index_w);

		int index = 9 - 1;
		System.out.println("9文字目:"  + strA.charAt(index));

		int index_s = strA.indexOf(' ');
		System.out.println("spaceの位置:" + index_w + strA.charAt(index_s));

		int index_s2 = strA.lastIndexOf(' ');
		System.out.println("spceの位置:" + index_s2);

		System.out.println("-------------------------");
		String strB = "123,456,,789,012,";
		System.out.println("spaceで区切った場合の配列");

		String[] strArray = strB.split(",", -1);
		for (String element : strArray){
			System.out.println(element);

		}
			System.out.println("-------------------------");

			String[] strArray2 = strB.split(",", -1);
			for (String element : strArray2){
				System.out.println(element);

			}
				System.out.println("-------------------------");

					//         0123456789012345678901234567890123456789012345678901234567
				String strC = "0001:123-12345678 152-0002 東京都目黒区目黒本町 山田　太郎";
				String strID = strC.substring(0,4);
				String strSubID = strC.substring(5,8);
				String strSubID2 = strC.substring(9,17);
				String strYubinNo = strC.substring(18,26);
				String strAddress = strC.substring(27,(27+10));
				String strName = strC.substring((27+10+1),(27+10+1+5));
				String strConcat = "cares".concat("s");
				String strConcat1 = "cares" + "s";
				String strReplace1 = strA.replace ('h', 'H');
				strReplace1  = strReplace1.replace('w', 'W');

				System.out.println(strReplace1);

	}

}
