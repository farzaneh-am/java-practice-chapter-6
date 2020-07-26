package chapter6;

public class example_this {
int a,b;
public void setDate(int a,int b) {
	this.a=a;
	this.b=b;
	
}
public void showData() {
	System.out.println("value a="+a);
	System.out.println("value b="+b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example_this obj1=new example_this();
		example_this obj2=new example_this();
		obj1.setDate(2, 3);
		
		obj1.showData();
		obj2.setDate(4, 8);
		obj2.showData();

	}

}
