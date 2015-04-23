/**
 * 正規表現
 * 置換
 * すべて置換する例
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author teacher4
 *
 */
public class RegularSample5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sample1();
		sample2();
	}

	/**
	 *
	 */
	private static void sample1() {
		String str = "Orange is 100yen, Banana is 180yen.";
//		String str = "Orangeis100yen,Bananais180yen.";

		String ret = str.replaceAll("yen", "YEN");

		System.out.println(ret);// Orange is 100YEN, Banana is 180YEN.
	}

	/**
	 *
	 */
	private static void sample2() {
		// TODO 自動生成されたメソッド・スタブ
		String str = "Orange is 100yen, Banana is 180yen.";
		String regex = "yen";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(str);
		String result = m.replaceAll("YEN");
		System.out.println(result);//
	}

}
