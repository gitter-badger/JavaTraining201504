package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Date;
import java.util.HashMap;

public class CreateUserID {

	private int renban=0;

	public String getUserId(Date today){
		this.renban++;

	String //return strUserID;="";
	strUserID=today.toString();
	//Fri Apr 17 14:26:10 JST 2015
	//20150417に変換

	String yyyy=strUserID.substring(24, (24+4));
	String mm = getManth(strUserID);
	String dd  =strUserID.substring(8, 10);
	//String.format => 3桁を００で左詰めする
	String rr = String.format("%03d", renban);
	strUserID = yyyy+mm+dd+rr;
	strUserID = swapId(strUserID);
	strUserID= modurasu(strUserID);
	return strUserID;
	}


	private String getManth(String strUserID) {
		HashMap<String,String> hm= new HashMap<String,String>();

		String mm1  =strUserID.substring(4, 7);
		hm.put("Jan", "01");
		hm.put("Feb", "02");
		hm.put("Mar", "03");
		hm.put("Apr", "04");
		hm.put("May", "05");
		hm.put("Jun", "06");
		hm.put("Jul", "07");
		hm.put("Aug", "08");
		hm.put("Sep", "09");
		hm.put("Oct", "10");
		hm.put("Nov", "11");
		hm.put("Dec", "12");
		String mm=hm.get(mm1);
		return mm;
	}

	private String swapId(String strUserId){
		String swapUserId="0";
		int[] swapNum={5,9,2,4,3,7,1,10,6,8,0};
		for(int i=0;i<swapNum.length;i++){
			swapUserId+=strUserId.charAt( swapNum[i] ) ;
		}
		return swapUserId;
	}
	private String modurasu(String strUserId){
		String userId="";
		String guusuuGyou="";
		String kisuuGyou="";
		for(int i=0;i<6;i+=2){
			kisuuGyou+=strUserId.charAt(i);
		}

		int i = Integer.parseInt(strUserId);

		return userId;
	}
}
