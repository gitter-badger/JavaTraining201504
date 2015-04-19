package jp.co.sevenandinm.kenshuu2015.seven003;
public class Class05_2 {
	public static void main(String[] args) {
	
	int input01,input02,input03;
	int Max = 0;
	
	System.out.println("３つの数字の最大値を求めます。");
	
	java.util.Scanner stdIn = new java.util.Scanner (System.in);
	    input01 = stdIn.nextInt();
		input02 = stdIn.nextInt();
		input03 = stdIn.nextInt();
		
	
		if(input01 > input02 && input01 > input03){
		Max = input01;
	}
		else if  (input03 < input02) {
	    Max = input02;
	}
		else {
	    Max = input03;
		}
	  System.out.println("最大値は" +Max+ "です。");
	
		}
		
	}
	
	