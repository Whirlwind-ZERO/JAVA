package ���������㷨����;
/*
 * С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ף�2�׻���3��
 * ʵ��һ������������С���ж���������¥�ݵط�ʽ
 * */
public class case1С����¥�� {
	
	public static int case1(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		
		return case1(n-1)+case1(n-2)+case1(n-3);
	}
	

	public static void main(String[] args) {

	}

}
