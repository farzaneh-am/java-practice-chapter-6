package chapter6;
class Box5{
	double width,height,depth;
	//example by this    
 Box5(double w,double h,double d){
	this.width=w;
	this.height=h;
	this.depth=d;		
	}
double volom() {
	return width*height*depth;
}
}
public class Box_Parameterized_Constructors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 mybox1=new Box5(10,20,15);
		Box5 mybox2=new Box5(3,6,9);
		System.out.println("volom is:"+mybox1.volom());
		System.out.println("volom is:"+mybox2.volom());
	}
}
