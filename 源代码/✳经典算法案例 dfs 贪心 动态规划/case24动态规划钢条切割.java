package ���������㷨����;
/*
 * Serling��˾���򳤸����������и�Ϊ�̸������ۣ��и����û�гɱ�֧������˾�����ϣ��֪������и��
 * �ٶ�����֪��Serling��˾����һ�γ�ΪiӢ��ĸ����ļ۸�Ϊpi(i=1,2..��λΪ��Ԫ)
 * �����ĳ���Ϊ��Ӣ��
 * ����  1  2  3  4  5  6  7  8  9  10
 * �۸�  1  5  8  16 10 17 17 20 24 30 
 * */

public class case24��̬�滮�����и� {
	static int n=10;
	static int[] p= {1,5,8,16,10,17,17,20,24,30};
	static int rec[];
	static int dfs(int x) {
		if(x==0)
			return 0;
		int ans=0;
		for(int i=1;i<=x;i++) {
			if(rec[x-i]==-1)
				rec[x-i]=dfs(x-i);
			int v=p[i-1]+rec[x-i];
			ans=Math.max(v,ans);
		}
		rec[x]=ans;
		return ans;
	}
	
	static int dp() {
		rec[0]=0;
		for(int i=1;i<=n;i++) { //ӵ�еĸ�������
			for(int j=1;j<=i;j++) {//����jΪ����
				rec[i]=Math.max(p[j-1]+rec[i-j],rec[i]);
			}
		}
		return rec[n];
	}

	public static void main(String[] args) {
	}

}
