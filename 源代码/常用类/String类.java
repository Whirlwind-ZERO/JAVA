package ������;


/*
������String��StringBuilder��ĳ��÷�����
��java��String�಻�ɱ�ģ�����һ��String������ܸ�������ֵ��
���������Ҫ��ԭ�ַ�������һЩ�Ķ�����������Ҫ��StringBuilder�����StringBuffer�࣬
StringBuilder��StringBuffer����һЩ��ȱ����StringBuilder�����̰߳�ȫ�ģ�
�����㷨������һ�������ò������̡߳�
���ԣ���Ҫ�Ƽ�ʹ��StringBuilder�ࡣ
 * */
public class String�� {
	public static void main(String[] args) {
		//String��ı���
		String s="123456";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		char s1[]=s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		//compareTo(String anotherString)//���ֵ�˳��Ƚ������ַ���
		//compareToIgnoreCase(String anotherString)//���ֵ�˳���Ҳ����ִ�Сд�Ƚ������ַ���
		//equals(String anotherString)//�ж������ַ����Ƿ���ȣ���ȷ���true���򷵻�false
		//equalsIgnoreCase(String str)//ͬ�ϣ������ִ�Сд��
		
		//�������ַ���
		//indexOf(int ch);// ����ָ���ַ��ڴ��ַ����е�һ�γ��ֵ�����
		//indexOf(int ch, int fromindex); // ͬ�ϣ� ��ָ��������ʼ����
		//indexOf(String str);//�����Ӵ��ڴ��ַ����е�һ�γ��ֵ�����
		//indexOf(String str, int fromindex);ͬ�ϣ���ָ��������ʼ����
		String s11="12";
		int f = s.indexOf(s11); // ������0��ʼ����
		int f1 = s.indexOf(s11, 6); // ������6��ʼ����
		int f2 = s.lastIndexOf(s11); 
		Boolean f3 = s.startsWith("12");
		System.out.println(f); // 2
		System.out.println(f1);// -1
		System.out.println(f2);// 5
		System.out.println(f3);// true
		
		//split(String regex); // ����������ʽ���
		String s2 = "ABC DEF";
		String s3[] = s2.split(" ");//���ݿո���
		System.out.println(s3[0]);// ABC
		System.out.println(s3[1]);// DEF
		
		//substring(int beginIndex, int endIndex)��//���ش�begin��ʼ��end-1�������Ӵ�
		//replaceAll(String s1,String s2);//��s2�滻Ŀ���ַ����г��ֵ�����s1
		//replaceFirst(String s1,String s2);//��s2�滻Ŀ���ַ����г��ֵĵ�һ��s1
		
		//toUpperCase(); //�����ַ����е�������ĸ����Ϊ��д
		//toLowerCase()//�����ַ����е�������ĸ����ΪСд
		
		
		//���������͵�����ת��Ϊ�ַ���
		int a = 10;
		String s4 = String.valueOf(a);
		System.out.print(s4); // 10
		
		
		
		
		//StringBulider
		//һ���ɱ���ַ�����
		
		StringBuilder s5=new StringBuilder("12356");
		//������String��һ�� ��charAt����
		
		/*
		 * append(String str);//�ڴ��ַ���׷��str��
           append(StringBuilder str);//�ڴ��ַ���׷��str��
           append(char[] str, int offset, int len);//��char��������׷�ӵ����ַ���
           delete(int start, int end);//�Ƴ������д�start��end-1���ַ���
           deleteCharAt(int index);//�Ƴ�ָ�������ϵ�char
           
           setCharAt(int index, char ch);//��ָ�����������ַ��滻Ϊch
           indexOf(String str);//�������ַ�����һ�γ��ֵ�����
           indexOf(String str, int fromIndex);//ͬ�ϣ���ָ��λ�ò���

           lastIndexOf(String str);//�������ַ������һ�γ��ֵ�����
           lastIndexOf(String str, int fromIndex);//ͬ�ϣ���ָ��λ�ò���
           
           reverse();//�����ַ�����ת
           substring(int start);//���ش��ַ�����start��ʼ��length-1������String
           substring(int start, int end);//���ش��ַ�����start��ʼ��end-1������String
           toString();//���ش������е�String��ʾ��ʽ��
           (ע�����Ϸ����ķ���ֵ����String������StringBuilder)
		 * */
	}

}
