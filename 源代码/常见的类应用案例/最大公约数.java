package ��������Ӧ�ð���;

import java.util.Scanner;

/*
  * ŷ�����
  * If m%n is 0,gcd(m,n) is n.
  * Otherwise,gcd(m,n) is gcd(n,m%n)
  * */

public class ���Լ�� {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,n,tmp,i,j;
		System.out.println("������������:");
		i=m=in.nextInt();
		j=n=in.nextInt();
		if(n>m) {
			tmp=m;
			m=n;
			n=tmp;
		}
		
		if(m%n==0) {
			System.out.printf("%d��%d�����Լ��Ϊ%d.\n",i,j,n);
			System.exit(0);
		}
		
		while(m%n!=0) {
			tmp=n;
			n=m%n;
			m=tmp;
		}
		System.out.printf("%d��%d�����Լ��Ϊ%d.\n",i,j,n);
		


	}

}
