package jp.co.sevenandinm.kenshuu2015.seven006;
import java.util.HashMap;
import java.util.Iterator;


public class Class20150415_03{
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
		
		//hasNext <=次の要素が存在するか検査する。
		while (it.hasNext()) {
			String str = it.next();
	   	System.out.println(str + " = " + map.get(str));
		}
	}
}