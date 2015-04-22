package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.Calendar;

public class Birthday{
	public Birthday(){

	}

	public Birthday(int nen,int tsuki,int hi){
		init(nen,tsuki,hi);

	}
	public void init(int nen,int tsuki,int hi){

		Calendar today = Calendar.getInstance();//現在の時間を取得
		int Year = today.get(Calendar.YEAR);
		int Month = today.get(Calendar.MONTH) + 1;// JANUARYが0なので調整
		int Date = today.get(Calendar.DATE);


		int nenrei = Year - nen;

		if(Month < tsuki || Month == tsuki && Date < hi ){
			nen--;//この条件では、まだ生まれていない。
		}
		System.out.println("今日は:" + Year + "年" + Month + "月" + Date + "日です");
		System.out.print(nen + "年" + tsuki + "月" + hi + "日生まれの人の");
		System.out.println("年齢は:" + nenrei + "才です");
	}
}
