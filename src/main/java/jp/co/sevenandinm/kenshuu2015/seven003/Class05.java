package jp.co.sevenandinm.kenshuu2015.seven003;
public class Class05 {
	public static void main(String[] args) {
		
		String message = "";
		int input01 = 0;
		int input02 = 0;
		int input03 = 0;
		int max = 0;
		
		System.out.println("３つの数字の最大値を求めます");
		
		java.util.Scanner stdIn = new java.util.Scanner (System.in);
		input01 = stdIn.nextInt();
		input02 = stdIn.nextInt();
		input03 = stdIn.nextInt();
		
		
		if (input01 > input02){ 
		    max = input01;
			
		}else if (input01 > input03){
		    max = input01;
		
		}else if (input02 > input01){
		    max = input02;
			
		
		}else if (input02 > input03){
			max = input02;
		
		
		}else if (input03 > input01){
			max = input03;
			
		
		}else if (input03 > input02){
			max = input03;
			
		}
		
			
		System.out.println("最大値は" + max + "です。");
		
	
	}
}


