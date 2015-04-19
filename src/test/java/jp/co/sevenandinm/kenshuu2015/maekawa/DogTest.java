/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.maekawa;

import junit.framework.TestCase;

/**
 * @author maekawa
 *
 */
public class DogTest extends TestCase {

	public DogTest(String name) {
		super(name);
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		System.out.println("<TESTの事前準備>");
		super.setUp();
	}

	/*
	 * (非 Javadoc)
	 *
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		System.out.println("<TESTの後始末>");
		super.tearDown();
	}

	/**
	 * {@link jp.co.sevenandinm.kenshuu2015.maekawa.Dog#getName()} のためのテスト・メソッド。
	 */
	public void testGetName() {
		System.out.println("testGetName");
//		fail("まだ実装されていません");
		String name = "pochi";
		int age = 4;
		Dog dog = new Dog(name,age);
//		dog.setName(name);
		assertEquals(name, dog.getName());
	}

	/**
	 * {@link jp.co.sevenandinm.kenshuu2015.maekawa.Dog#getAge()} のためのテスト・メソッド。
	 */
	public void testGetAge() {
		System.out.println("testGetAge");
//		fail("まだ実装されていません");
		String name = "pochi";
		int age = 4;
		Dog dog = new Dog(name,age);
//		dog.setName(name);
		assertEquals(age, dog.getAge());
	}

	/**
	 * {@link jp.co.sevenandinm.kenshuu2015.maekawa.Dog#run()} のためのテスト・メソッド。
	 */
	public void testRun() {
		System.out.println("testRun");
//		fail("まだ実装されていません");
		assertTrue( true );
	}

}
