package base;

import java.util.Date;

/*
 * �ַ������ֹ��췽��
 * String a="ʱ����ǽ�Ǯ,�ҵ�����";
 * 
 * String a=new String("�Ұ��Ի��");
 * String b=new String(a);
 * 
 * char[] charArray={'t','i','m','e'};
 * String a=new String(charArray);
 * 
 * 
 * char[] charArray={'t','i','m','e'};
 * String a=new String(charArray,1,2);  a="im"
 * 
 * �ַ�����ƴ�� String b=a+"abc";
 * 
 * ȡ���ַ�������
 * int size=a.length();
 * 
 * �ж����ַ����Ƿ����:
 * str.indexOf("b");
 * �������ֵ���ڵ���0�����
 * ��Ϊ-1��Ϊfalse
 * 
 * public int indexOf(String str,int fromIndex) fromIndexΪ��ʼλ��
 * String str="We are the world";
 * int index=str.indexOf("e",3);
 * 
 * 
 * ��ȡָ�����ַ��ķ���
 * String name="Peter";
 * char ch=name.charAt(0); �õ�'P'
 * 
 * ��ȡ�ַ���:
 * 1.public String substring(int beginIndex) ָ����ʼ��λ��
 * 2.public String substring(int beginIndex,int endIndex) ��ʼλ�úͽ���λ��
 * String id="123456789";
 * System.out.println(id.substring(2, 5));
 * 
 * ȥ����λ�հ�����
 * public String trim()
 * String str="  abc   ";
 * String shortStr=str.trim();
 * 
 * ȥ���ַ��������пհ�����
 * String str="a b cd   e";
 * String shortstr=str.replaceAll("\\s","");
 * 
 * �����ַ����滻��ʽ:
 * public String replace()���ַ����л������ַ�����
 * public String replaceAll()�����ַ�����������ʽ���ݣ��滻�����ַ���
 * public String replaceFirst() �滻һ��
 * 
 * 
 * �ж��ַ�����β/��ͷ����
 * String fileName="HelloWorld.java";
 * Boolean bool1=fileName.endsWith(".java");
 * Boolean bool2=fileName.startsWith("Hello");
 * 
 * Ϊʲô�᲻���?
 * String name=new String("tom");
 * String dbValue=new String("tom");
 * name==dbValue;  ����Ϊfalse
 * ϵͳΪ���Ƿ�����������ͬ�Ŀռ�
 * ����ж��ַ��������Ƿ����
 * public boolean equals(String anotherString)
 * String name=new String("tom");
 * String dbValue=new String("tom");
 * boolean bool=name.equals(dbValue);
 * 
 * ���Դ�Сд�Ƚ�
 * public boolean equalslgnoreCase(String anotherString);
 * 
 * String name="tom";
 * String dbValue="tom";
 * name==dbValue; true
 * 
 * ��Сдת��
 * public String toUpperCase();
 * public String toLowerCase();
 * 
 * �ַ����ָ�
 * public String[] split(String regex);
 * public String[] split(String regex,int limit);
 * 
 * ��ʽ���ַ���
 * String.format(String format,Object...args);
 * 
 * ������ʽ
 * */

public class String_User{
	public static void main(String args[]) {
		
//	String a="8IIBI";
//	String b="sssss";
//	if(a.indexOf('B')>0) {
//		System.out.println("���ڸ��ַ�");
//	}
//	else if(a.indexOf('B')==-1) {
//		System.out.println("�����ڸ��ַ�");
//	}
	
//		String id="123456789";
//		System.out.println(id.substring(2, 5));
		
//		String str="��ͷһ��һ��";
//		String replaceStr=str.replace("һ", "��");
//		System.out.println(replaceStr);
		
//		String str="abc,def,ghi";
//		String[] strArray=str.split(",");
//		for(String cycle:strArray) {
//			System.out.println(cycle);
//		}
//		
//		String[] str2Array=str.split(",", 2);
//		for(String cycle:str2Array) {
//			System.out.println(cycle);
//		}

//		Date date=new Date();
//		String str=String.format("%tF",date);
//		System.out.println(date);
//		System.out.println(str);
		
		String str1=String.format("��ĸx��д%c:", 'X');
		System.out.println(str1);
		System.out.println(String.format("%.2f",Math.PI));
	
	}
}
