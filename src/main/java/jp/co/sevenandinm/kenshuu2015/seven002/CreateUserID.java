package jp.co.sevenandinm.kenshuu2015.seven002;
import java.util.Date;

public class CreateUserID {

	/**
	 *
	 * @param today
	 * @return
	 */


	public String createUserId(Date today){
		String userid = "";
		userid = today.toString();
		String yyyy = userid.substring(24, 28);
		String mm = getMonth(userid);
		String dd = userid.substring(8, 10);
		userid = yyyy + mm + dd;
		return userid;
	}

	/**
	 *
	 * @param userid
	 * @return
	 */


	//0123456789012345678901234567
	//Fri Apr 17 14:34:28 JST 2015

	//20150417
	private String getMonth(String userid) {
		String mm = userid.substring(4, 7);
		String strm = mm.replaceAll("Apr", "04");

		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int i = 0;
		for(String element : months){
			if(1 < 10){
				mm.replaceAll(element, "0" + i);
			}else{
				mm.replaceAll(element, "" + i);
			}
			i++;
		}

		return strm;
	}

}
