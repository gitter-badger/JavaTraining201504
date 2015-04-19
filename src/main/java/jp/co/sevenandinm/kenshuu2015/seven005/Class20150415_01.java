package jp.co.sevenandinm.kenshuu2015.seven005;
import java.util.ArrayList;
 
public class Class20150415_01{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    	/*引数を収めるための()である
    	*/
        list.add("X");
        list.add("D");
        list.add("A");
        list.add("U");
         
        for (int i = 0; i < list.size(); i++) {
        	/*　配列の個数list.size()
        	list系は順番
        	*/
            System.out.println(list.get(i));
        }
    }
}

