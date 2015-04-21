/**
 *
 */
package jp.co.sevenandinm.kenshuu2015.seven006;

/**
 * 牡羊座
 * @author teacher4
 *
 */
public class Aries extends Constellation {

	public Aries(){
		init();
	}

	private void init() {
		// TODO 自動生成されたメソッド・スタブ
		this.setJapaneseName("牡羊座");
		this.setStartMonth(3);
		this.setStartDay(21);
		this.setEndMonth(4);
		this.setEndDay(19);
	}

	@Override
	public String dispDescription() {
		return "牡羊座";
	}

}
