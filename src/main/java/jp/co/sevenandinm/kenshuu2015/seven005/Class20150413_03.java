
package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Scanner;

public class Class20150413_03{
	public static void main(String[] args){
		int kame = head_legs(20,64);
		System.out.println("亀は" + kame + "匹です。");
	}
	
	public static int head_legs(int a, int b){
		int kame_kazu;
		
		/*連立方程式
		a = kame_kazu + turu_kazu;
		b = 4 * kame_kazu + 2 * turu_kazu;
		*/
		
		kame_kazu = (b - 2 * a) / 2;
		return kame_kazu;
	}
}
