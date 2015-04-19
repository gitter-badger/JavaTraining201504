package jp.co.sevenandinm.kenshuu2015.seven006;
import jp.co.sevenandinm.kenshuu2015.maekawa.Test1;

public class Test4 extends Test1{

	public Test4() {
		this.public_v = 1;
		this.protected_v = 2;
		// this.private_v = 3;
		//this.v = 4;
	}

	public static void main(String[] args) {
		Test4 my = new Test4();
		System.out.println(my.protected_v);

	}
//	class Test5{
//		Test5(){
//			Test1 o = new Test1();
//			o.public_v = 1;
//			o.protected_v = 2;
//			// this.private_v = 3;
//			o.v = 4;
//		}
//	}
}