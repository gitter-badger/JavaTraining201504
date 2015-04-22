package jp.co.sevenandinm.kenshuu2015.seven001;

public class Inheritance {
	public Inheritance(){

	}

public static void main(String[] args){


	Inheritance my = new Inheritance();
	my.execute01();
	my.execute02();
	my.execute03();
	my.execute04();
	my.execute05();
//	my.execute06();

	}
private void execute01() {
	Child child = new Child();
	System.out.println(child.fieldA); // field A
	System.out.println(child.fieldB); // field B
	System.out.println(child.methodA()); // method A
	System.out.println(child.methodB()); // method B
	System.out.println("継承の事例１:サブクラスは、親クラスのフィールドやメソッドを引き継ぐことができる");
}

private void execute02() {
	// TODO 自動生成されたメソッド・スタブ
	Child2 child = new Child2();
	System.out.println(child.fieldA); // field A
	System.out.println(child.fieldB); // field B
	System.out.println(child.methodA()); // method A
	System.out.println(child.methodB()); // method B
	System.out.println("継承の事例２:親クラスのメソッドをサブクラスで再定義することができる");
}
private void execute03() {
	Child2 child = new Child2();
	Parent parent = child; // コンパイルOK
	System.out.println(parent.fieldA); // field A
	// System.out.println(parent.fieldB); // field B
	System.out.println(parent.methodA()); // method A in Child2
	// System.out.println(parent.methodB()); // method B
	System.out.println("継承の事例３:Child2 is a Parent と言うことができる。");
	System.out.println("注意点:親の型で宣言されているが、実態はサブクラスのインスタンスなのでサブクラスのmethodAが呼び出される。");
	System.out.println("別のたとえ：「筆記用具で文字を書く」：※実際には鉛筆をつかって書いているはずです。");

}

private void execute04() {

	someMethod(new Child2());
	someMethod(new Child3());

}

private void someMethod(Parent parent) {
	// parentを使って何らかの処理
	System.out.println(parent.methodA()); // method A
	System.out.println(parent.fieldA); // field A
	System.out.println("継承の事例４:メソッドはポリモーフィックになる。");
	System.out.println("注意点:継承の事例４:フィールドは宣言されている変数の型で決まる。");
}
private void execute05() {
	Child4 child = new Child4();
    Parent parent = child;

    System.out.println(parent.staticMethodA()); // method A
    System.out.println(child.staticMethodA());  // method A in Child4

    System.out.println(((Parent)child).staticMethodA()); // method A

	System.out.println(Parent.staticMethodA()); // static method A
    System.out.println(Child4.staticMethodA()); // static method A in Child4
}
}
