package ���������㷨����;

import java.util.Arrays;
import java.util.Scanner;

//f(n)=f(n-1)+f(n-2)
public class case23��̬�滮�Ľ�쳲���������{
	static int rec[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//��������
		rec=new int[n];
		Arrays.fill(rec, -1);
		System.out.println(dp(n));
		
	}
	
	public static int dp(int n) {
		if(rec[n-1]>=0) {
			return rec[n-1];
		}
		if(n==1||n==2) {
			return 1;
		}
		int ans=dp(n-1)+dp(n-2);
		rec[n-1]=ans;
		return ans;
	}

}
