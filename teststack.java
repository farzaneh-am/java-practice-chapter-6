package chapter6;
class stack{
	int stck[]=new int[10];
	int tos;
	stack() {
		tos=-1;
		}
public void push(int item) {
	if(tos==9)
		System.out.println("stack is full");
	else
		stck[++tos]=item;
}
	int pop() {
		if(tos<0) {
			System.out.println("stack is underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}
public class teststack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack mystack1=new stack();
		stack mystack2=new stack();
		for(int i=0;i<10;i++)
			mystack1.push(i);
		for(int i=10;i<20;i++)
			mystack2.push(i);
		System.out.println("stack in mystack1:");
		for(int i=0;i<10;i++)
			System.out.println(mystack1.pop());
		for(int i=0;i<10;i++)
			System.out.println(mystack2.pop());

	}

}
