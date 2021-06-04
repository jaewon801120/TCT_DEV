package example1;

class solution1_1_ans {
	public long solution(long num) {
		long answer = num + 1;
		long digit = 1;
		while (answer / digit % 10 == 0) {
			answer += digit;
			digit *= 10;
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		solution1_1_ans sol = new solution1_1_ans();
		long num = 9949999;
		long ret = sol.solution(num);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}