//자연수가 들어있는 배열에서 숫자 K개를 선택하려 합니다. 이때, 선택한 숫자 중 가장 큰 수와 가장 작은 수의 차이가 최소가 되도록 해야합니다.
//
//예를 들어 배열에 들어있는 숫자가 [9, 11, 9, 6, 4, 19] 이고, K = 4 라면
//
//숫자 4개를 [9, 11, 9, 6]로 뽑으면 (가장 큰 수 - 가장 작은 수) = (11 - 6) = 5가 됩니다.
//[9, 9, 6, 4] 와 같이 숫자를 뽑아도 (가장 큰 수 - 가장 작은 수) = (9 - 4) = 5가 됩니다.
//그러나 가장 큰 수와 가장 작은 수의 차이가 5보다 작아지도록 숫자 4개를 선택하는 방법은 없습니다.
//
//자연수가 들어있는 배열 arr, 선택해야 하는 숫자 개수 K가 매개변수로 주어질 때, 선택한 숫자중 가장 큰 수와 가장 작은 수의 차이가 최소가 되록 arr에서 숫자 K개를 선택했을 때, 그때의 가장 큰 수와 가장 작은 수의 차이를 return 하도록 solution 메소드를 완성해주세요.
//
//매개변수 설명
//자연수가 들어있는 배열 arr, 선택해야 하는 숫자 개수 K가 solution 메소드의 매개변수로 주어집니다.
//
//arr 배열의 길이는 5 이상 1,000 이하입니다.
//arr의 원소는 1 이상 10,000 이하인 자연수입니다.
//K 는 4 이상 50 이하인 자연수입니다.
//return값 설명
//선택한 숫자중 가장 큰 수와 가장 작은 수의 차이가 최소가 되도록 arr에서 숫자 K개를 선택했을 때, 그때의 가장 큰 수와 가장 작은 수의 차이를 return 해주세요.
package example1;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution_site2 {
	public int solution(int[] arr, int K) {
		
		Arrays.sort(arr);
		
		int nDiff = arr[arr.length-1];
		for (int i=0; i<arr.length-K+1; i++) {
			int[] temp = Arrays.copyOfRange(arr, i, i+K);
			nDiff = Math.min(nDiff, temp[K-1] - temp[0]);
		}

		int answer = nDiff;
		
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution_site2 sol = new Solution_site2();
		int[] arr = { 9, 11, 9, 6, 4, 19, 1 };
		int K = 4;
		int ret = sol.solution(arr, K);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
	}
}
