package ���������㷨����;
/*
 * �Ծ����ߵ�Ч�����һ�����������а���ֵ˳��ĵ�k��Ԫ��
 * 
 * ˼·:1.����������
 * 2.ֱ��partition��С��Χ
 * */



public class case4��k��Ԫ�� {
	public static int search(int arr[],int begin,int high,int n) {
		int mid=partition(arr,begin,high);
		if(mid==n) {
			return mid;
		}
		else if(mid>n) {
			search(arr,begin,mid-1,n);
		}
		else {
			search(arr,mid-1,begin,n);
		}
		return mid;
		
	}
	
	public static int partition(int arr[],int begin,int high) {
		int pivot=arr[begin];
		int tmp;
		
		while(high>begin) {
			while(pivot>arr[begin]&&high>begin) {
				begin++;
			}
			while(pivot<arr[high]&&high>begin) {
				high--;
			}
			if(high>begin) {
				tmp=arr[begin];
				arr[begin]=arr[high];
				arr[high]=tmp;
			}
			
		}
		return high;
	}
	

	public static void main(String[] args) {
		int arr[]= {2,4,8,5,3,6,1,7};
		System.out.println(search(arr,0,7,2));

	}

}
