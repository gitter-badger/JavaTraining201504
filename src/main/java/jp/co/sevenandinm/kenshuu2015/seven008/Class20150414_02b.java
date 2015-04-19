package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150414_02b{
	public static void main(String[] args){
		
		int in_Factorial = Integer.parseInt(args[0]);
		String message = "";
		
		message = "値を入力してください";
		System.out.println(message);
		
		int in_Factorial_Total = factorial_evaluate(in_Factorial);
		
		System.out.println(in_Factorial + "の掛け算を" + in_Factorial +"まで足していくと" + in_Factorial_Total + "です");
	}
	
	
	public static int factorial_evaluate(int in_Factorial){
		int in_Factorial_Total = 0;
		for(int m = 1;m <= in_Factorial; m++){
			in_Factorial_Total = in_Factorial_Total + in_Factorial * m;
		}
		
		return in_Factorial_Total;
	}
}
