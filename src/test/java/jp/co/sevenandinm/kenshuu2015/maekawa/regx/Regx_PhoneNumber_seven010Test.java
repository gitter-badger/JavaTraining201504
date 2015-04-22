package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import junit.framework.TestCase;

public class Regx_PhoneNumber_seven010Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testExecute1() {
		Regx_PhoneNumber_seven010 app = new Regx_PhoneNumber_seven010();
		assertEquals("バグがあります。",true, app.execute("03-1234-5678"));
	}

	public void testExecute2() {
		Regx_PhoneNumber_seven010 app = new Regx_PhoneNumber_seven010();
		assertEquals("バグがあります。",true, app.execute("042-536-5678"));
	}

	public void testExecute3() {
		Regx_PhoneNumber_seven010 app = new Regx_PhoneNumber_seven010();
		assertEquals("バグがあります。",true, app.execute("0425-36-5678"));
	}

	public void testExecute4() {
		Regx_PhoneNumber_seven010 app = new Regx_PhoneNumber_seven010();
		assertEquals("携帯電話に対応していません。",true, app.execute("090-1234-5678"));
	}

}
