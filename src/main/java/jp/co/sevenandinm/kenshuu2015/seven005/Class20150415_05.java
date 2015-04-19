package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.HashMap;
import java.util.Iterator;

public class Class20150415_05{
     public static void main(String[] args) {
     	
     	/*HashMapの中に、2つあれば、型を2つ指定しなければならない*/
        HashMap<String,String> map = new HashMap<String,String>();
         
        /* map.put("キー", "値") */
        map.put("name", "Hirose");
        map.put("score", ""+90);
        map.put("age", ""+15);
         
        Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
    		String o = it.next();
    		System.out.println(o + " = " + map.get(o));
		}
    }
}
