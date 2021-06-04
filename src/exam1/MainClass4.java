import java.util.*;

public class MainClass4 
{
	public static boolean solution(int[] stores, int k)
	{
		boolean answer = true;
		
		for(int number = 0 ; number <= 1000 ; number++)
		{
			int previous = -k;		
			int idx = 0;
			
			for(int store : stores)
			{
				if(store != number)
				{
					idx++;
					continue;
				}
				
				if(idx - previous <= k)
				{
					answer = false;
					return answer;
				}
				previous = idx++;
			}
		}
		
		return answer;	
	}
	
	public static void main(String[] args)
	{
		int[] stores1 = {2, 3, 5, 4, 2};
		int k1 = 4;
		boolean ret1 = solution(stores1, k1);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret1 + " �Դϴ�.");
		
		int[] stores2 = {1, 1, 5, 1, 6, 4};
		int k2 = 3;
		boolean ret2 = solution(stores2, k2);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret2 + " �Դϴ�.");
	}
}
