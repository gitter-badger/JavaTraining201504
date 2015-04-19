package jp.co.sevenandinm.kenshuu2015.seven002;

public class Class20150413_04{
    public static void main(String[] args){
        System.out.println(" 九九の表");
        System.out.println("------");
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
            System.out.print((i*j)>=10 ? "  "+(i*j) : "   "+(i*j));
            
            }
            System.out.println();
        }
    }
}

// 九九の答えが2桁ならば半角スペース1個、1桁ならば半角スペース2個
            // System.out.print(条件式 ? true : false); の形になっている