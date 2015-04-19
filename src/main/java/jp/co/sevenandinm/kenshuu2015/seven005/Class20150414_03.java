package jp.co.sevenandinm.kenshuu2015.seven005;

import java.util.Scanner;
public class Class20150414_03{
        public static void main(String [] args){
                Scanner scan = new Scanner(System.in);
                System.out.println("求めたい階乗を入力してください");
                int number=scan.nextInt();
                int sum=factorialNumber(number);
                System.out.println(sum);
        }
        private static int factorialNumber(int num){
                int sum=1;
                if(num!=0){
                        sum=num*factorialNumber(num-1);
                        System.out.println(num);
                        System.out.println("この時点の合計値は"+sum);
                }
                return sum;
        }
}

