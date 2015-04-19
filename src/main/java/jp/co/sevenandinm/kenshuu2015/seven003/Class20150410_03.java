package jp.co.sevenandinm.kenshuu2015.seven003;


public class Class20150410_03 {
	public static void main(String[] args) {
	 int i;
	 int sum=0;
		
		System.out.println("nの値を入力してください");
		
		java.util.Scanner stdIn = new java.util.Scanner(System.in);
	
     		int number = stdIn.nextInt();
	
			for (i = 1; i<= number; i++) {
					sum = sum + i;
			}
				
		System.out.println("合計は" +sum+ "です");
		
	}
	
  }
  