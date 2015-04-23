package jp.co.sevenandinm.kenshuu2015.seven004;

import java.util.Scanner;

public class Application2{

	public static void main(String[] args) {




	Scanner stdIn = new Scanner(System.in);


	int nen = stdIn.nextInt();
	System.out.println("年:" + nen);

	int tsuki = stdIn.nextInt();
	System.out.println("月:"+ tsuki);

	int hi = stdIn.nextInt();
	System.out.println("日:"+ hi);


      Ohituji ohituji = new Ohituji();
	  Oushi oushi = new Oushi();
      Hutago hutago = new Hutago();
	  Kani kani = new Kani();
	  Shishi shishi = new Shishi();
	  Otome otome = new Otome();
	  Tenbin tenbin = new Tenbin();
      Sasori sasori = new Sasori();
      Ite ite = new Ite();
      Yagi yagi = new Yagi();
      Mizugame mizugame = new Mizugame();
	  Uo uo = new Uo();

	  Constellation constellation[]={ohituji,oushi,hutago,kani,shishi,otome,tenbin,sasori,ite,yagi,mizugame,uo};

	  for(int i=0; i<constellation.length; i++){
        if(tsuki==constellation[i].getStartMonth() && hi>=constellation[i].getStartDay() ||
        		tsuki==constellation[i].getEndMonth() && hi<=constellation[i].getEndDay()){
        	 System.out.println("星座は"+constellation[i].japaneseName+"です。");
        }
        }
     //年齢を求める
	  Birthday b=new Birthday(nen,tsuki,hi);


	 //生まれてから今日までの日数を求める
	/* SimpleDateFormat date1=new SimpleDateFormat("yyyyMMdd");
	 System.out.println("今日の日付："+date1);*/

	 int umaretekara;
	 umaretekara= nen*365;
	 System.out.println("生まれてから今日まで"+umaretekara+"日が経過しています。");

	 //干支を求める
	/* String etoName[]={"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
	 int etoNumber =(nen+8)%12;
	 String etoName=etoName[etoNumber];
    */

	}

}
