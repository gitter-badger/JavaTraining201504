package jp.co.sevenandinm.kenshuu2015.maekawa;
import java.util.Scanner;

public class Regx_PhoneNumber {


	public static void main(String[] args){
		Regx_PhoneNumber my = new Regx_PhoneNumber();
		String str =my.inputData();
		boolean flag= my.execute(str);
		my.dispOut(flag);

	}

	//電話番号の情報を得る
	public String inputData() {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("これからあなたの電話番号が正しいか判定します");
		System.out.println("まず、電話番号を入力してください。");
		System.out.println("例えば、00-1234-5678のようにハイフンをつけて入力してください。");

		Scanner stdIn_num = new Scanner (System.in);
		String tell_num = stdIn_num.nextLine();
		System.out.println(tell_num);
		return tell_num;

	}

	public boolean execute(String tell_num){
		boolean ret;
		ret = tell_num.matches("[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]");
		return ret;

	}

	public boolean dispOut(boolean trueflase){
		if(trueflase == true){
			System.out.println("あなたの電話番号は、とても素晴らしいです^^");
		}else{
			System.out.println("間違って入力してます。もう一度入力してください。");
		}
		return trueflase;

	}
}


