package objectoriented2;

public class Pad extends Computer{//����
	void Use() {//������д
		System.out.println("����");
	}
	
	/*super.property
	 * super.method();
	 * 
	 * */
	
	void startUp() {
		super.startUp();
		System.out.println("ƽ���Ѿ�����");
	}

}
