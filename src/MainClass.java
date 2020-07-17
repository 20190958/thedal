import java.util.ArrayList;
import java.util.Scanner;

/*
 * 메인 클래스
 */
public class MainClass {

	public static void main(String[] args) {
		System.out.println("메인 클래스");
		// 클래스 선언
		MyClass mc = new MyClass();
		mc.bab();
		mc.food();
		mc.nono();

		MyClass mc1 = null;

		MyClass2 mc2 = new MyClass2();
		mc2.m1();
		mc2.m2();

		MyClass3 mc3 = new MyClass3();
		int i = mc3.r1();
		System.out.println("r1에서 받은 int데이터:" + i);
		String b = mc3.r2();
		System.out.println(b + "~");

		// 클래스 만들고 메소드를 만들기
		// 더달의 기능을 별도로 만들어서
		// 더하기 출력 메소드
		// 더하기의 답을 전달 해주는 메소드
		// 메인에서 메소드만 이용해서 출력 또는 답 비교

		TheDal xx = new TheDal();
		ArrayList<Integer> list = xx.rnd2NumList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		int dab =xx.thehagi(list.get(0), list.get(1));
		System.out.println("답은"+dab);
		
		int hab = xx.thehagi();
		int gg = xx.userDab();
		while (xx.ox(hab, gg)) {
			System.out.println("틀렸다");
		}
	}

}
