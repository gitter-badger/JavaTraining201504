package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Arrays;
import java.util.Collections;


public class Class20150415_07{
	public static void main(String[] args){
	
	Integer[] values = {23,46,15,78,6,95,30};
		
	/*昇順
	Arrays.sort(values);
	*/
	/*降順*/
	Arrays.sort(values, Collections.reverseOrder());
	/*valuesに入っているものを、valueに持っていく工程を表す*/
		for(Integer value : values){
			System.out.println(value);
		}
	}
} 

