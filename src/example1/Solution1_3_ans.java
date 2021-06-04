package example1;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution1_3_ans {
	public int solution(String pos) {
		int dx[] = { 1, 1, -1, -1, 2, 2, -2, -2 };
		int dy[] = { 2, -2, -2, 2, 1, -1, -1, 1 };
		int cx = pos.charAt(0) - 'A';
		int cy = pos.charAt(1) - '0' - 1;
		int ans = 0;
		for (int i = 0; i < 8; ++i) {
			int nx = cx + dx[i];
			int ny = cy + dy[i];
			if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8)
				ans++;
		}
		return ans;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution1_3_ans sol = new Solution1_3_ans();
		String pos = "A7";
		int ret = sol.solution(pos);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환값은 " + ret + " 입니다.");
	}
}