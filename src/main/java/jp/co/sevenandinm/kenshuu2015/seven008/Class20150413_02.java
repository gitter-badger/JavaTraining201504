package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150413_02{
	//メインメソッド
	public static void main(String[] args){
		//変数初期値設定
		int in_Animals = 20;
		int in_Foot = 64;
		int in_Pen = 46;
		int in_Money = 3340;
		//メソッドの取得
		int in_Kame_Total = animal_evalute(in_Animals,in_Foot);
		//int in_Pen_Total = pen_evalute(in_Pen,in_Money);
		//出力
		System.out.println("亀の数は" + in_Kame_Total);
	}
	//鶴亀メソッド
	public static int animal_evalute(int in_Animals,int in_Foot){
		//int in_Kame_A = 0;
		//int in_Tsuru_A = 0;
		//int in_Kame_Total = 0;
		//while (true){
		//	in_Kame_A = in_Kame_A + 4;
		//	in_Tsuru_A = in_Tsuru_A + 2;
		
		//	if(in_Foot < in_Kame_A + in_Tsuru_A){
		//		break;
		//	}
		//}
		//System.out.print("" + in_Kame_A);
		//in_Kame_Total = in_Kame_A / 4;
		
		int in_Kame_Total = in_Foot / 2 - in_Animals;
		return in_Kame_Total;
	}
	//鉛筆メソッド（途中）
	//public static int pen_evalute(int in_Pen,int in_Money){
	//	return int in_Pen_Total;
	//}
}
