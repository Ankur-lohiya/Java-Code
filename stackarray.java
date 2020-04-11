import java.util.*;
class stackarray{
	public int top;
	public int array[];
	public int size;
	public stackarray(int s){
		size=s;
		array=new int[size];
		top=0;
	}
	public void push(int d){
		if(top==size) System.out.println("overflow");
		else array[top++]=d;
	}
	public int pop(){
		if(top==0)  return -1;
		else return array[--top];
	}
	public static void main(String[] args){
		stackarray n=new stackarray(5);
		n.push(10);
		n.push(20);
		n.push(30);
		n.push(40);
		n.push(50);
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		// System.out.print(n.pop()+" ");
	}
}