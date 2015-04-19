package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150414_02{
	public static void main(String[] args){
		
		int in_Factorial = Integer.parseInt(args[0]);
		String message = "";
		
		message = "値を入力してください";
		System.out.println(message);
		
		int in_Factorial_Total = factorial_evaluate(in_Factorial);
		
		System.out.println(in_Factorial + "の階乗は" + in_Factorial_Total + "です");
	}
	
	
	public static int factorial_evaluate(int in_Factorial){
		int in_Factorial_Total = 1;
		for(int m = 1;m == in_Factorial; m++){
			in_Factorial_Total = in_Factorial_Total * m;
		}
		
		return in_Factorial_Total;
	}
}
