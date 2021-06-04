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
	        tempLength = 0;
	    }
		
		return answer;
	}
	
	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
	public static void main(String[] args) 
	{
		int n1 = 5;
		int[][] coordinate1 = {{0, 1}, {1, 2}, {3, 1}, {4, 2}, {5, 1}}; 
		int ret1 = solution(n1, coordinate1);
		
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
		
		int n2 = 7;
		int[][] coordinate2 = {{6, 1}, {7, 2}, {9, 1}, {10, 2}, {0, 1}, {3, 1}, {4, 1}}; 
		int ret2 = solution(n2, coordinate2);
		
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	}
}







