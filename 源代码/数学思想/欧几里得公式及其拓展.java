package ��ѧ˼��;
/*
 * ���κ�����a b�����ǵ����Լ��d������δ֪��x��y��
 * ���Է��̣�
 * ax+by=m ��������ʱ���ҽ���m��d�ı���
 * �����ʽ�н�ʱ��Ȼ�������������⣬ÿ���x��y��Ϊ������
 * ������չŷ������㷨���
 * */
public class ŷ����ù�ʽ������չ {
	public static int x,y;
	public static int Euclid(int m,int n) {//ŷ������㷨
		return (n==0)?m:Euclid(n,m%n);
	}
	
	public static int EuclidEx(int m,int n) {//ŷ����ù�ʽ��չ
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=EuclidEx(n,m%n);
		int t=y;
		y=x+m/n*y;
		x=t;
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(EuclidEx(4,2)+" "+x+" "+y);
	}
	
	

}
