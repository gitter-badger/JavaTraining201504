package jp.co.sevenandinm.kenshuu2015.seven008;
public class Class20150416_02{
	public static void main(String[] args){
		double d1 = 1.0 - 0.9;
		double d2 = 1.0 / 10.0;
		
		System.out.println(d1 == d2);
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(Long.toHexString(Double.doubleToLongBits(d1)));
		System.out.println(Long.toHexString(Double.doubleToLongBits(d2)));
	}
}