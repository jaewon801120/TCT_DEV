import java.util.*;

public class MainClass2
{		
	public static int solution(int n, int k, int[][] travel)
	{
		int answer = 0;
		
		int[][] dp = new int[10000][10000];
		
		for(int i = 0 ; i < n; i++)
	    { 
	        if(i == 0)
	        {
	            dp[0][travel[i][0]] = travel[i][1];
	            dp[0][travel[i][2]] = travel[i][3];
	        }
	        else
	        {
	            for(int j = 0; j <= k; j++)
	            {
	                if(dp[i-1][j] == 0)
	                {
	                    continue;
	                }
	 
	                if(j + travel[i][0] <= k)
	                {
	                    dp[i][j + travel[i][0]] = Math.max(dp[i][j + @@@], dp[i-1][j] + @@@);
	                }
	 
	                if(j + travel[i][2] <= k)
	                {
	                    dp[i][j + travel[i][2]] = Math.max(dp[i][j + @@@], dp[i-1][j] + @@@);
	                }
	            }
	        }
	    }
	 
	    for(int i = 0 ; i <= k; i++)
	    {
	        if(answer < dp[n - 1][i])
	        {
	        	answer = dp[n -1][i];
	        }
	    }
		
		return answer;
	}
	
	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
	public static void main(String[] args) 
	{
		int n1 = 3;
		int k1 = 1650;
		int[][] travel1 = {{500, 200, 200, 100}, {800, 370, 300, 120}, {700, 250, 300, 90}};
		int ret1 = solution(n1, k1, travel1);
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
		
		int n2 = 4;
		int k2 = 3000;
		int[][] travel2 = {{1000, 2000, 300, 700}, {1100, 1900, 400, 900}, {900, 1800, 400, 700},  {1200, 2300, 500, 1200}};
		int ret2 = solution(n2, k2, travel2);
		
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
		
		int n3 = 3;
		int k3 = 6000;
		int[][] travel3 = {{500, 150, 200, 1000}, {100, 835, 200, 324}, {200, 125, 300, 900}};
		int ret3 = solution(n3, k3, travel3);
		
		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret3 + " �Դϴ�.");
	}
}







