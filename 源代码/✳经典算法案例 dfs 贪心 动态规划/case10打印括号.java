package ���������㷨����;

import java.util.HashSet;
import java.util.Set;

/*
 * ʵ��һ���㷨����ӡn�����ŵ�ȫ����Ч��ϣ�������������ȷ��ԣ�
 *  ���룺3
 *  ���((())),(()()),()(()),()()()
 * */
public class case10��ӡ���� {
	public static Set<String> test1(int n){
		Set<String> theNew=new HashSet<>();
		if(n==1) {
			theNew.add("()");
			return theNew;
		}
		Set<String> oldNew=test1(n-1);
		for(String x:oldNew) {
			theNew.add("()"+x);
			theNew.add("("+x+")");
			theNew.add(x+"()");
		}
		return theNew;
	}

	public static void main(String[] args) {
		System.out.println(test1(3));

	}

}
