/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven006;

/**
 * 星座クラス（スーパクラス）
 * @author teacher4
 *
 */
public class Constellation {

	protected String japaneseName = "";
	protected int startMonth = 0;
	protected int startDay = 0;
	protected int endMonth = 0;
	protected int endDay = 0;


	/**
	 * @return
	 */
	public String dispDescription() {
		return "hello";
	}

	/**
	 * @return japaneseName
	 */
	public String getJapaneseName() {
		return japaneseName;
	}
	/**
	 * @param japaneseName セットする japaneseName
	 */
	public void setJapaneseName(String japaneseName) {
		this.japaneseName = japaneseName;
	}
	/**
	 * @return startMonth
	 */
	public int getStartMonth() {
		return startMonth;
	}
	/**
	 * @param startMonth セットする startMonth
	 */
	public void setStartMonth(int startMonth) {
		this.startMonth = startMonth;
	}
	/**
	 * @return startDay
	 */
	public int getStartDay() {
		return startDay;
	}
	/**
	 * @param startDay セットする startDay
	 */
	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}
	/**
	 * @return endMonth
	 */
	public int getEndMonth() {
		return endMonth;
	}
	/**
	 * @param endMonth セットする endMonth
	 */
	public void setEndMonth(int endMonth) {
		this.endMonth = endMonth;
	}
	/**
	 * @return endDay
	 */
	public int getEndDay() {
		return endDay;
	}
	/**
	 * @param endDay セットする endDay
	 */
	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}


}
