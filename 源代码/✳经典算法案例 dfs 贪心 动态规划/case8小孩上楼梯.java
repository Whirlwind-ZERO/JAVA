package ���������㷨����;
/*
 * С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ף�2�ף�3��
 * ��ʵ��һ������������С���ɶ�������¥�ķ�ʽ
 * Ϊ�˷�ֹ������뽫���mod 1000000007
 * 
 * ����һ������int n���뷵��һ������������¥�ķ�ʽ����
 * ��֤nС�ڵ���100000
 * */
public class case8С����¥�� {
	final static int mod=1000000007;
	//���ǵݹ鷨
	public static int test1(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n<0) {
			return 0;
		}
		return (test1(n-1)+test1(n-2)+test1(n-3)%mod);
	}
	
	//������
	public static int test2(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n<0) {
			return 0;
		}
		int x1=1;
		int x2=2;
		int x3=4;
		for(int i=4;i<=n;i++) {
			int x=x1;
			x1=x2 % mod;
			x2=x3 % mod;
			x3=(x+x1+x2)%mod;
		}
		return x3;
		
	}
	
	public static void main(String[] args) {
		System.out.println(test1(10)+" "+test2(10));
	}

}
