package jp.co.sevenandinm.kenshuu2015.seven006;
public class Class20150410_04{
	public static void main(String [] args){
		
		int[] numbox=new int[3];
		int max=0;
		System.out.println("3つの数字の最大値を求めます");
		for(int i=0;i<3;i++){
			numbox[i] = Integer.parseInt(args[i]);
			if(max<numbox[i]){
				max=numbox[i];
			}
		}
		System.out.println("3つの最大値は"+max+"です");
	}
}