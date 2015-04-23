package jp.co.sevenandinm.kenshuu2015.seven008;


public class Class20150420_01_Inheritance {

	public static void main(String[] args){
	Class20150420_01_Inheritance my = new Class20150420_01_Inheritance();
	my.execute01();
	my.execute02();
	my.execute03();
	my.execute04();
	my.execute05();
	my.execute06();
	}

	private void execute01(){
		Class20150420_01_Child01 child = new Class20150420_01_Child01();
		System.out.println(child.fieldA); // field A
		System.out.println(child.fieldB); // field B
		System.out.println(child.methodA()); // method A
		System.out.println(child.methodB()); // method B
		System.out.println("継承の事例１:サブクラスは、親クラスのフィールドやメソッドを引き継ぐことができる");
	}

	private void execute02(){
		Class20150420_01_Child02 child = new Class20150420_01_Child02();
		System.out.println(child.fieldA);
		System.out.println(child.fieldB); // field B
		System.out.println(child.methodA()); // method A
		System.out.println(child.methodB()); // method B
		System.out.println("継承の事例２:親クラスのメソッドをサブクラスで再定義することができる");
	}

	private void execute03() {
		Class20150420_01_Child02 child = new Class20150420_01_Child02();
		Class20150420_01_Parent parent = child; // コンパイルOK
		System.out.println(parent.fieldA); // field A
		// System.out.println(parent.fieldB); // field B
		System.out.println(parent.methodA()); // method A in Child2
		// System.out.println(parent.methodB()); // method B
		System.out.println("継承の事例３:Child2 is a Parent と言うことができる。");
		System.out
				.println("注意点:親の型で宣言されているが、実態はサブクラスのインスタンスなのでサブクラスのmethodAが呼び出される。");
		System.out.println("別のたとえ：「筆記用具で文字を書く」：※実際には鉛筆をつかって書いているはずです。");

	}

	private void someMethod(Class20150420_01_Parent parent) {
		// parentを使って何らかの処理
		System.out.println(parent.methodA()); // method A
		System.out.println(parent.fieldA); // field A
		System.out.println("継承の事例４:メソッドはポリモーフィックになる。");
		System.out.println("注意点:継承の事例４:フィールドは宣言されている変数の型で決まる。");
	}

	private void execute04() {
		// TODO 自動生成されたメソッド・スタブ
		someMethod(new Class20150420_01_Child02());
		someMethod(new Class20150420_01_Child03());
	}

	private void execute05() {
		// TODO 自動生成されたメソッド・スタブ
		Class20150420_01_Child04 child = new Class20150420_01_Child04();
		Class20150420_01_Parent parent = child;

        System.out.println(parent.staticMethodA()); // method A
        System.out.println(child.staticMethodA());  // method A in Child4

        System.out.println(((Class20150420_01_Parent)child).staticMethodA()); // method A

		System.out.println(Class20150420_01_Parent.staticMethodA()); // static method A
        System.out.println(Class20150420_01_Child04.staticMethodA()); // static method A in Child4
	}

	private void execute06() {
		// TODO 自動生成されたメソッド・スタブ
		Class20150420_01_Parent parent = new Class20150420_01_Parent(); //Parent no args constructor
		Class20150420_01_Parent parent2 = new Class20150420_01_Parent("test"); //Parent one arg constractor arg = test
        System.out.println("ここから注目！");
        Class20150420_01_Child05 child = new Class20150420_01_Child05(); // Parent no args constructor, Child no args constructor
	}
}
