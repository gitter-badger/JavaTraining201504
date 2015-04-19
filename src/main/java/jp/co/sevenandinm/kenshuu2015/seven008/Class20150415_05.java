package jp.co.sevenandinm.kenshuu2015.seven008;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class Class20150415_05{
	public static void main(String[] args){
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("name","Hirose");
		map.put("score", "" + 90);
		map.put("age" , "" + 15);
		
		//keySetを使った配列の並び替え
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o + " = " + map.get(o));
		
        }
		
        System.out.println();
		
		//entrySetを使った配列の並び替え
        Set<Entry<String,String>> set = map.entrySet();
        Iterator<Entry<String,String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Entry<String,String> o = it2.next();
            System.out.println(o);
        }
		
		System.out.println();
		
		//拡張for文においてentrySet（使わなければならない）を使った配列の並び替え
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }
	}
}