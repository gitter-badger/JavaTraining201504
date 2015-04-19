package jp.co.sevenandinm.kenshuu2015.seven004;
// 型変換：キャストの必要性に関して
 
public class Class20150414_01{

    /**
     * @param argsja
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a;
        int b,c;

        a = 100;
        b = 120;
        c = ( a + b ) * b * 100000000;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //ここまでを追加                //←前の手順でここまでを入力した

        //さらに追加
        short d = 500;                //←ここから追加
    	c = (short)a+ d;
        System.out.println(c);

        // 【課題】cast について：以下のコードを修正してみましょう。
	
        
    	d =  (short)(a + d);
        System.out.println(d);        //←ここまでを追加
    }

}



