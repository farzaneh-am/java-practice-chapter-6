package chapter6;
class Box1{
	double width,height,depth;
	public void volom() {
		System.out.print("volom is: ");
		System.out.println(width*height*depth);
	}
}
public class Box_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box1 mybox=new Box1();
mybox.width=10;
mybox.height=20;
mybox.depth=15;
Box1 mybox2=new Box1();
mybox2.height=3;
mybox2.width=6;
mybox2.depth=9;
mybox.volom();
mybox2.volom();

	}

}
