package jp.co.sevenandinm.kenshuu2015.maekawa;

public class FloatDemo {

	public FloatDemo() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 同じ値になるはず
				double d1 = 1.0 - 0.9;
				double d2 = 1.0/10.0;
				// 比較
				System.out.println(d1 == d2);
				// プリント
				System.out.println("d1:" + d1);
				System.out.println("d2:" + d2);
				// 16進数表現
				System.out.println(Long.toHexString(Double.doubleToLongBits(d1)));
				System.out.println(Long.toHexString(Double.doubleToLongBits(d2)));
	}

}
