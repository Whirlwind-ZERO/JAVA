package ��ѧ˼��;
/*
 * ͬ�෽��ax��1(mod n),gcd(a,n)=1ʱ�н�.
 * ��ʱ�������xΪa�Ķ�ģn�ĳ˷���Ԫ
 * ����ͬ�෽��ax��1(mod n),gcd(a,n)=1����������ⷽ��
 * ax+ny=1,x,yΪ���������������չŷ������㷨���
 * ԭͬ�෽�̵�Ψһ�Ľ��������չŷ������㷨�����x
 * */
public class ģ����Ԫ {
	static int x,y;
	//ŷ�������չ
	public static int gcdEx(int m,int n) { //ax+by=d
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=gcdEx(n,m%n);
		int t=x;
		x=y;
		y=t+m/n*y;
		return d;
	}
	/*
	 * ģ���Է���  ax��b(mod m)
	 * ax=tm+����
	 * b=t2m+����
	 * ax-b=m(t-t2)
	 * ax+my=b
	 * 
	 * */
	
	public static int ModalLinear(int a,int m,int b) {
		int d=gcdEx(a,m);
		if(b%d!=0) {
			System.out.println("�����ڽ�!");
			System.exit(0);
		}
		x=x*b/d%m;
		return d;
	}
	
	public static int inverseElement(int a,int mo) {//��Ԫ
		int d=ModalLinear(a,mo,1);
		x=(x%mo+mo)%mo;//��֤Ϊ����
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(inverseElement(13,5)+" "+x);
		
		
	}

}
