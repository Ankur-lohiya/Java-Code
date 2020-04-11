import java.util.*;
class queuearray{
	public int top;
	public int rear;
	public int array[];
	public int size;
	public queuearray(int s){
		size=s;
		array=new int[size];
		top=-1;
		rear=-1;
	}
	public void push(int d){
		if(rear==size-1) System.out.println("overflow");
		else {array[++rear]=d;top=0;}
	}
	public int pop(){
		if(top>rear)  return -1;
		else return array[top++];
	}
	public static void main(String[] args){
		queuearray n=new queuearray(5);
		n.push(50);
		n.push(20);
		n.push(30);
		n.push(10);
		n.push(40);
		n.push(60);
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
	}
}