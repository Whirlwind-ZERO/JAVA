package ObjectOriented;
/*
 * Boolean��
 * Boolean(boolean value)
 * Boolean(String str)
 * 
 * */
public class BooleanClass {
	public static void main(String[] args) {
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		System.out.println("-----------------");
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(" ");//Ĭ��Ϊfalse
		
		Boolean b3=Boolean.valueOf(false);
		Boolean b4=Boolean.valueOf("true");//��Ϊtrue��Ϊtrue �����ַ�����Ϊfalse
		
		boolean boo1=Boolean.parseBoolean("ok");
		System.out.println(boo1);
	}

}
