package exam1;

import java.util.*;

public class MainClass1
{	
	public static int solution(int n, int[][] coordinate)
	{
		int answer = 0;
		int tempLength = 100000;
		
		for(int i = 0 ; i < n ; i++)
	    {
	        for(int j = 0 ; j < n ; j++)
	        {
	            if (i != j)
	            {
	                if(coordinate[i][1] == coordinate[j][1])
	                {
	                    if(tempLength > Math.abs(coordinate[i][0] - coordinate[j][0]))
	                    {
	                        tempLength = Math.abs(coordinate[i][0] - coordinate[j][0]);
	                    }
	                }
	            }
	        }
	        answer += tempLength;
	        tempLength = 100000;
	    }
		
		return answer;
	}
	
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
	public static void main(String[] args) 
	{
		int n1 = 5;
		int[][] coordinate1 = {{0, 1}, {1, 2}, {3, 1}, {4, 2}, {5, 1}}; 
		int ret1 = solution(n1, coordinate1);
		
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
		
		int n2 = 7;
		int[][] coordinate2 = {{6, 1}, {7, 2}, {9, 1}, {10, 2}, {0, 1}, {3, 1}, {4, 1}}; 
		int ret2 = solution(n2, coordinate2);
		
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}







