package ���������㷨����;

import java.util.Scanner;

/*
 * ��һ����СΪN*M��԰�ӣ�����ˮ������ͨ�Ļ�ˮ��Ϊ�����ӵ�һ���
 * �����԰���ﹲ�ж���ˮ�ݣ�
 * ��������N,M<=100
 * 
 * N=5,M=5
 * ԰������(w��ʾˮ
 * W....
 * ...WW
 * ...WW
 * .w...
 * .....
 * 
 * ���3
 * */

public class case14dfsˮ�� {
	
	private static void dfs(char a[][],int i,int j) {
		a[i][j]='.';
		for(int k=-1;k<2;k++) {
			//-1 0 1
			for(int l=-1;l<2;l++) {
				//-1 0 1
				if(k==0&&l==0)continue;
				if(i+k>=0&&i+k<=n-1&&j+l>=0&&j+l<=m-1) {
					if(a[i+k][j+l]=='W')
						dfs(a,i+k,j+l);
				}
			}
		}
	}
	
	static int n,m;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		char[][] a=new char[n][];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLine().toCharArray();
		}
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]=='W') {
					dfs(a,i,j);
					cnt++;
				}
			}
		}
	}

}
