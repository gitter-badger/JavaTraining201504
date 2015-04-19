package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Scanner;
public class Class20150416_03{
	public static void main(String[] args) {
		// 同じ値になるはず
		double d1 = 1.0 - 0.9;
		double d2 = 1.0/10.0;
		// 比較
		System.out.println(d1 == d2);
		// プリント
		System.out.println(d1);
		System.out.println(d2);
		// 16進数表現
		System.out.println(Long.toHexString(Double.doubleToLongBits(d1)));
		System.out.println(Long.toHexString(Double.doubleToLongBits(d2)));
	}
}