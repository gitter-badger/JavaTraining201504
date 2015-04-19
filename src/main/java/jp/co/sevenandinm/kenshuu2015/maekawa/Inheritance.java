package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Inheritance {

	/**
	 * 継承についての学習
	 * 参考
	 * http://d.hatena.ne.jp/ryoasai/20110623/1308841453
	 *
	 */
	public Inheritance() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Inheritance my = new Inheritance();
		my.execute01();
		my.execute02();
		my.execute03();
		my.execute04();
		my.execute05();
		my.execute06();
		// 初期化ブロック
		// static 初期化ブロック

	}

	/**
	 * コンストラクタは継承されない
	 * 呼び出しの順序に注意
	 */
	private void execute06() {
		// TODO 自動生成されたメソッド・スタブ
		Parent parent = new Parent(); //Parent no args constructor
        Parent parent2 = new Parent("test"); //Parent one arg constractor arg = test
        System.out.println("ここから注目！");
        Child5 child = new Child5(); // Parent no args constructor, Child no args constructor
	}

	/**
	 * 継承の事例５ staticメソッドについて調査.
	 * 通常はこのようなことはやりません.
	 */
	private void execute05() {
		// TODO 自動生成されたメソッド・スタブ
		Child4 child = new Child4();
        Parent parent = child;

        System.out.println(parent.staticMethodA()); // method A
        System.out.println(child.staticMethodA());  // method A in Child4

        System.out.println(((Parent)child).staticMethodA()); // method A

		System.out.println(Parent.staticMethodA()); // static method A
        System.out.println(Child4.staticMethodA()); // static method A in Child4
	}

	/**
	 * 継承の事例４ 引数への代入
	 * @param parent
	 */
	private void execute04() {
		// TODO 自動生成されたメソッド・スタブ
		someMethod(new Child2());
		someMethod(new Child3());

	}

	/**
	 * 引数を親の型にして処理
	 * @param parent
	 */
	private void someMethod(Parent parent) {
		// parentを使って何らかの処理
		System.out.println(parent.methodA()); // method A
		System.out.println(parent.fieldA); // field A
		System.out.println("継承の事例４:メソッドはポリモーフィックになる。");
		System.out.println("注意点:継承の事例４:フィールドは宣言されている変数の型で決まる。");
	}

	/**
	 * 継承の事例３ 型の継承
	 */
	private void execute03() {
		// TODO 自動生成されたメソッド・スタブ
		Child2 child = new Child2();
		Parent parent = child; // コンパイルOK
		System.out.println(parent.fieldA); // field A
		// System.out.println(parent.fieldB); // field B
		System.out.println(parent.methodA()); // method A in Child2
		// System.out.println(parent.methodB()); // method B
		System.out.println("継承の事例３:Child2 is a Parent と言うことができる。");
		System.out
				.println("注意点:親の型で宣言されているが、実態はサブクラスのインスタンスなのでサブクラスのmethodAが呼び出される。");
		System.out.println("別のたとえ：「筆記用具で文字を書く」：※実際には鉛筆をつかって書いているはずです。");

	}

	/**
	 * 継承の事例２ オーバーライド：子クラスが親クラスと同じ形（シグネチャ）のメソッドを定義している場合
	 */
	private void execute02() {
		// TODO 自動生成されたメソッド・スタブ
		Child2 child = new Child2();
		System.out.println(child.fieldA); // field A
		System.out.println(child.fieldB); // field B
		System.out.println(child.methodA()); // method A
		System.out.println(child.methodB()); // method B
		System.out.println("継承の事例２:親クラスのメソッドをサブクラスで再定義することができる");
	}

	/**
	 * 継承の事例１ サブクラスは、親クラスのフィールドやメソッドを引き継ぐことができることを確認する。
	 */
	private void execute01() {
		Child child = new Child();
		System.out.println(child.fieldA); // field A
		System.out.println(child.fieldB); // field B
		System.out.println(child.methodA()); // method A
		System.out.println(child.methodB()); // method B
		System.out.println("継承の事例１:サブクラスは、親クラスのフィールドやメソッドを引き継ぐことができる");
	}

}
