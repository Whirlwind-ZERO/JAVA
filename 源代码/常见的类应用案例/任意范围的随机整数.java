package ��������Ӧ�ð���;

/*
 * Math.random()�������[0,1)֮���һ��double��
 * �а취�õ����ⷶΧ�ڵ���������������������
 * 
 * (int)(Math.random()*10)
 * 50+(int)(Math.random()*50)
 * a+Math.random()*b
 * */
public class ���ⷶΧ��������� {

	public static void main(String[] args) {
		//����[a,b]�������
		//a+random()*(b-a-1)
		int a=1;
		int b=100;
		int r=a+(int)(Math.random()*(b-a+1));
		System.out.println(r);

	}

}
