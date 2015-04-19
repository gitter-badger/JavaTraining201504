package jp.co.sevenandinm.kenshuu2015.seven007;

public class Class20150413_05{
	public static void main (String[] args){
		
		int numa = 0;
		int numb = 0;
		String numc = "";
		
		
		
		java.util.Scanner stdIn = new java.util.Scanner(System. in);
		numa = stdIn.nextInt();
		numb = stdIn.nextInt();
		numc = Integer.toString( numa,numb );
		
		System.out.println(numc);
		
	}
}
