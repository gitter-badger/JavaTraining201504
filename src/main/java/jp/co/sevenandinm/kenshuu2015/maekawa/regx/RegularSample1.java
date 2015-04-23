/**
 * 正規表現
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

/**
 * @author Administrator
 *
 */
public class RegularSample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] strs = { "a", "aaa", "bccd", "bcaacd", "fgcdaa", "bcaacaad" };
		String reg = "a*";
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].matches(reg)) {
				System.out.println("文字列" + (i + 1) + ":\"" + strs[i]
						+ "\"は、正規表現\"" + reg + "\"にマッチする");
			} else {
				System.out.println("文字列" + (i + 1) + ":\"" + strs[i]
						+ "\"は、正規表現\"" + reg + "\"にマッチしない");
			}
		}
	}

}
