package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;


public class Class20150415_05{
	public static void main(String [] args){
		
		//<>で指定しているものはGeneratorと呼ばれるものである。
		HashMap<String,String> map= new HashMap<String,String>();
		
		map.put("name", "Hirose");
		map.put("name", "Fujii");
		map.put("score",""+ 90);
		map.put("age", ""+15);
		//HashMapではキーが同じになったときに後のものに上書きする。
		//↑の例の場合hiroseは出力されない。
		
		//keySet() <= 同じキーを設定したときに重複を許さない。
Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o + " = " + map.get(o));

        }

        System.out.println();

        Set<Entry<String,String>> set = map.entrySet();
        Iterator<Entry<String,String>> it2 = set.iterator();
        while (it2.hasNext()) {
            Entry<String,String> o = it2.next();
            System.out.println(o);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }

	}
}