package ���������㷨����;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��̬�滮������������һ������(�����ӽṹor������������)
 * ��һ��ⷨ������Ʒ������߲��ԣ����Ǿ����㷨
 * �����ǵ��ƣ��������ҵ�״̬ת�Ƶķ�ʽ��д��dp����
 * ��ʽ:
 *   -�����͵ݹ�
 *   -����
 * */

/*
 * ��n������,��i�����������Ϊwi����ֵΪvi����������������c�������,��������ܼ�ֵ
 * */
public class case22��̬�滮�������� {
	static int[] w= {2,1,3,2};
	static int[] v= {3,2,4,2};
	static int n=4;//��Ʒ����
	static int W=5;//�������޳���
	static int rec[][];
	
	public static void main(String[] args) {
		int ww=W;
		//ʹ�ö�̬�滮�Ľ�
		rec=new int [n][W+1];
		for(int i=0;i<n;i++) {
			Arrays.fill(rec[i], -1);//ȫ����ֵΪ-1
		}
		int ans=dfs(n,ww);
		
	}
	
	static int dfs(int i,int ww) {
		if(ww<=0) return 0;
		if(i==n) return 0;
		
		int v2=dfs(i+1,ww);
		if(ww>=w[i]) {
			int v1=v[i]+dfs(i+1,ww-w[i]);
			return Math.max(v1,v2);
		}
		else {
			return v2;
		}
	}
	
	static int dp(int i,int ww) {
		if(ww<=0) return 0;
		if(i==n) return 0;
		if(rec[i][ww]>=0)
			return rec[i][ww];//����֮ǰ�Ȳ�ѯ
		
		int v2=dfs(i+1,ww);
		int ans;
		if(ww>=w[i]) {
			int v1=v[i]+dfs(i+1,ww-w[i]);
			ans=Math.max(v1,v2);
		}
		else {
			ans=v2;
		}
		rec[i][ww]=ans;//����֮������¼
		return ans;
	}
	
	static int dp2() {
		int dp[][]=new int[n][W+1];
		//��ʼ��dp���еĵ�һ��
		for(int i=0;i<W+1;i++) {
			if(i>=w[0]) {//ÿ������0����Ʒ
				dp[0][i]=v[0];
			}
			else {
				dp[0][i]=0;
			}
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;i<W+1;j++) {
				if(j>=w[i]) {
					int i1=v[i]+dp[i-1][j-w[i]];
					int i2=dp[i-1][j];
					dp[i][j]=Math.max(i1, i2);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n-1][W];
	}
		
	

}
