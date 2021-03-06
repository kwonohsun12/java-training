package Interview;

class Programming {
	public static void main(String[] args) {

		// 1~100까지 더하기
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			sum = sum + i;
		}
		System.out.println("1~100까지 더한 수 : " + sum);

		// for문을 이요한 구구단 만들기
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		// 구구단 3단에서 4의 배수를 제외하고 출력
		int count = 0;
		for (int i = 1; i <= 9; i++) {
			if (!(((3 * i) % 4) == 0)) {
				count++;
				System.out.println(3 * i);
			}
		}
		System.out.println("총 개수" + count);

		// 자바 로또 프로그램 만들기

		int lotto[] = new int[6];
		// 번호 생성
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			// 중복 번호 제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호:");
		
		//번호 출력
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
