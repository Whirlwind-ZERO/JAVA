package ��������Ӧ�ð���;

public class Case8_������� {

	public static void main(String[] args) {
		double total=89735.12;
		double start=10000;
		int a[]=new int[7];
		char b[]= {'��','ǧ','��','ʮ','Ԫ','��','��'};
		for(int i=0;i<7;i++) {
			System.out.println(total+"   "+start);
		    a[i]=(int)(total/start);
		    total=total%start;
		    start=start/10;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+""+b[i]);
		}
		
	    

	}

}
