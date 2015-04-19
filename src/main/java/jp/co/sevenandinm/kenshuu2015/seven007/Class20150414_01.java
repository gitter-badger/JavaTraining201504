package jp.co.sevenandinm.kenshuu2015.seven007;


public class Class20150414_01{
	public static void main(String[] args){
	
		int input;
		int sum = 0;
		
		System.out.print("値を入力してください：");
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		input = stdIn.nextInt();
				
		sum = total(input);
		System.out.println( sum );
	}
		
	public static int total( int sum_number ){
		
		int num = sum_number;
		
		for( int i = 1; i < sum_number; i++ ){
				num = num * i;
			}
		
		return num;
	}
}

