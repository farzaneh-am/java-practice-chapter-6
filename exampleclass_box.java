package chapter6;
class Box{
	
	double width,height,depth;
	}
public class exampleclass_box {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double vol;		
Box mybox1 = new Box();
mybox1.width=10;
mybox1.height=20;
mybox1.depth=15;

Box mybox2=new Box();
mybox2.width=3;
mybox2.height=6;
mybox2.depth=9;

vol=mybox1.height*mybox1.depth*mybox1.width;
System.out.println("volom is="+vol);
vol=mybox2.height*mybox2.width*mybox2.depth;
System.out.println("volom is="+vol);

	}

}
