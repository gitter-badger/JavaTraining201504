package jp.co.sevenandinm.kenshuu2015.maekawa;

public class Dog {

	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void run() {
		System.out.println(name + " is running.");
	}

}
