package jp.co.sevenandinm.kenshuu2015.seven004;
public class Class20150413_02{

	public static void main(String [] args){
		int kame=h_l(20,64);
		System.out.println("亀"+ kame);
	}
	public static int h_l(int a,int b){
		int kame_num;
			
		kame_num=(b-2*a)/2;
			
		return kame_num;
	}
}