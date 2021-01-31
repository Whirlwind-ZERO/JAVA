package ���������㷨����;

public class case12_dfs������Ϸ {
	private static void dfs(char[][] table,int x,int y) {
		if(x==9) {
			print(table);
			System.exit(0);
		}
		if(table[x][y]=='0') {
			for(int k=1;k<10;k++) {
				if(check(table,x,y,k)) {
					table[x][y]=(char)('0'+k);
					dfs(table,x+(y+1)/9,(y+1)%9);//������һ��״̬
				}
			}
			table[x][y]='0';//����
			
		}
		else {
			dfs(table,x+(y+1)/9,(y+1)%9);//������һ��״̬
		}
	}
	
	private static void print(char[][] table) {
		for(int i=0;i<9;i++) {
			System.out.println(table[i]);
		}
	}
	
	private static boolean check(char[][] table,int i,int j,int k) {
		//���ͬ�к�ͬ��
		for(int l=0;l<9;i++) {
			if(table[i][l]==(char)('0'+k))return false;
			if(table[l][j]==(char)('0'+k))return false;
		}
		
		for(int l=(i/3)*3;l<(i/3+1)*3;l++) {
			for(int m=(j/3)*3;m<(j/3+1)*3;m++) {
				if(table[l][m]==(char)('0'+k))return false;
			}
		}
		return true;
	}

}
