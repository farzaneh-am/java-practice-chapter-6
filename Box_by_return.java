package chapter6;
class Box2{
	double width,height,depth;
	public double volom2() {
		return width*height*depth;
	}
}
public class Box_by_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box2 mybox=new Box2();
mybox.height=10;
mybox.width=20;
mybox.depth=15;
Box2 mybox2=new Box2();
mybox2.height=3;
mybox2.width=6;
mybox2.depth=9;
System.out.println("volom is:"+mybox.volom2());
System.out.println("volom is:"+mybox2.volom2());
	}

}
