package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;


public class Class20150415_08{
	public static void main(String[] args){
		
		/*HashMapの中に、2つあれば、型を2つ指定しなければならない*/
        HashMap<String,String> map = new HashMap<String,String>();
        /* map.put("キー", "値") */
        map.put("name", "Hirose");
        map.put("score", ""+90);
        map.put("age", ""+15);
 
	
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }
	
	
		
	}
} 

