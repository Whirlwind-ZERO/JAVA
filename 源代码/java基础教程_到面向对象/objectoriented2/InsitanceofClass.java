package objectoriented2;


//������� instanceof �������� �ӿ�����

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

public class InsitanceofClass {

	public static void main(String[] args) {
		C c=new C();
		
		System.out.println(c instanceof A);

	}

}
