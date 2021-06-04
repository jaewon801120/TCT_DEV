import java.util.*;

public class MainClass7
{
	public static ArrayList<Character> solution(int round, int[][] children)
	{
		ArrayList<Character> answer = new ArrayList<Character>();
		
		int index = 1;
		
		for(int i = 0 ; i < round ; i++)
		{
			int[] a = new int[6];
			int[] b = new int[6];
			
			for(int j = 0 ; j < children[index].length ; j++)
			{
				b[children[index][j]] += 1;
			}
			
			for(int j = 0 ; j < children[index-1].length; j++)
			{
				a[children[index-1][j]] += 1;
			}
			
			if(a[4] < b[4])
			{
				answer.add('B');
			}
			else
			{
				if(a[4] == b[4])
				{
					if(a[3] < b[3])
					{
						answer.add('B');
					}
					else
					{
						if(a[3] == b[3])
						{
							if(a[2] < b[2])
							{
								answer.add('B');
							}
							else
							{
								if(a[2] == b[2])
								{
									if(a[1] < b[1])
									{
										answer.add('B');
									}
									else
									{
										if(a[1] == b[1])
										{
											@@@
										}
										else
										{
											@@@
										}
									}
								}
								else
								{
									answer.add('A');
								}
							}
						}
						else
						{
							answer.add('A');
						}
					}
				}
				else
				{
					answer.add('A');
				}
			}
			
			index += 2;
		}
		
		return answer;	
	}
	
	public static void main(String[] args)
	{
		int round1 = 5;
		int[][] children1 = {{4}, 
				            {3, 3, 2, 1}, 
				            {2, 4, 3, 2, 1}, 
				            {4, 3, 3, 1}, 
				            {3, 2, 1, 1}, 
				            {2, 3, 2, 1}, 
				            {4, 3, 2, 1}, 
				            {4, 3, 2}, 
				            {4, 4, 2, 3, 1}, 
				            {4, 2, 4, 1 ,3}};

		ArrayList<Character> ret1 = solution(round1, children1);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret1 + " �Դϴ�.");
		
		int round2 = 4;
		int[][] children2 = {{4, 3, 2, 1}, 
				            {1, 4, 3, 2}, 
				            {3, 3, 2, 1}, 
				            {4, 3, 3, 3}, 
				            {4, 3, 3, 3}, 
				            {3, 4, 3, 2}, 
				            {3, 2, 1, 1}, 
				            {3, 2, 1}};

		ArrayList<Character> ret = solution(round2, children2);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret + " �Դϴ�.");
	}
}
