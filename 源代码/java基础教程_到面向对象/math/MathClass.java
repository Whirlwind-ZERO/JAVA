package math;
/*
 * java.lang.Math �Զ����� �ṩ�Ķ��Ǿ�̬����
 * */
public class MathClass {

	public static void main(String[] args) {
		System.out.println("Բ���ʦ�"+Math.PI);
		//���Ǻ���
		System.out.println("90������"+Math.sin(Math.PI/2));
		System.out.println("0������ֵ"+Math.cos(0));
		
		//ָ������
		System.out.println("e��ƽ��ֵ"+Math.exp(2));
		System.out.println("��eΪ�׵�2�Ķ���ֵ"+Math.log(2));
		
		System.out.println("4��ƽ����"+Math.sqrt(4));
		System.out.println("8��������"+Math.cbrt(8));
		
		System.out.println("2��5�η�"+Math.pow(2, 5));
		
		//�Ƚ�����
		System.out.println("4��8���"+Math.max(4, 8));
		System.out.println("4��8��С����"+Math.min(4, 8));
		System.out.println("����ֵ"+Math.abs(-7));
		
		//��������
		System.out.println(Math.floor(11.1));
		System.out.println(Math.round(11.2));
		
		

	}

}
