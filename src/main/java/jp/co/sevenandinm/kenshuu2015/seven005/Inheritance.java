package jp.co.sevenandinm.kenshuu2015.seven005;

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
		my.execute06();
	}


	private void execute06(){
		System.out.println(" ");
		System.out.println("execute6");
		Parent parent = new Parent();
		Parent parent2 = new Parent("test");
		Child5 child = new Child5();
	}

	private void execute05(){

		System.out.println(" ");
		System.out.println("execute5");
		Child4 child = new Child4();
        Parent parent = child;

		System.out.println(Parent.staticMethodA());
		System.out.println(Child4.staticMethodA());
	}

	private void execute04(){
		someMethod(new Child2());
		someMethod(new Child3());
	}

	private void someMethod(Parent parent){
		System.out.println(" ");
		System.out.println("execute4");
		System.out.println(parent.methodA());
		System.out.println(parent.fieldA);
	}

	private void execute03(){
		System.out.println(" ");
		System.out.println("execute3");
		Child2 child = new Child2();
		Parent parent = child;
		System.out.println(parent.fieldA);
		System.out.println(parent.methodA());
	}

	private void execute02(){

		System.out.println(" ");
		System.out.println("execute2");
		Child2 child = new Child2();
		System.out.println(child.fieldA);
		System.out.println(child.fieldB);
		System.out.println(child.methodA());
		System.out.println(child.methodB());
	}

	private void execute01(){

		System.out.println("execute1");
		Child child = new Child();
		System.out.println(child.fieldA);
		System.out.println(child.fieldB);
		System.out.println(child.methodA());
		System.out.println(child.methodB());
	}

}
