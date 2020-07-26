package chapter6;
class Box6 {
	double width;
	double height;
	double depth;
    Box6(double width, double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double volom() {
		return width*height*depth;
	}
}

public class Box_by_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box6 mybox1=new Box6(10,20,15);
		Box6 mybox2=new Box6(9,6,3);
		System.out.println("volom is "+mybox1.volom());
		System.out.println("volom is "+mybox2.volom());
	}

}
