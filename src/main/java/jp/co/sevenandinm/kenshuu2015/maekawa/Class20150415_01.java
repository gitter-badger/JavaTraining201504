package jp.co.sevenandinm.kenshuu2015.maekawa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Class20150415_01 {

	public Class20150415_01() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		execArrayLyst();
		execLinkedList();
		execHashSet();
		execTreeSet();
		execHashMap();
		execTreeMap();
	}

	private static void execArrayLyst() {
		ArrayList<String> list = new ArrayList<String>();

		list.add("X");
		list.add("D");
		list.add("A");
		list.add("U");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
	}

	private static void execLinkedList() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("X");
		list.add("D");
		list.add("A");
		list.add("U");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	private static void execHashSet() {
		HashSet<String> set = new HashSet<String>();
		set.add("X");
		set.add("D");
		set.add("A");
		set.add("U");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	private static void execTreeSet() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("X");
		set.add("D");
		set.add("A");
		set.add("U");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
	}

	private static void execHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();

		// map.put("キー", "値") ;
		map.put("name", "Hirose");
		map.put("score", "" + 90);
		map.put("age", "" + 15);

		map.put("name", "maekawa");

		System.out.println("name = " + map.get("name"));
		System.out.println("score = " + map.get("score"));
		System.out.println("age = " + map.get("age"));

		System.out.println();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " = " + map.get(o));

		}
	}

	private static void execTreeMap() {
		TreeMap<String, String> map = new TreeMap<String, String>();

		// map.put("キー", "値") ;
		map.put("name", "Hirose");
		map.put("score", "" + 90);
		map.put("age", "" + 15);

		map.put("name", "maekawa");

		System.out.println("name = " + map.get("name"));
		System.out.println("score = " + map.get("score"));
		System.out.println("age = " + map.get("age"));

		System.out.println();

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

		System.out.println();

		for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "  value :" + value);
        }
	}

}
