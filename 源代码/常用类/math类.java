package ������;

public class math�� {

	public static void main(String[] args) {
		/*
		 * Math.min(int a, int b)
           Math.min(float a, float b)
           Math.min(double a, doubleb)
           Math.min(long a, long b)
           Math.max(int a, int b)
           Math.max(float a, float b)
           Math.max(double a, doubleb)
           Math.max(long a, long b)
		 * */
		
		Integer a=16;
		Double b=Math.sqrt(a);//��ƽ����
		Integer c=-16;
		Math.abs(c); //����һ������ֵ
		
		Math.pow(2,3);//����
		
		Double d=2.4523;
		//����ȡ��
		Math.ceil(d);
		//����ȡ��
		Math.floor(d);
		//��������ȡ��
		Math.round(d);
		
		//�õ�һ������� Math.random() ����һ��[0,1)֮���double���͵�α�����
		int ae = (int)(Math.random()*(b - a + 1) + a);  // + 1 ����Ϊrandom()���ȡ����1,��������ȡ����ͻ���1. 
				
		//�������Ǻ���		
	}

}
