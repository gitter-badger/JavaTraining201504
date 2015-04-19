//2つの配列をつくり等しいかどうか判定するプログラム

	package jp.co.sevenandinm.kenshuu2015.seven001;
	public class Class20150415_10{
			public static void main (String[] args){
			
//定義
				String message = "";
				int input01 [] = new int [3];
				int input02 [] = new int [3];
			
//画面にメッセージを表示
				message = "2つの配列をつくり等しいかどうか判定する";
				System.out.println(message);
			
//入力画面
				message = "3つの数値を入力してください。";
				System.out.println(message);
				java.util.Scanner stdIn_01 = new java.util.Scanner(System.in);
				
				input01 [0] = stdIn_01.nextInt();
				input01 [1] = stdIn_01.nextInt();
				input01 [2] = stdIn_01.nextInt();
				
				
				message = "3つの数値を入力してください。";
				System.out.println(message);
				java.util.Scanner stdIn_02 = new java.util.Scanner(System.in);
				
				input02 [0] = stdIn_02.nextInt();
				input02 [1] = stdIn_02.nextInt();
				input02 [2] = stdIn_02.nextInt();
				
//出力画面
				if(input01 [0] == input02 [0] && input01 [1] == input02 [1] && input01 [2] == input02 [2]){
					for(int i = 0 ;i <input01.length; i++){
					System.out.println(input01[i]);
					}
				}else{
					System.out.println("エラー");
				}

				
				
			
			
			
			}
			}
