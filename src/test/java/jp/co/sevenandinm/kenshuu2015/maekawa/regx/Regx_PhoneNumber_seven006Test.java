/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.regx;

import junit.framework.TestCase;

/**
 * @author maekawa
 *
 */
public class Regx_PhoneNumber_seven006Test extends TestCase {

	/* (非 Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (非 Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * {@link jp.co.sevenandinm.kenshuu2015.maekawa.regx.Regx_PhoneNumber_seven006#execute(java.lang.String)} のためのテスト・メソッド。
	 */
	public void testExecute1() {
		Regx_PhoneNumber_seven006 app = new Regx_PhoneNumber_seven006();
		assertEquals("バグがあります。",true, app.execute("03-1234-5678"));
	}

	public void testExecute2() {
		Regx_PhoneNumber_seven006 app = new Regx_PhoneNumber_seven006();
		assertEquals("バグがあります。",true, app.execute("042-536-5678"));
	}

	public void testExecute3() {
		Regx_PhoneNumber_seven006 app = new Regx_PhoneNumber_seven006();
		assertEquals("バグがあります。",true, app.execute("0425-36-5678"));
	}

	public void testExecute4() {
		Regx_PhoneNumber_seven006 app = new Regx_PhoneNumber_seven006();
		assertEquals("携帯電話に対応していません。",true, app.execute("090-1234-5678"));
	}


}
