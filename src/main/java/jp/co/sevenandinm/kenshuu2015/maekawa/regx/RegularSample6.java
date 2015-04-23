/**
 * 正規表現
 * 置換
 * すべて置換する例
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import java.util.regex.Matcher;

/**
 * @author teacher4
 *
 */
public class RegularSample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sample1();
		sample2();
		sample3();
		sample4();
		sample5();
	}

	/**
	 * 特定の範囲([$]でマーキング)の特定の桁の数字部分だけ、別の文字列に変換する例
	 */
	private static void sample1() {
		String str = "★$01234$★$9876$★$98765$★";

		str = str.replaceAll("\\$(\\d{5})\\$", "Hello!");// ★Hello!★$9876$★Hello!★

		System.out.println(str);
	}

	/**
	 * 特定の範囲([$]でマーキング)の特定の桁の数字部分だけ、マーキング（[$]）なしの数字の文字列に変換する例
	 */
	private static void sample2() {
		String str = "★$01234$★$9876$★$98765$★";

		str = str.replaceAll("\\$(\\d{5})\\$", "$1");// ★01234★$9876$★98765★

		System.out.println(str);
	}

	/**
	 * replaceメソッドは正規表現による置換は行わない
	 */
	private static void sample3() {
		String str = "★$01234$★$9876$★$98765$★";

		str = str.replace("\\$(\\d{5})\\$","$1");// ★$01234$★$9876$★$98765$★

		System.out.println(str);
	}

	/**
	 * replaceメソッドは正規表現による置換は行わないため、これも思うようにいかない
	 */
	private static void sample4() {
		String str = "★$01234$★$9876$★$98765$★";

		str = str.replace("$01234$","$1");//
		str = str.replace("$98765$","$1");//

		System.out.println(str);
	}

	/**
	 * replaceメソッドでも正規表現を使うには。。
	 */
	private static void sample5() {
		String str = "★$01234$★$9876$★$98765$★";

		str = str.replace("\\$(\\d{5})\\$", Matcher.quoteReplacement("$1"));

		System.out.println(str);
	}

}
