package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class03{
	public static void main(String[] args){
		int a = 23;
		int b = 3;
		int c,d,e;
		float f;
		double g;
		float h;
		byte i;
		
		c = a + b;
		d = a - b;
		e = a * b;
		//float int    int（小数点まで扱う場合右辺a,bもfloat型にしなければ小数点まで出ない。
		//どちらかをfloat型にすればfloat型が一番性能の高い型の為ａもInt型からfloat型になる
		f = 	a 	/  (float)b;
		g = (a + b) - b;
		h = a % b;
		i = -128;
		
		System.out.println("足し算" + c);
		System.out.println("引き算" + d);
		System.out.println("掛け算" + e);
		System.out.println("割り算" + f);
		System.out.println("括弧算" + g);
		System.out.println("余り算" + h);
		System.out.println("バイト" + i);
	}
}