package ���������㷨����;

public class case15dfs�������֦n�ʺ� {
	/*
	 * �ݹ���ô�����һ����֧�����ϣ�������֧���غ�ĳЩ���ݻָ�����֧
	 * ����ǰ��״̬�Ա����¿�ʼ����Ҫʹ�û��ݼ���
	 * 
	 * ��֦
	 * ����ʱ��������ȷ�ӵ�ǰ״̬�������ת�ƶ�������ڸ��Ž⣬��Ӧ���ж����µļ������������ַ�����Ϊ��֦
	 * 
	 * */

	/*
	 * �����һ���㷨�����������n�ʺ����⣬�����n�ʺ�����ָ��һ��n*n�������Ϸ���n������
	 * ʹ��ÿ��ÿ�жԽ����϶�ֻ��һ�����ӣ���ڷŵķ�������
	 * */
	static int n;
	static int cnt;
	static int[] rec;
	
	public static void main(String[] args) {
        n=4;
        rec=new int[4];
        dfs(0);
        System.out.println(cnt);
	}
	
	private static void dfs(int row) {
		if(row==n) {
			cnt++;
			return;
		}
		//�����ϷŻʺ�
		for(int col=0;col<n;col++) {
			boolean ok=true;
			//���
			for(int i=0;i<row;i++) {
				if(rec[i]==col||i+rec[i]==row+col||rec[i]-i==col-row) {
					ok=false;
					break;
				}
			}
			if(ok) {
				rec[row]=col;
				dfs(row+1);
			}
		}
	}

}
