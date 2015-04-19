/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven004;

/**
 * @author newemployee4
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

		String strA = "Hello World";
		System.out.println("長さ"+ strA.length());

		int index_w=strA.indexOf("w");
		System.out.println(index_w);
		int index=9-1;
		System.out.println("９文字目："+strA.charAt(index));
		int index_s=strA.indexOf(" ");
		System.out.println(index_s);

		int index_s2=strA.lastIndexOf(" ");
		System.out.println("spaceの位置:"+index_s2);

		System.out.println("spaceで区切った場合の配列");
		String[] strArray = strA.split(" ", -1);
		for (String element : strArray){
			System.out.println(element);
		}
		             //0123456789012345678901234567890123456789012345678901234567890
		String strC = "0001:1223-12345678 152-0002 東京都目黒区黒本町　山田　太郎";
		String strID=strC.substring(0,4);
		String strSubID2=strC.substring(5,6);
		String strSubID3=strC.substring(9,17);
		String strYubinNo=strC.substring(18,26);
		String strAdress=strC.substring(27,(27+10));
		String strName=strC.substring((27+10+1),(27+10+1+5));
		System.out.println( strC.substring(0,43));

		String strReplace= strA.replace("H","h");
		System.out.println(strReplace);

	}

	private void method01() {
		// TODO 自動生成されたメソッド・スタブ

	}

}

