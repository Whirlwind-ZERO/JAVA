package ���������㷨����;

import java.util.Scanner;

/*
 * ��̬�滮��̰���㷨����һ�ֵ����㷨
 * ���þֲ����Ž����Ƶ�ȫ�����Ž�
 * �ǶԱ�����ռ��һ���Ż�
 * ������������Ž��ӽṹʱ�����ö�̬�滮����̰���Ƕ�̬�滮������
 * 
 * ̰���㷨
 * ��ѭĳ�ֹ滮������ѡȡ��ǰ���Ų��ԣ������ҵ����Ž�
 * �ѵ㣺��ǰ����δ������������
 * */

/*
 * Ӳ������
 * ��1Ԫ 5Ԫ 10Ԫ 50Ԫ 100Ԫ 500Ԫ��Ӳ�Ҹ�c1 c5 c10 c50 c100 c500
 * ����Ҫ����ЩӲ����֧��AԪ��������Ҫ����Ӳ��
 * ����
 * 3 2 1 3 0 2
 * 620
 * ���6
 * */
public class case16̰���㷨Ӳ��֧�� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a[]=new int[6];//����Ӳ�ҵ�����
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int coin[]= {1,5,10,50,100,500};//Ӳ�����
        System.out.println(Greedy(a,coin,n,a.length-1));
	}
	
	public static int Greedy(int a[],int coin[],int n,int i){
		int total=0;
		while(coin[i]<=n&&a[i]>0) {
			a[i]--;
			n-=coin[i];
			total++;
		}
		if(n==0) {
			return total;
		}
		return total+Greedy(a,coin,n,i-1);
	}

}
