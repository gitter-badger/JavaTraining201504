package jp.co.sevenandinm.kenshuu2015.seven009;

import java.util.Calendar;
import java.util.Scanner;
	public class Birthday {

		public Birthday() {
			// TODO 自動生成されたコンストラクター・スタブ
		}

		public static void main(String[] args){ //-----------------------------------------------------------最初
			Birthday my = new Birthday();
			my.In_out_put();
			my.getSeiza(0, 0);
			my.getEto(0);
			my.getNenrei(0, 0, 0);
			my.getKeika(0, 0, 0);

		}

		private void In_out_put() {   //-------------------------------------------------------出力/機能定義/出力

			//データの入力
		   	Scanner stdIn = new java.util.Scanner(System.in);
		  	System.out.println ("西暦何年生まれですか？入力して下さい。");int input_year = stdIn.nextInt();
		  	System.out.println ("何月生まれですか？");	int input_manth = stdIn.nextInt();
		  	System.out.println ("何月生まれですか？");	int input_day = stdIn.nextInt();


		  	//それぞれの機能を行うメソッド
		    String seiza= getSeiza(input_manth,input_day);
		  	char eto= getEto(input_year);
		  	int nenrei= getNenrei(input_year,input_manth,input_day);
		  	int keika= getKeika(input_year,input_manth,input_day);

		  	//結果の出力
		  	System.out.println ("あなたの星座は"+ seiza +"です。");
		  	System.out.println ("あなたの干支は"+ eto +"です。");
     	  	System.out.println ("あなたの年齢は"+ nenrei +"です。");
		  	System.out.println ("あなたは生まれてから今日で"+ keika +"日目です。");


		}

		private String getSeiza (int m , int d){  //----------------------------------------------------------星座
			// TODO 自動生成されたメソッド・スタブ
			String ret1="";

			Constellation[] seiza = new Constellation[12];
			seiza[0] = new Aries();
			seiza[1] = new Taurus();
			seiza[2] = new Gemini();
			seiza[3] = new Cancer();
			seiza[4] = new Leo();
			seiza[5] = new Virgo();
			seiza[6] = new Libra();
			seiza[7] = new Scorpio();
			seiza[8] = new Sagittarius();
			seiza[9] = new Capricorn();
			seiza[10] = new Aquarius();
			seiza[11] = new Pisces();

			for(Constellation element :seiza ){
				int startManth = element.getStartManth();
				int startDay = element.getStartDay();
				int endManth = element.getEndManth();
				int endDay = element.getEndDay();

				if( startManth == m && d >= startDay|| endManth == m && endDay >= d){
					ret1 = element.getJapaneseName();
				}
			}
		return ret1;
		}

		private char getEto(int y){
			// TODO 自動生成されたメソッド・スタブ//--------------------------------------------------------干支
			char ret2;

			int amari = y % 12 ;
			char eto[] ={'申','酉','戌','亥','子','丑','寅','卯','辰','巳','午','未'};
			ret2 =eto[amari];


			return ret2;

		}

		private int  getNenrei(int y,int m,int d) {  //------------------------------------------------------年齢
			// TODO 自動生成されたメソッド・スタブ
			int ret3=0;

			Calendar now = Calendar.getInstance();

		    int today_y = now.get(Calendar.YEAR);
		    int today_m = now.get(Calendar.MONTH) + 1;
		    int today_d = now.get(Calendar.DATE);

			if(today_m  < m){
				ret3 =today_y - y -1 ;
			}else if (today_m >m){
				ret3 =today_y - y ;
			}else if(today_m == m && today_d >= d){
				ret3 =today_y - y ;
			}else if(today_m == m && today_d < d){
				ret3 =today_y - y -1;
			}return ret3;
		}

		private int getKeika(int y,int m,int d) {  //------------未完成---------------------------------------日齢
		// TODO 自動生成されたメソッド・スタブ
			int ret4=0;


			return ret4;

		}

	}



