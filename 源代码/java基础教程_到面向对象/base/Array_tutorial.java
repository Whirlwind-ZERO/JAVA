package base;

import java.lang.reflect.Array;
import java.util.Arrays;

/*���첢��ʼ������ļ��ַ�ʽ
 * int a[]=new int[3];
 * int b[]=new int[]{3,4,5};
 * int c[]={1,2,3};
 * 
 * �����length
 * a.length
 * 
 * ��ά����
 * int arr[][]=new int[3][4];
 * int arr[][]={{1,2,3},{5,9,10}};
 * int arr[][]=new int[][]{{1,2,3},{4,5,6}};
 * ��������
 * foreach������ʽ�� 
   for(Ԫ������t Ԫ�ر���x : ��������obj){ 
   } 
   
 * ���������滻����Ԫ��
 * Arrays.fill(arr,int value);
 * Arrays,fill(arr,int fromIndex,int toIndex,int value);���� 
 * 
 * ��������
 * int arr[]=new int[]{23,42,12,8};
 * Arrays.sort(arr);
 * 
 * ��������
 * Arrays.copyOf(arr,newlength); ����  ���ƺ�������ĳ���
 * 
 * Arrays.copyOfRang(arr,formIndex,toIndex) ��ʼ(����) ����(������)
 * */

public class Array_tutorial {

	public static void main(String[] args) {
//		int al[][]= new int[3][4];
//		al[0]=new int[]{1,2,3,4};
//		al[1][2]=0;
        
//		char arr[][]=new char[2][];
//		arr[0]=new char[] {'��','��','��','��','��'};
//		arr[1]=new char[] {'��','��','��','��','��'};
//		
//		for(char a[]:arr) {
//			for(char b:a) {
//				System.out.print(b);
//			}
//			System.out.println("");
//		}
		
//		int arr[]=new int[]{23,42,12,8};
//		Arrays.sort(arr);
//		for(int x:arr) {
//			System.out.print(x+" ");
//		}
		
		int a[]= {1,2,3,4};
		int b[]=Arrays.copyOf(a, 3);
		for(int x:b) {
			System.out.print(x+" ");
		}
		
	}

}
