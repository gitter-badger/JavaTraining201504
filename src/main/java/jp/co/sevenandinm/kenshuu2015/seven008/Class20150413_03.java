package jp.co.sevenandinm.kenshuu2015.seven008;

public class Class20150413_03{
	//メインメソッド
	public static void main(String[] args){
		int n = 0;
		int m = 0;
		int a = 0;
		int b = 0;
		
		for(b = 1; b <= 9; b++){
			if(b == 1){
				System.out.print("         " + b);
			}else{
				System.out.print("     " + b);
			}
		}
		System.out.println();	
		System.out.print("----");
		for(a = 1; a <= 9; a++){
			System.out.print("------");
		}
		System.out.println();	
		for(m = 1; m <= 9; m++){
			System.out.print("  " + m + "  |");
			for(n = 1; n <= 9; n++){
				if (m*n < 10){
					System.out.print("   ");
				}else{
					System.out.print("  ");
				}
				System.out.print(m*n + "  ");
			}
			System.out.println();
		}
	}
}
