package example1;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution1_3 {
	public int solution(String pos) {
		char chX = pos.charAt(0);
		char chY = pos.charAt(1);
		int x = (int)chX - 65;
		int y = (int)chY;
		
		// x - 2, y - 1, x - 2, y + 1
		// x + 2, y - 1, x + 2, y + 1
		// x - 1, y - 2, x + 1, y - 2
		// x - 1, y + 2, x + 1, y + 2
		
		int answer = 0;
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution1_3 sol = new Solution1_3();
		String pos = "A7";
		int ret = sol.solution(pos);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환값은 " + ret + " 입니다.");
	}
}