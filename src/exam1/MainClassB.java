import java.util.*;

public class MainClassB 
{
	public static int[] func_a(int[] arr)
	{
		int[] answer = new int[11];
		
		for(int number : arr)
		{
			answer[number]++;
		}
		
		return answer;
	}
	
	public static ArrayList<Integer> func_b(int[] arr, int value)
	{
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int idx = 0;
		for(int number : arr)
		{
			if(value == number)
			{
				answer.add(idx);
			}
			idx++;
		}
		
		return answer;
	}
	
	public static int func_c(int[] arr)
	{
		int answer = 0;
		
		for(int number : arr)
		{
			if(answer < number)
			{
				answer = number;
			}
		}
		
		return answer;
	}
	
	public static ArrayList<Integer> solution(int[] worries)
	{
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int[] counter = func_@@@(@@@);
		int mode = func_@@@(@@@);
		answer = func_@@@(@@@);
		
		return answer;
	}
	
	public static void main(String[] args)
	{
		int[] worries = {2, 3, 7, 3, 2, 2, 3};
		ArrayList<Integer> ret = solution(worries);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret + " �Դϴ�.");
	}
}
