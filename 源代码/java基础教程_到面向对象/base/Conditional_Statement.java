package base;
/*
 * if�������
 * if 
 * if else
 * if 
 * else if
 * 
 * switch���
 * switch(�����жϵĲ���){ ���������� ö�� �ַ���
 * case �������ʽ1:���1��[break;]
 * case �������ʽ2:���2��[break;]
 * case �������ʽn:���n��[break;]
 * [default]:���n+1;[break;]
 * }
 * 
 * ѭ�����
 * while(�������ʽ){
 * ���
 * }
 * 
 * do{
 * }while(�������ʽ)
 * 
 * for(��ʼ�����ʽ1;�������ʽ;���ʽ){}
 * 
 * ѭ������
 * continue;
 * break;
 * */
public class Conditional_Statement {
	public static void main(String arg[]) {
		int grade=10;
		switch(grade) {
		case 10:
		case 9:System.out.println("�ɼ�Ϊ����");break;
		case 8:System.out.println("�ɼ�Ϊ��");break;
		case 7:
		case 6:System.out.println("�ɼ�Ϊ��");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:System.out.println("�ɼ�Ϊ��");break;
		default:System.out.println("�ɼ�Ϊ��Ч");break;
		}
	
}

}
