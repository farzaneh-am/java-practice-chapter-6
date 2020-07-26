package chapter6;

public class example2_this {
	public void print_m() {
		System.out.println("Hello M");
	}
public void print_n() {
	System.out.println("Hello N");
	this.print_m();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example2_this a=new example2_this();
		a.print_n();

	}

}
