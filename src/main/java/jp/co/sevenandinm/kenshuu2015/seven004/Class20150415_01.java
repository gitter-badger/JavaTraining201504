package jp.co.sevenandinm.kenshuu2015.seven004;
import java.util.*;

class Class20150415_01{

      public static void main(String[] args){

          HashSet <String> set = new HashSet<String>();

             set.add("X");

             set.add("D");

             set.add("A");

             set.add("U");
                 
             Iterator <String> it = set.iterator();

             while (it.hasNext()) {

                    System.out.println(it.next());

             }

        }
}