package example1;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution1_1 {
	public long Solution1_1(long num) {
		num++;

		long nDigit = 0;
		long nSum = 1;
		long n = 1;

		while (true) {
			nDigit = (long) Math.pow(10, n++);
			long nRemain = num % nDigit;
			if (nRemain != 0) {
				nSum -= nDigit / 10;
				break;
			}

			nSum += nDigit;
		}

		long answer = num + nSum;
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution1_1 sol = new Solution1_1();
		long num = 9949999;
		// long num = 199;
		long ret = sol.Solution1_1(num);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Solution1_1 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
