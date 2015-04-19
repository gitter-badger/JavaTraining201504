package jp.co.sevenandinm.kenshuu2015.seven002;

public class Test1 {

	public int public_v;
	protected int protected_v;
	private int private_v;
	int v;

	public Test1() {
		// TODO 自動生成されたコンストラクター・スタブ
		public_v = 1;
		protected_v = 2;
		private_v = 3;
		v = 4;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	class Test2 extends Test1 {
		void Test2() {
			this.public_v = 1;
			this.protected_v = 2;
			// this.private_v = 3;
			this.v = 4;
		}

	}

	class Test3 {
		void Test3() {
			Test1 o = new Test1();
			o.public_v = 1;
			o.protected_v = 2;
			// this.private_v = 3;
			o.v = 4;
		}
	}

}