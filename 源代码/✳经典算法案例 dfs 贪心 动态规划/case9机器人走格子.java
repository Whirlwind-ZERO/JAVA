package ���������㷨����;

/*
 * ��һ��x*y������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½�
 * �����һ���㷨������������ɶ������߷�
 * ��������������int x��int y�뷵�ػ����˵��߷���Ŀ����֤x+yС�ڵ���12
 * */

public class case9�������߸��� {
	//�ݹ鷨
	public static int test1(int x,int y) {
		if(x==1||y==1) {
			return 1;
		}
		return test1(x-1,y)+test1(x,y-1);
	}
	

	public static void main(String[] args) {

	}

}
