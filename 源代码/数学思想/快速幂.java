package ��ѧ˼��;

public class ������ {
	static int mod=1000000;
	
	public static int qmi(int a, int b){ //�� a^b
		int res = 1; // res������
		while(b != 0){
			if((b & 1) == 1){ //���k�Ķ������������һλ�� 1�� ����1011 & 1 = 1
				res = (res * a) % mod;//ȡģ�� ��ֹ��������
			}
			a = a * a % mod;//�õ� a^1, a^2, a^4, a^8, .....
			b = b >> 1; //��b����һλ��ȥ�����λ��Ϊ�˿�ʼ�ж���һλ��
		}
		return res;
	}


	public static void main(String[] args) {
		

	}

}
