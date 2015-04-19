package jp.co.sevenandinm.kenshuu2015.seven004;
public class Class20150410_04{

	public static void main(String [] args){
	
	int[] num=new int[3];
	int max = 0;
	System.out.println("3つの数字の最大値を求めます");
	
	for(int i=0; i<3; i++){
		num[i] = Integer.parseInt(args[i]);
		if(max<num[i]){
			max=num[i];
			
			}
			
		}
		System.out.println("３つの最大値は"+max+"です");
		}
			
}

