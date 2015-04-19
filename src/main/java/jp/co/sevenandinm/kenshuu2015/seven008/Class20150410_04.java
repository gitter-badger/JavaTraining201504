package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150410_04{
	public static void main(String[] args){
		String message = "";
		int int_max = 0;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		//出力された3つの数字を出力
		System.out.println("一つ目の数字：" + args[0]);
		System.out.println("二つ目の数字：" + args[1]);
		System.out.println("三つ目の数字：" + args[2]);
		

		//条件分岐
		if(a > b && a > c){
			int_max = a;
		}else if(b > c) {
			int_max = b;
		}else{
			int_max = c;
		}
		//出力画面
		System.out.println("最大値は" + int_max + "です。");
	}
}