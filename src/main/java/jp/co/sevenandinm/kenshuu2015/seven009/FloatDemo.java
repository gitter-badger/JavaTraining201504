package jp.co.sevenandinm.kenshuu2015.seven009;


public class FloatDemo {
	public static void main(String[] args){
///aaa
		
		double d1 = 1.0 - 0.9;
		double d2 = 1.0/10.0;
		
		System.out.println( d1 == d2 );
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(Long.toHexString(Double.doubleToLongBits(d1)));
		System.out.println(Long.toHexString(Double.doubleToLongBits(d2)));
	}
}
