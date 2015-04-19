package jp.co.sevenandinm.kenshuu2015.seven005;
public class Class20150410_06{
	public static void main(String[] args){
		
		int a = 100;
		Integer oi = new Integer(a);
		String str = oi.toString();
		
		/*②
		String b = " " + a ;
		*/
		
		System.out.println("これは、" + str + " です。");
		System.out.println(str.getClass());
	}
}


