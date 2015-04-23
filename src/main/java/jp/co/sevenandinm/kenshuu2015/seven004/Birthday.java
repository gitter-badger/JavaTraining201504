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
		int today_Year = today.get(Calendar.YEAR);
		int today_Month = today.get(Calendar.MONTH) + 1;// JANUARYが0なので調整
		int today_Date = today.get(Calendar.DATE);


		int nenrei = today_Year - nen;


		if(today_Month < tsuki || today_Month == tsuki && today_Date < hi ){
			nen--;
		}

		System.out.println("今日は:" + today_Year + "年" + today_Month + "月" + today_Date + "日です。");
		System.out.print(nen + "年" + tsuki + "月" + hi + "日生まれの人の");
		System.out.println("年齢は:" + nenrei + "才です。");


	}
}
