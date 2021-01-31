package ObjectOriented;
//��װ��-Integer
/*
 * ��������->��װ��->����
 * 
 * Byte->byte       Float->float
 * Short->short     Double->double
 * Integer->Integer Boolean->boolean
 * Long->long       Character->char
 * 
 * Integer(int number)
 * Integer(String str)
 * */
public class IntegerClass {
	public static void main(String[] args) {
		System.out.println("int�����ֵ:"+Integer.MAX_VALUE);
		System.out.println("��Сֵ"+Integer.MIN_VALUE);
		System.out.println("int���͵ĳ���"+Integer.SIZE);
		System.out.println("int����"+Integer.TYPE);
		
		System.out.println("--------------");
		
		Integer inte1=new Integer(123);
		System.out.println(inte1);
		Integer inte2=new Integer("12345");
		System.out.println(inte2);
		Integer inte3=Integer.valueOf(123);//�����������ַ��������֣�������һ��int���ֶ���
		System.out.println(inte3+1);
		Integer inte4=Integer.valueOf("123");
		System.out.println(inte4+1);
		
		System.out.println("--------------");
		
		int num1=Integer.parseInt("12345");//תΪint
		System.out.println(num1+2);
		int num2=inte2.intValue();  //תΪint Ҳ��doubleValue...
		String str1=Integer.toBinaryString(11);
		System.out.println(str1);
		String str2=Integer.toHexString(11);
		System.out.println(str2);
		String str3=Integer.toOctalString(11);
		System.out.println(str3);
		String str4=Integer.toString(2);//ת����String
		System.out.println(str4+1);
		String str5=Integer.toString(11, 16);//תΪ16����
		System.out.println(str5);
		
		System.out.println("--------------");
		
		Integer a=13;//
		System.out.println(a);
		
	}

}
