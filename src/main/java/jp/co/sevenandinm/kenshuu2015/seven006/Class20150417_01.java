package jp.co.sevenandinm.kenshuu2015.seven006;

public class Class20150417_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Class20150417_01 my =new Class20150417_01();
		my.method01();

		String strA="Hello world !!!";

		System.out.println("長さ:"+strA.length() );


		int indexw =strA.indexOf("w");
		System.out.println("wの位置:"+indexw);

		int index_s=strA.indexOf(" ");
		System.out.println("スペースの位置:"+index_s);

		System.out.println("9文字目:"+strA.charAt(9-1));

		int index_s2=strA.lastIndexOf(" ");
		System.out.println("後ろから数えたスペースの位置"+index_s2);


		String strB="123,456,,789,012,";



		System.out.println("スペースで区切った場合の配列");
		String[] setArray=strB.split(",",-1);
		for(String element :setArray){
			System.out.println(element);
		}
		System.out.println("------------------------------");
		             //01234567801234567890123456789012345678901234567890
		String strC = "0001:12345678 152-0002 東京都目黒区本町 山田　太郎";

		//文字列切り出し指定から指定までの間の文字列を取得する
		String strSubID =strC.substring(9,17);
		System.out.println(strC.substring(0,4));
		System.out.println(strSubID);
		String strYubin=strC.substring(14,23);
		System.out.println(strYubin);

		String strAddress=strC.substring(27,(27+10));
		System.out.println(strAddress);
		String strName=strC.substring((27+10+1),(27+10+1+5));
		System.out.println(strName);

		String strConcat="cares".concat("");
		String strConcat1="cares"+"s";

		String strReplace1 =strA.replace("H","h");
		System.out.println(strReplace1);




	}

	private void method01() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
