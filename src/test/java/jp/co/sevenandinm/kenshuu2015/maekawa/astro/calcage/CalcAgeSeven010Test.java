/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage;

import junit.framework.TestCase;

/**
 * @author maekawa
 *
 */
public class CalcAgeSeven010Test extends TestCase {

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

	private int[] ymd = {1992,4,23};
	// このテストの欠点は、yyyy/04/22 に実行した場合しかテストが成功しない点にある。
	// 次の日にテストすると、同じ対象ロジックなのに、前日OKだったものがNGという結果になる。
	// 原因はgetAgeByCalcの実装の仕方にある。悩ましい問題。
	// テスト時に現在の日付時刻だけ調整できればいい。
	// JMockitを使って対応が可能
	// http://d.hatena.ne.jp/penult/20100716/1279304627

	/**
	 * {@link jp.co.sevenandinm.kenshuu2015.maekawa.astro.calcage.CalcAgeSeven010#getAgeByCalc(int, int, int)} のためのテスト・メソッド。
	 */
	public void testGetAgeByCalc誕生日経過後() {
		CalcAgeSeven010 app = new CalcAgeSeven010();
		assertEquals("バグがあります。",23, app.getAgeByCalc(1992,4,21));
	}

	public void testGetAgeByCalc誕生日() {
		CalcAgeSeven010 app = new CalcAgeSeven010();
		assertEquals("バグがあります。",23, app.getAgeByCalc(1992,4,22));
	}

	public void testGetAgeByCalc誕生日前() {
		CalcAgeSeven010 app = new CalcAgeSeven010();
		assertEquals("バグがあります。",22, app.getAgeByCalc(1992,4,23));
	}


}
