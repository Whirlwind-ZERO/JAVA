package objectoriented2;
/*����������
 * 1.��������ͬ������������ͬ��
 * 2.��������ͬ,����˳��ͬ
 * 3.��������ͬ,�������Ͳ�ͬ
 * 
 * ��̬:ͬһ�������ͷ���ִ�д���ͬ���
 * */

class Animal{
	void move() {
		
	}
}

class Fish extends Animal{
	void move() {
		System.out.println("��Ӿ");
	}
}

class Hawk extends Animal{
	void move() {
		System.out.println("����");
	}
}

public class MethodReload {
//	static int add(int a) {
//		return a;
//	}
//	
//	static int add(int a,int b) {
//		return a+b;
//	}
//	
//	static int add(int b,double a) {//�������Ͳ�ͬ
//		return (int)a+b;
//	}
//	
//	static int add(double b,int a) {
//		return (int)(a+b);
//	}
	
	public static void main(String[] args) {
		Animal Jack=new Fish();
		Jack.move();
	}
	

}
