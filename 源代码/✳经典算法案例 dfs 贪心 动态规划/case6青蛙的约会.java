package ���������㷨����;

import java.util.Scanner;

/*
 * ��ֻ������������ʶ�ˣ������ĵúܿ��ģ����Ǿ��ú��б�Ҫ��һ-�档���Ǻܸ��˵ط�������ס
��ͬһ��γ�����ϣ���������Լ�����Գ�������ֱ������Ϊֹ���������ǳ���֮ǰ������һ����
��Ҫ�����飬��û��������Է���������Ҳû��Լ������ľ���λ�á����������Ƕ��Ǻ��ֹ�
�ģ����Ǿ���ֻҪһֱ����ĳ����������ȥ�����������Է��ġ����ǳ�������ֻ������ͬ-һʱ��
����ͬһ���ϣ���Ȼ����Զ�������������ġ�Ϊ�˰�������ֻ�ֹ۵����ܣ��㱻Ҫ��дһ������
���ж�����ֻ�����Ƿ��ܹ����棬����ʲôʱ�����档
        ���ǰ�����ֻ���ֱܷ��������A������B�����ҹ涨γ�����϶���0�ȴ�Ϊԭ�㣬�ɶ�����Ϊ��
���򣬵�λ����1�ף��������Ǿ͵õ���һ����β��ӵ����ᡣ������A�ĳ�����������x������
B�ĳ�����������y������Aһ������m�ף�����Bһ������n�ף� ��ֻ������һ�������ѵ�ʱ����
ͬ��γ�����ܳ�L�ס�����Ҫ������������˼����Ժ�Ż����档

 * */
public class case6���ܵ�Լ�� {
	static int x,y;
	public static int gcdEx(int m,int n) {
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=gcdEx(n,m%n);
		int t=x;
		x=y;
		y=t+n/m*y;
		return d;
		
	}
	
	public static void  ModalLinear(int a,int b,int n) {
		int d=gcdEx(a,n);
		if(b%d!=0) {
			System.out.println("imposible!");
			return;
		}
		x= (x*(b/d)+ n/d)%n;
		System.out.println(x+" ");
		
	}

	public static void main(String[] args) {
		// ����Ŀ��õ�ʽ x+mk��y+nk (mod L)
		/* x+mk=Lt1+����
		 * y+nk=Lt2+����
		 * ����ʽ���
		 * x-y+k(m-n)=L(t1-t2)
		 * k(m-n)+Lt=y-x
		 * ax+ny=d
		 * ax=b(mod n)
		 * 
		 * */
		 Scanner in=new Scanner(System.in);
		 int x0=in.nextInt();
		 int y0=in.nextInt();
		 int n=in.nextInt();
		 int m=in.nextInt();
		 int L=in.nextInt();
		 int a=m-n;
		 long b=L;
		 

	}

}
