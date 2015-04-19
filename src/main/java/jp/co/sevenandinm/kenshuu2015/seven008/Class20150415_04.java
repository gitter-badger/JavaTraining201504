package jp.co.sevenandinm.kenshuu2015.seven008;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Collections;

public class Class20150415_04{
	public static void main(String[] args){
		Integer [] values = { 23, 46, 15, 78, 6, 95, 30};
		//降順
		Arrays.sort(values, Collections.reverseOrder());
		//昇順
		Arrays.sort(values);
		
		for(Integer value : values){
			System.out.println(value);
		}
	}
}