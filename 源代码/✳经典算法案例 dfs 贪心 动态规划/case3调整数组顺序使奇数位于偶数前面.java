package ���������㷨����;
/*
 * ����һ���������飬�������������ֵ�˳��ʹ����������λ�������ǰ�벿�֣�
 * ����ż��λ������ĺ�벿�֡�Ҫ��ʱ�临�Ӷ�Ϊn
 * */
public class case3��������˳��ʹ����λ��ż��ǰ�� {

	public static void partition(int arr[],int begin,int end) {
		int tmp;
	    
		while(begin<end) {
		   while(arr[begin]%2==1&&begin<end) {
			  begin++;
		   }
		   while(arr[end]%2==0&&begin<end) {
			  end--;
		   }
		   if(begin<end) {
		      tmp=arr[begin];
		      arr[begin]=arr[end];
		      arr[end]=tmp;
		   }
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,9};
		partition(arr,0,9);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		

	}

}
