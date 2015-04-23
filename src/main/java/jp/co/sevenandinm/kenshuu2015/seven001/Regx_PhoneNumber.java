//正規表現：電話番号判定プログラム
package jp.co.sevenandinm.kenshuu2015.seven001;

public class Regx_PhoneNumber {

	public static void main(String[] args) {


//入力値取得メソッドの取得
		String input  = inputData();
//電話番号判定処理メソッドの取得
		boolean judge = execute(input);
//結果出力処理
		dispOut(judge);

	}

//入力値取得
		private static String inputData() {
			String message ="";
			message = "電話番号を入力してください。";
			System.out.println(message);

			String input = "";
			java.util.Scanner stdIn = new java.util.Scanner(System.in);
			input = stdIn.nextLine();
		return input;
	}

//電話番号判定処理
		private static boolean execute(String input){
			boolean judge;
//			judge = input.matches("\\d{2}-\\d{4}-\\d{4}");
			judge = input.matches("0\\d{1,4}-\\d{1,4}-\\d{4}");
			return judge;
	}

//結果出力処理
		private static void dispOut(boolean judge){

			if(judge == true){
				System.out.println("電話番号が正しく入力されました。");
			}else{
				System.out.println("電話番号が正しく入力されませんでした。");
			}
		}

}
