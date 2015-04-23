package jp.co.sevenandinm.kenshuu2015.seven008;

import junit.framework.TestCase;

public class Regx_PhoneNumberTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testExecute() {
		Regx_PhoneNumber app = new Regx_PhoneNumber();
		assertEquals("バグがあります。",true, app.execute("012-2222-2222"));
	}

}
