import java.util.*;

public class MainClass3
{
	public static int solution(int[][] cookings, int n)
	{
		int answer = 0;
		
		Arrays.sort(cookings, new Comparator<int[]>() {      
	        public int compare(int[] o1, int[] o2) {
	            return Integer.compare(o2[1], o1[1]);
	        }
	    });
		
		
		for(int[] e : cookings)
		{
			int stock = e[0];
			int price = e[1];
			int count = Math.min(n, stock);
			n -= count;
			
			answer += price * n;
		}
		
		return answer;	
	}
	
	public static void main(String[] args)
	{
		int[][] cookings = {{4, 3000}, {3, 4000}};
		int n = 5;
		int ret = solution(cookings, n);
		System.out.println("solution �޼ҵ��� ��ȯ ���� "+ ret + " �Դϴ�.");
	}
}
