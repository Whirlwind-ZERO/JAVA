package ��������Ӧ�ð���;

import java.util.Scanner;

public class ʮ����תʮ������ {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=0;
        int a;
        
        while(true) {
            String hex="";//�ַ����ַ��������ַ���
            System.out.print("����ʮ��������:");
            n=in.nextInt();
            if(n<0)
            	break;
        while(n!=0) {
            a=n%16;
            hex=(char)(a>9?('A'+(a-10)):('0'+a))+hex;
            n=n/16;
        }
        System.out.println(hex);
        }
        
        System.out.println("�������");
        

	}

}
