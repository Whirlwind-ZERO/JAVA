package ��ѧ˼��;
/*
 * ģ
 * �������m��������������mȡģ
 * ��a��b��mȡģ�Ľ����ͬ����Ϊa��b
 * Ҳ����a mod m==b mod m
 * ���a��b(mod m) c��d(mod m):
 * a+b=c+d(mod m)
 * a*b=c*d(mod m)
 * 
 * ģ���Է���  ax��b(mod m)

     ����a,b��m����֪�ģ�m>0����Ҫ����������ʽ�Ķ�ģm��xֵ������ͬ�෽�̵�x�����ж����Ҳ����һ����û�У�����ģ���Է���Ҳ��Ϊһ��ͬ�෽�̡�

    ���磺57x��7��mod 11����һ����x=9����9x��7��mod 6���޽⡣

    �⣺ģ���Է���ax��b(mod m)�Ĳ������£�

��1���� d=gcd��a,m��

��2����d����b����������ax��b(mod m)�޽⣬����������ת��3��

��3����x0,y0,��a*x0+m*y0=d;

��4������d��b����������a*x0+m*y0=d��д����a(x0*(b/d))+m*(y0*(b/d))=b, 

     ����ax+my=b��һ���ؽ�Ϊ x=x0*(b/d),y=y0*(b/d);

��5��x0*(b/d)��ax�ԣ�mod m����һ���ؽ⣬�ɴ˵�ax��b(mod m)�����н�

   ����d����Ϊ��x= (x0*(b/d)+ i*(m/d) ) (mod m), i=0,1,2,3,4.����d-1
 
 * 
 * ax��b��mod n��
 * ���Էֽ�� ax=n*y1+�� b=n*y2+�� 
 * ����������ĵ�ax+ny=b
 * */
public class ���ͬ�๫ʽ����ȷ��ʽ {
	static int x,y;
	public static int gcd(int m,int n) {
		return (n==0)?m:gcd(n,m%n);
	}
	
	public static int gcdEx(int m,int n) {
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
	
	public static void ModalLinear(int a,int b,int m) {  //ģ���Է��� ax��b(mod m);ax+ny=b
		int d=gcdEx(a,m),x1;//���x0��y0
		if(b%d!=0) {
			System.out.println("�÷����޽�");
			return ;
		}
		System.out.println(x+" "+y+" "+d+" "+x*(b/d)%m);
		for(int i=0;i<d;i++) {
		x1= (x*(b/d)+ i*(m/d) )%m;
		System.out.println(x1+" ");
		}
		
	}
	
	public static void main(String[] args) {
		ModalLinear(777,66,6); 
	}
	
	

}
