package ���������㷨����;

import java.util.Arrays;
import java.util.Scanner;

//����n�����壬��i����������Ϊwi����ѡ���������Ʒ��ʹ��Ʒ������������c
public class case20�������� {
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();//������Ʒ����
		 int b=sc.nextInt();//���뱳��������
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=sc.nextInt();//����ÿ����Ʒ������
	     }
	     Arrays.sort(arr);
	     
	     t1(arr,n,b);
           
	}
	
	private static int t1(int arr[],int n,int b) {
		int total=0;
		int i=0;//��Ʒ����
		for(int x:arr) {
			if(total<=b) {
		      total+=x;
		      i++;
			}
			else {
			  break;
			}
		}
		return i;
	}
	
	/*
	 * ��n������,��i�����������Ϊwi����ֵΪvi����������������c����������ܼ�ֵ������
	 * ÿһ�����嶼����ֻȡ��һ���֣���ֵ����������������
	 * ������ܼ�ֵ
	 * ע�⣺ÿ���������ֻ��һ���֣����һ��������������ǡ��Ϊc
	 * 
	 * */
	
	

}
