package ��������Ӧ�ð���;


import java.util.Arrays;
import java.util.Scanner;

public class ͳ����ĸ���ֵ����� {
    public static void main(String[] args) {
    	int total[]=new int[26];//����ͳ��ÿ����ĸ���ֵĴ���
    	//Arrays.fill(total, 0);//�����ʼ��������Զ���0������Ҫ�ú���
    	Scanner in=new Scanner(System.in);
    	System.out.println("�������ַ���:");
    	String s=in.nextLine();
    	char a='A';
    	
    	for(int i=0;i<=s.length()-1;i++) {
    		if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
    			total[s.charAt(i)-'A']++;
    		}
    		else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
    			total[s.charAt(i)-'a']++;
    		}
    	}
    	
    	for(int x:total) {
    		System.out.println("��ĸ"+(a++)+"�Ĵ�����"+x);
    	}
    }
}
