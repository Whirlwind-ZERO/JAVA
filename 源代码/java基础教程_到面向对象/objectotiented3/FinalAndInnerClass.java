package objectotiented3;
/*
 * ���峣��:final static int i=3;
 * ����final��: final class ���ǲ��ܱ��̳�
 * ����final����: ���ǲ��ܱ���д
 * 
 * �ڲ���:
 * ��Ա�ڲ��� �ֲ��ڲ��� ��̬�ڲ��� �����ڲ���
 * */
public class FinalAndInnerClass {
	innerClass in =new innerClass();
	
	
	
	class innerClass{//��Ա�ڲ���
		int y=0;
		public innerClass() {
			System.out.println("�����ڲ�����");
		}
		
		public void inf() {
			System.out.println("�ڲ��෽��");
		}
	}
	
	public static void main(String[] args) {
		FinalAndInnerClass  d=new FinalAndInnerClass ();
		FinalAndInnerClass.innerClass in=d.new innerClass();
		d.in.inf();
	}
}

class NewClass extends FinalAndInnerClass.innerClass{
	public NewClass(FinalAndInnerClass d) {
		d.super();
	}
}
