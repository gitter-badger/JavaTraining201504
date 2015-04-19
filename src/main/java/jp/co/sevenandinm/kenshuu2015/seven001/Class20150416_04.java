//0.1問題
	package jp.co.sevenandinm.kenshuu2015.seven001;

	public class Class20150416_04{
	public static void main(String[] args){
	//同じになるはず
	double d1 = 1.0 - 0.9;
	double d2 = 1.0 / 10.0;
	
	//比較
	System.out.println(d1 == d2);
	
	//出力
	System.out.println(d1);
	System.out.println(d2);
	// 16進数表現
	System.out.println(Long.toHexString(Double.doubleToLongBits(d1)));
	System.out.println(Long.toHexString(Double.doubleToLongBits(d2)));
	
	}
}
