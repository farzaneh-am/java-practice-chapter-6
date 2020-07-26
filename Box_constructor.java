package chapter6;
class Box4{
	double width,heigh,depth;
	Box4(){
		System.out.println("Constructing Box");
		width=10;
		heigh=10;
		depth=10;
		
	}
	public double volom() {
	return width*heigh*depth;	
	}
	}
public class Box_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box4 mybox1=new Box4();
		Box4 mybox2=new Box4();
		System.out.println("volom is:"+mybox1.volom());
		System.out.println("volom is:"+mybox2.volom());
		

	}

}
