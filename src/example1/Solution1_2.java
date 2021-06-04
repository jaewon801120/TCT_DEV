package example1;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution1_2 {
	public int solution(int n) {

		int x = -1;
		int y = 0;
		int num = 1;
		int[][] arr = new int[n][n];
		int max = n;
		int direct = 1;

		while (max != 0) {

			for (int i = 0; i < max; i++) {
				x += direct;
				arr[x][y] = num++;
			}

			max--;

			for (int j = 0; j < max; j++) {
				y += direct;
				arr[x][y] = num++;
			}

			direct = -direct;
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			answer += arr[i][i];
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution1_2 sol = new Solution1_2();
		int n1 = 3;
		int ret1 = sol.solution(n1);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int n2 = 2;
		int ret2 = sol.solution(n2);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}