package ObjectOriented;

/*
 * �����������Ƶ�����
 * ��װ �̳� ��̬
 * 
 * �ࣺ ��Ա���� ��Ա���� �ֲ�����
 * 
 * this�ؼ���:
 * ��������ʱ��Ҫ���ù��췽��
 * 
 * Ȩ�����η�
 *             private protected public
 * ����                                  �ɼ�                     �ɼ�                  �ɼ�
 * ͬ�������������          ���ɼ�                 �ɼ�                  �ɼ�
 * ���������������          ���ɼ�                 ���ɼ�              �ɼ�
 * 
 * ���췽��
 * ���Ǵ�������������еķ�����Ҳ���Ƕ����ʼ������
 * �������幹�췽��������������Զ�����һ�����������ķ���
 * 
 * ��̬���η�
 * ��static���εı��� �����ͷ�����������̬��������̬�����;�̬����
 * ���Ƕ�������ڴ��"��̬��"��,��Щ�����ͷ����ж������������ڡ�
 * 
 * ������
 * �������Ǿ�̬�ģ�����Ҫֱ�����������е���������������÷�������Ҳ�Ǿ�̬��.
 * ������û�з���ֵ
 * ���������β�Ϊ���顣����args[0]-args[n]�ֱ�������ĵ�һ����������n������������ʹ��args.length��ȡ �����ĸ���
 * 
 * ���������
 * ����Ĵ���
 * Test test=new Test(); �� ����=�����ʵ��
 * ����ֻ�Ǵ��һ��������ڴ��ַ�����Ǵ��һ�������ϸ��˵���úͶ����ǲ�ͬ�أ�
 * ���ǿ��Խ�����������ԣ�����Լ򵥵�˵book��Book���һ�����󣬶���ʵ��Ӧ��
 * ��book����Book�����һ������
 * 
 * �����ʹ��
 * Test test=new Test().Start;
 * 
 * ���������
 * {
 * Examble e=new Example();
 * }
 * ������Χ�Զ�����
 * 
 * {
 * Examble e=new Example();
 * e=null;
 * }
 * */

public class ClassTutorial {

	public static void main(String[] args) {
		TestClassTutorial a=new TestClassTutorial();
	    a.showName("���Ƿ籩");
	    
	    TestClassTutorial_Static b=TestClassTutorial_Static.Start();
	    TestClassTutorial_Static c=TestClassTutorial_Static.Start();
	//��̬����
	    c.inlet();
	    c.inlet();
	    System.out.println("��ǰˮλ��"+c.water);
	    c.outlet();
	    System.out.println("��ǰˮλ��"+c.water);
	    
	    
	    TestClassTutorial_Static.staticMethod();
	    
	    
	}

}
