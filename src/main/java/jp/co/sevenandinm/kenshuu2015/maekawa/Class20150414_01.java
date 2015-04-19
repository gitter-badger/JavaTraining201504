package jp.co.sevenandinm.kenshuu2015.maekawa;

import java.util.Scanner;
import java.util.Collections;
import java.lang.Integer;
import java.util.Arrays;

public class Class20150414_01 {

	public Class20150414_01() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// int n = Integer.parseInt(args[0]);

		Scanner stdIn = new Scanner(System.in);
		System.out.print("10進数の数字をひとつ入力してください。：");
		int n = stdIn.nextInt();

		if (n < 0) {
			System.out.println("非負の整数値を入力してください");
		} else {
			System.out.println(n + " の階乗 = " + factorial2(n));
		}
		
	}

	/**
	 * 階乗 for ループを使ったアプローチ
	 *
	 * @param n
	 * @return
	 */
	private static long factorial0(int n) {
		long fact = 1;
		if (n == 0)
			return fact;
		else { // in case of n > 0
			for (int i = n; i > 0; i--) {
				fact *= i;
			}
			return fact;
		}
	}

	/**
	 * 階乗 再帰呼び出し 1
	 *
	 * 出力例
	 *
	 * 10進数の数字をひとつ入力してください。：5
	 * factorial1(5) が読み出されます。まだ計算待ちがあります。
	 * factorial1(4) が読み出されます。まだ計算待ちがあります。
	 * factorial1(3) が読み出されます。まだ計算待ちがあります。
	 * factorial1(2) が読み出されます。まだ計算待ちがあります。
	 * factorial1(1) が読み出されます。まだ計算待ちがあります。
	 * 最後までいったので、計算を開始します。
	 * 5 の階乗 = 120
	 *
	 * @param n
	 * @return
	 */
	private static long factorial1(int n) {
		long intRet = 1;
		if (n == 0) {
			System.out.println("最後までいったので、計算を開始します。");
			;
		} else {
			System.out.println("factorial1(" + n + ") が読み出されます。まだ計算待ちがあります。");
			intRet = n * factorial1(n - 1);
		}
		return intRet;
	}

	/**
	 * 階乗 再帰呼び出し 2 より簡素な表現：3項演算子
	 *
	 * @param n
	 * @return
	 */
	private static long factorial2(int n) {
		return n == 0 ? 1 : n * factorial2(n - 1);
	}

}
