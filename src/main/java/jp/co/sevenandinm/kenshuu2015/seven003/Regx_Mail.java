package jp.co.sevenandinm.kenshuu2015.seven003;

import java.util.Scanner;

public class Regx_Mail {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたのメールアドレスを入力してください");

		Regx_Mail my = new Regx_Mail();
		Scanner stdIn = new Scanner(System.in);
		String input = my.inputData(stdIn);
		boolean isMailNo = my.execute(input);
		my.dispOut(input,isMailNo);
	}
	private void dispOut(String input, boolean isTelNo) {
		// TODO 自動生成されたメソッド・スタブ
		if(isTelNo){
			System.out.println("入力された< " + input + " >はメールアドレスとして正しいです。");
		}else{
			System.out.println("入力された< " + input + " >はメールアドレスではありません。");
		}
	}
	private boolean execute(String input) {
		 boolean isMailNo = false;
		 String regex = "[\\w\\.\\-]+@(?:[\\w\\-]+\\.)+[\\w\\-]+";
			isMailNo = input.matches(regex);
		 return isMailNo;

	}
	private String inputData(Scanner stdIn) {
		// TODO 自動生成されたメソッド・スタブ

		return stdIn.next();
	}
}
