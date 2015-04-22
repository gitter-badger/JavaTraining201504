/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven009;

/**

 */
public class Constellation {

	protected String JapaneseName = "";
	/**
	 * @return japaneseName
	 */
	public String getJapaneseName() {
		return JapaneseName;
	}
	/**
	 * @param japaneseName セットする japaneseName
	 */
	public void setJapaneseName(String japaneseName) {
		JapaneseName = japaneseName;
	}
	/**
	 * @return startManth
	 */
	public int getStartManth() {
		return StartManth;
	}
	/**
	 * @param startManth セットする startManth
	 */
	public void setStartManth(int startManth) {
		StartManth = startManth;
	}
	/**
	 * @return startDay
	 */
	public int getStartDay() {
		return StartDay;
	}
	/**
	 * @param startDay セットする startDay
	 */
	public void setStartDay(int startDay) {
		StartDay = startDay;
	}
	/**
	 * @return endManth
	 */
	public int getEndManth() {
		return EndManth;
	}
	/**
	 * @param endManth セットする endManth
	 */
	public void setEndManth(int endManth) {
		EndManth = endManth;
	}
	/**
	 * @return endDay
	 */
	public int getEndDay() {
		return EndDay;
	}
	/**
	 * @param endDay セットする endDay
	 */
	public void setEndDay(int endDay) {
		EndDay = endDay;
	}
	protected int StartManth = 0;
	protected int StartDay = 0;
	protected int EndManth = 0;
	protected int EndDay = 0;


}