package exam1;

import java.util.*;

public class MainClass8
{
	public static int func_a(int count)
	{
		int sum = 0;

		while(count != 0)
		{
			sum += func_c(count);
			count /= 10;
		}
		
		return sum;
	}
	
	public static int func_b(int sum, int index)
	{
		if(sum == 0)
		{
			return 0;
		}
		return index % sum;
	}
	
	public static int func_c(int num)
	{
		return num % 10;
	}
	
	public static int solution(int N)
	{
		int answer = 0;
		
		for(int i = 1 ; i <= N; i++)
		{
			int check = func_a(i);
			
			if(func_b(check, i) == 0)
			{
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args)
	{
		int N1 = 9;
		int ret1 = solution(N1);
		System.out.println("solution 메소드의 반환 값은 "+ ret1 + " 입니다.");
		
		int N2 = 21;
		int ret2 = solution(N2);
		System.out.println("solution 메소드의 반환 값은 "+ ret2 + " 입니다.");
	}
}
