package chapter6;
class Box3{
	double width,heigh,depth;
	public void setDim(double x,double y,double z) {
		width=x;
		heigh=y;
		depth=z;
	}
	double volom() {
		return width*heigh*depth;
		
	}
}
public class Box_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3 mybox1=new Box3();
		Box3 mybox2=new Box3();
		mybox1.setDim(10,20, 15);
		mybox2.setDim(3, 6, 9);
		System.out.println("volom is:"+mybox1.volom());
		System.out.println("volom is:"+mybox2.volom());
		
		
		

	}

}
