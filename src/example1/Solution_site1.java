//꽃피우기
//문제 설명
//정사각형 크기 격자 모양 정원에 칸마다 핀 꽃 또는 피지 않은 꽃을 심었습니다. 이 정원의 꽃이 모두 피는 데 며칠이 걸리는지 알고 싶습니다. 핀 꽃은 하루가 지나면 앞, 뒤, 양옆 네 방향에 있는 꽃을 피웁니다.
//
//현재 정원의 상태를 담은 2차원 배열 garden이 주어졌을 때, 모든 꽃이 피는데 며칠이 걸리는지 return 하도록 solution 메소드를 작성해주세요.
//
//매개변수 설명
//현재 정원 상태를 담은 2차원 배열 garden이 solution 메소드의 매개변수로 주어집니다.
//
//정원의 한 변의 길이는 2 이상 100 이하입니다.
//정원 상태를 담은 2차원 배열 garden의 원소는 0 또는 1 입니다.
//이미 핀 꽃은 1로 아직 피지 않은 꽃은 0으로 표현합니다.
//정원에 최소 꽃 한 개는 피어 있습니다.
//return 값 설명
//꽃이 모두 피는데 며칠이 걸리는지 return 합니다.
package example1;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution_site1 {
	public int solution(int[][] garden) {

		int nLen = garden.length;
//		int copy[][] = new int[nLen][nLen];
//		for(int i=0; i<nLen; i++){
//            System.arraycopy(garden[i], 0, copy[i], 0, nLen);
//        }
		
		int answer = 0;
		int nDay = 1;
		while (true) {
			
			boolean bChange = false;
			for (int i = 0; i < nLen; i++) {
				int[] arr = garden[i];
				
				for (int j=0; j<nLen; j++) {
					int n = garden[i][j];
					if (n == nDay) {
						if (i-1 >= 0 && garden[i-1][j] == 0) {
							garden[i-1][j] = nDay + 1;
							bChange = true;
						}
						if (i+1 < nLen && garden[i+1][j] == 0) {
							garden[i+1][j] = nDay + 1;
							bChange = true;
						}
						if (j-1 >= 0 && garden[i][j-1] == 0) {
							garden[i][j-1] = nDay + 1;
							bChange = true;
						}
						if (j+1 < nLen && garden[i][j+1] == 0) {
							garden[i][j+1] = nDay + 1;
							bChange = true;
						}
					}
				}
			}
			
			if (isComplete(garden) == true) {
				if (bChange == true)
					nDay++;
				answer = nDay;
				break;
			}

			nDay++;
		}
		
		return answer;
	}
	
	public boolean isComplete(int[][] garden) {
		int nLen = garden.length;
		for (int i = 0; i < nLen; i++) {
			int[] arr = garden[i];
			
			for (int n : arr) {
				if (n == 0) {
					return false;
				}
			}
		}
		return true;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution_site1 sol = new Solution_site1();
		int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int ret1 = sol.solution(garden1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int[][] garden2 = { { 1, 1 }, { 1, 1 } };
		int ret2 = sol.solution(garden2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}