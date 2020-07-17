import java.util.*;

public class TheDal {
	public int userDab() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public int[] rnd2Num() {
		Random rd = new Random();
		int[] nums = new int[2];
		nums[0] = rd.nextInt(89) + 10;
		nums[1] = rd.nextInt(89) + 10;
		return nums;
	}

	public ArrayList<Integer> rnd2NumList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rd = new Random();
		list.add(rd.nextInt(89) + 10);
		list.add(rd.nextInt(89) + 10);
		return list;
	}

	public int thehagi() {
		Random rd = new Random();
		int x = rd.nextInt(89) + 10;
		int y = rd.nextInt(89) + 10;
		int z = x + y;
		System.out.print(x + "+" + y + "는?");
		return z;
	}

	// 매개 변수로 두개를 받아서 더하기 값을 전달 하는 매소드
	// 매소드 이름은 그대로 thehagi 사용
	// 메인 메소드에서
	// 위에 만든 랜덤 숫자 2개를 전달 매소드를 활용
	// 메인 매소드에서 thehagi의 결과만 출력 해보자
	// rnd2NumList() 매소드를 호출하고
	// 받은 데이터를 thehagi() 넣고 thehagi() 에서 결과값을 외부로 전달해서
	// 화면에 결과값만 출력

	public int thehagi(int num1, int num2) {

		return num1 + num2;
	}

	public boolean ox(int hab, int input) {
		if (hab == input) {
			return true;
//			System.out.println("맞다");

		} else {
			return false;
//			System.out.println("틀렸다");
		}
	}
}
