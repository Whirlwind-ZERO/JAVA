package objectotiented3;
//�ֲ��ڲ���
public class InnerClass2 {
	public OutInterface inf(String x){
		class innerClass implements OutInterface{
			public innerClass(String s) {
				s=x;
				System.out.println(s);
			}
		}
		return new innerClass("�ֲ��ڲ���");
		
	}
	

	public static void main(String[] args) {
		InnerClass2 b=new InnerClass2();
		OutInterface a=b.inf("nice");

	}

}

interface OutInterface{
	
}


