package objectoriented2;

public class Person {
	String name;//String�е�equal�ȵ�������
	String id;
	
	public Person(String name,String id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {//alt��/ֱ����д
	    Person p=(Person)obj;
	    boolean b1=this.name.equals(p.name);
	    boolean b2=this.id.equals(p.id);
		return b1&&b2;
	}

}
