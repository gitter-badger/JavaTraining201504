package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.HashSet;
import java.util.Iterator;

public class Class20150415_03{
    public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("X");
		set.add("D");
		set.add("A");
		set.add("U");
		Iterator<String> it = set.iterator();
		/*
    	hashsetのオブジェクト
    	setは順番関係なく、あったやつを取り出す
    	*/
		while (it.hasNext()) {
    		System.out.println(it.next());
		}
    }
}

