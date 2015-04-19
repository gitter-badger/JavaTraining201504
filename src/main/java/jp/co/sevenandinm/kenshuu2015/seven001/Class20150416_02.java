package jp.co.sevenandinm.kenshuu2015.seven001;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Class20150416_02 {

	/**
	 *
	 */
	public Class20150416_02() {

	}

	/**
	 * 配列比較のためのプログラム.
	 * refs #433 二つの配列が等しいかどうかを判定するプログラム
	 *
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		execute();

	}

	private static void execute() {
		System.out.print("◆配列Aの要素を入力します。まず配列の要素数を設定してください。:");
		Scanner stdIn1 = new Scanner(System.in);
		int hashSetASize = stdIn1.nextInt();
		TreeSet<Integer> hashSetA = new TreeSet<Integer>();
		Integer[] intA = addArray(stdIn1, hashSetASize, hashSetA);

		System.out.print("◆配列Bの要素を入力します。まず配列の要素数を設定してください。:");
		int hashSetBSize = stdIn1.nextInt();
		TreeSet<Integer> hashSetB = new TreeSet<Integer>();
		Integer[] intB = addArray(stdIn1, hashSetBSize, hashSetB);

		displayOut(stdIn1,intA, intB);
	}

	/**
	 * 出力.
	 *
	 * @param intA
	 * @param intB
	 */
	private static void displayOut(Scanner stdIn1,Integer[] intA, Integer[] intB) {
		if (Arrays.equals(intA ,intB)){
			System.out.println("入力された数値はすべて一致しています。");
		}else {
			System.out.println("入力された数値のすべては一致してません。retry? [y/n]");
			String ret = stdIn1.next();
			if("y".equals(ret)){
				execute();
			}
		}
	}

	/**
	 * 要素を昇順にまとめなおして配列を作成.
	 *
	 * @param stdIn1
	 * @param hashSetASize
	 * @param hashSetA
	 * @return
	 */
	private static Integer[] addArray(Scanner stdIn1, int hashSetASize,
			TreeSet<Integer> hashSetA) {
		for(int i = 0; i < hashSetASize ; i++){
			System.out.print("配列Aの要素を整数で入力：");
			hashSetA.add(stdIn1.nextInt());
		}
		Integer[] intA = new Integer[hashSetASize];
		hashSetA.toArray(intA);
		return intA;
	}

}
