package objectoriented2;
/*
 * ÿһ���඼��̳�Object
 * 
 * ���ֳ��÷���
 * getClass()���ض���ִ��ʱ��Classʵ��
 * 
 * toString()������д Ĭ�Ϸ��� ��·��@hashֵ
 * 
 * equals()�Ƚ����������Ƿ���� Ĭ�ϵ�equals()�Ƚϵ�����������ĵ�ַ
 * 
 * ����ת��������ת��
 * */
public class ObjectClass {
	public static void main(String[] args) {
//		Object demo=new Demo();
//		System.out.println(demo.getClass());
//		Object arr[]=new Object[4];
//		arr[0]=new Object();
//		arr[1]=new String("�ַ���");
//		arr[2]=new Integer(10);
//		arr[3]=new Demo();
//		for(Object obj:arr) {
//			System.out.println(obj.toString());//����toStringɾ����Ĭ��ʹ��toString
//		}
		
	    Person p1=new Person("С��","123");
	    Person p2=new Person("С��","123");
	    System.out.println(p1.equals(p2)); 
		
	}
}
