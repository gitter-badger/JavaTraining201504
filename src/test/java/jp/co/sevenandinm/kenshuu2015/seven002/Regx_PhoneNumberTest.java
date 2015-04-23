package jp.co.sevenandinm.kenshuu2015.seven002;

import junit.framework.TestCase;

public class Regx_PhoneNumberTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testExecute1() {
		Regx_PhoneNumber app = new Regx_PhoneNumber();
		assertEquals("バグがあります。", true, app.execute("03-1234-5678"));
	}

	public void testExecute2() {
		Regx_PhoneNumber app = new Regx_PhoneNumber();
		assertEquals("バグがあります。", true, app.execute("03-1234-5678"));
	}

	public void testExecute3() {
		Regx_PhoneNumber app = new Regx_PhoneNumber();
		assertEquals("バグがあります。", true, app.execute("03-1234-5678"));
	}

	public void testExecute4() {
		Regx_PhoneNumber app = new Regx_PhoneNumber();
		assertEquals("バグがあります。", true, app.execute("030-1234-5678"));
	}
}