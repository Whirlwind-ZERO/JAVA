package objectoriented2;

/*
 * ֻ����һ������
 * */

public class Demo {
	@Override
	public String toString() {
		return "����Demo";
	}
	
	
  public static void main(String[] args) {
	  Computer cp=new Computer();
	  Pad ipad=new Pad();
	  ipad.startUp();
	  ipad.Use();
	  cp.Use();
      
  }
}
