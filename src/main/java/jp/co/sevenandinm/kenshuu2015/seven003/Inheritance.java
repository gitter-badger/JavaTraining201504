package jp.co.sevenandinm.kenshuu2015.seven003;


public class Inheritance {


		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			Inheritance my = new Inheritance();
			my.execute01();
		}


		private void execute01() {
			Child child = new Child();
			System.out.println(child.fieldA); // field A
			System.out.println(child.fieldB); // field B
			System.out.println(child.methodA()); // method A
			System.out.println(child.methodB()); // method B
			System.out.println("継承の事例１:サブクラスは、親クラスのフィールドやメソッドを引き継ぐことができる");


		}
}

