package �㷨;
/*
 * ϣ������
 * ����˼��
 * ��������(����ɨ�跽��)
 * �鲢����
 * */
public class һЩ���򷽷�_�õ�����˼�� {
	
	
	//ϣ������
	public static void shellSort(int arr[]) {
		//���ϵ���С����
		for(int d=arr.length/2;d>0;d=d/2) {
			for(int i=d;i<arr.length;i++) {
				int target=arr[i];
				int j=i-d;
				while(j>-1&&arr[j]>target) {
					arr[j+d]=arr[j];
					j-=d;
				}
				arr[j+d]=target;
			}
		}
	}
	
	/* ���η�
	 * ��ԭ���⻮�ֳ����ɸ���ģ��С���ṹ��ԭ����һ�µ������⣻
	 * �ݹ�Ľ����Щ�����⣬Ȼ���ٺϲ��������͵õ�ԭ����ý⡣
	 * ����ȷ������ʱ�䣬�Ƿ����㷨���ŵ�֮һ
	 * ����ģʽ��ÿһ��ݹ��϶�����������
	 * �ֽ⣺��ԭ����ֽ��һϵ�������⡢
	 * ������ݹ�Ľ�����������⡣���������㹻С����ֱ���н�
	 * �ϲ�����������Ľ���ϲ���ԭ����Ľ�
	 * 
	 * */
	
	//����֮����ɨ�������
	/*
	 * һ��ɨ�跨��˼·�ǣ�������ָ�뽫���黮��Ϊ��������
	 * ɨ��ָ�������ȷ��С�ڵ�����Ԫ�ģ�
	 * ɨ��ָ�뵽ĳ��ָ���м�Ϊδ֪�ģ�������ǽ��ڶ���ָ��
	 * ��Ϊδ֪�����ĩָ�룬ĩָ����ұ�����Ϊȷ�ϴ�����Ԫ��Ԫ��
	 * 
	 * */
	public static void quickSort(int A[],int p,int r) {
		if(p<r) {
			//int q=partition(A,p,r);
			int q=partition2(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	
	public static int partition(int A[],int p,int r) {
		int pivot=A[p];//����Ԫ��
		int sp=p+1;
		int bigger=r;
		int tmp;//�ڱ�
		while(sp<=bigger) {
			if(A[sp]<=pivot) {
				sp++;
			}
			else {
				tmp=A[sp];
				A[sp]=A[bigger];
				A[bigger]=tmp;
				bigger--;
			}
		}
		tmp=A[p];  //���biggerһ��ָ���pivotС�����һ��Ԫ��
		A[p]=A[bigger];
		A[bigger]=tmp;
		return bigger;
	}
	
	//˫��ɨ�跨
	/*
	 * ˼·:ͷβָ�����м�ɨ�裬�����ҵ�������Ԫ��Ԫ�أ������ҵ�С�ڵ���
	 * ��Ԫ��Ԫ�ض��߽���������ɨ�裬ֱ������޴�Ԫ�أ��Ҳ���СԪ��
	 * 
	 * */
	public static int partition2(int A[],int p,int r) {
		int pivot=A[p];
		int left=p+1,right=r;
		int tmp;//�ڱ�
		
	    while(right>=left){	
		   while(pivot>=A[left]&&right>=left) {
			  left++;
		 }
		   while(pivot<A[right]&&right>=left) {
			  right--;
		 } 
		   if(left<right) {
		   tmp=A[left];
		   A[left]=A[right];
		   A[right]=tmp;
		   }
	    }
	    tmp=A[right];
	    A[right]=pivot;
	    A[p]=tmp;
	    return right;
		
	}
	
	/*
	 * ���������Ż�
	 * */
	
	/*
	 * �鲢����(MergeSort)�㷨��ȫ�����˷���ģʽ
	 * �ֽ�:��n��Ԫ�طֽ������n/2��Ԫ�ص�������
	 * ���:�����������еݹ������
	 * �ϲ�:�ϲ�������������������ѵõ�������
	 * */
	public static void merge(int[] arr,int low,int mid,int high,int[] tmp){
		int i = 0;
		int j = low,k = mid+1;  //������к��ұ�������ʼ����
		while(j <= mid && k <= high){
			if(arr[j] < arr[k]){
				tmp[i++] = arr[j++];
			}else{
				tmp[i++] = arr[k++];
			}
		}
		//��������л���ʣ�࣬����ȫ��������tmp[]��
		while(j <= mid){    
			tmp[i++] = arr[j++];
		}
		while(k <= high){
			tmp[i++] = arr[k++];
		}	
		for(int t=0;t<i;t++){
			arr[low+t] = tmp[t];
		}
	}


   public static void mergeSort(int[] arr,int low,int high,int[] tmp){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(arr,low,mid,tmp); //��������н��й鲢����
			mergeSort(arr,mid+1,high,tmp);  //���ұ����н��й鲢����
			merge(arr,low,mid,high,tmp);    //�ϲ�������������
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,1,5,3,6,6,7,3,62,4};
		//shellSort(arr);
		int tmp[]=new int[10];
		mergeSort(arr,0,9,  tmp);
		for(int x:arr) {
			System.out.print(" "+x);
		}

	}

}
