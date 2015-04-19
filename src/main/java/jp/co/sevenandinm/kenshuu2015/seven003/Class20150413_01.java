package jp.co.sevenandinm.kenshuu2015.seven003;

public class Class20150413_01 {
	public static void main(String[] args) {
		
		int Max =0;
	
	System.out.println("３つの数字の最大値を求めます。");
	
	java.util.Scanner stdIn = new java.util.Scanner (System.in);
	   int input01 = stdIn.nextInt();
	   int input02 = stdIn.nextInt();
	   int input03 = stdIn.nextInt();
		
		/*
		if(input01 > input02 && input01 > input03){
			Max = input01;
	    }
		else if  (input03 < input02) {
	  		Max = input02;
		}
		else {
	  	    Max = input03;
		}
		*/
		Max = max3(input01, input02, input03);
			System.out.println("最大値は" +Max+ "です。");
	
	}
	
	//
	public static int max3(int input01, int input02, int input03){
		int max = 0;
		// 	
		if(input01 > input02 && input01 > input03){
			max = input01;
	    }
		else if  (input03 < input02) {
	  		max = input02;
		}
		else {
	  	    max = input03;
		}
		return max;
	}
	
		
}
	
	