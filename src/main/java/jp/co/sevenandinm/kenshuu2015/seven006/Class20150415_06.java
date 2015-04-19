package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Scanner;
public class Class20150415_06{
	static Scanner scan = new Scanner(System.in);
	public static void main(String [] args){
		
		
		System.out.println("配列Ａの要素数？");
		int arrayANum = scan.nextInt();
		String[] arrayA = getArray(arrayANum);
		
		System.out.println("配列Ｂの要素数？");
		int arrayBNum = scan.nextInt();
		String[] arrayB = getArray(arrayBNum);
		
		checkArray(arrayA,arrayB);
		
		}
	private static String[] getArray(int num){
		int arrayNum=num;
		String[] array=new String[arrayNum];
		System.out.println("配列の中身を入力してください。");
		for(int i=0;i<arrayNum;i++){
			array[i]=scan.nextLine();
		}
		return array;
	}

	private static void checkArray(String[] a,String[] b){
		
		if(a.length==b.length){		
			for(int i=0;i<=b.length;i++){
				if( a[i].equals(b[i]) ){
					System.out.println("要素はあってます");
					break;
				}
				else{
					System.out.println("要素が違います");
				break;
				}
			}
		}
	else{
		System.out.println("配列の大きさが違います");
	}
		
	}
}