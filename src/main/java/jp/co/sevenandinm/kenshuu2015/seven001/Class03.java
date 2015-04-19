package jp.co.sevenandinm.kenshuu2015.seven001;
public class Class03 {
	public static void main(String[] args){
		int a = 7;
		int b = 3;
		int c1;
		int c2;
		int c3;
		float c4;
		int c5;
		int c6;
		byte c7;
		int c8;
		
		c1 = a + b ;
		c2 = a - b ;
		c3 = a * b ;
		//floatは小数点の意味
		//c4の左辺でなく右辺にfloatをつける
		c4 = (float) a / b ;
		c5 = a * b + b -c1;
		c6 = a % b;
		
		
		//byte型の範囲は-128～127
		//データ型 値
		//boolean true or false
		//char 16ビットUnicode文字 ?u0000～?uFFFF
		//byte 8ビット整数 -128～127
		//short 16ビット整数 -32768～32767
		//int 32ビット整数 -2147483648～2147483647
		//long 64ビット整数 -9223372036854775808～9223372036854775807
		//float 32ビット単精度浮動小数点数
		//double 64ビット倍精度浮動小数点数
		
		
		c7 = 127;
		c8 = -2147483648;
		
		System.out.println("[足し算]c1=" + c1);
		System.out.println("[引き算]c2=" + c2);
		System.out.println("[掛け算]c3=" + c3);
		System.out.println("[割り算]c4=" + c4);
		System.out.println("[いろいろ]c5=" + c5);
		System.out.println("[あまり]c6=" + c6);
		System.out.println("[byte型の範囲]c7=" + c7);
		System.out.println("[int型の範囲]c8=" + c8);
		}
}