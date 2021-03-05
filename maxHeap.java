import java.util.*;
class MaxHeap{
	int heap[],size,maxsize;
	final int front=0;
	public MaxHeap(int maxsize){
		heap=new int[maxsize];
		this.maxsize=maxsize;
		size=0;
	}
	public void insert(int a){
		if(size>=maxsize) return;
		heap[size++]=a;
		int current=size-1;
		while(heap[current]>heap[(current-1)/2]){
			int temp=heap[current];
			heap[current]=heap[(current-1)/2];
			heap[(current-1)/2]=temp;
			current=(current-1)/2;
		}
	}
	public void minHeapify(int pos){
		if(2*pos+1<size && 2*pos+2<size){
			if(heap[pos]<heap[2*pos+1] || heap[pos]<heap[2*pos+2]){
				if(heap[2*pos+1]>heap[2*pos+2]){
					int temp=heap[2*pos+1];
					heap[2*pos+1]=heap[pos];
					heap[pos]=temp;
					minHeapify(2*pos+1);
				}
				else{
					int temp=heap[2*pos+2];
					heap[2*pos+2]=heap[pos];
					heap[pos]=temp;
					minHeapify(2*pos+2);	
				}
			}
		}
	}
	public void print(){
		// for(int i=0;i<=(size-2)/2;i++){
		// 	if(2*i+2<=size-2) System.out.println(heap[i]+" "+heap[2*i+1]+" "+heap[2*i+2]);
		// 	else System.out.println(heap[i]+" "+heap[2*i+1]);
		// }
		for(int i=0;i<size;i++) System.out.print(heap[i]+" ");
	}
	public int getMax(){
		return heap[front];
	}
	public int remove(){
		if(size<=0) return -1;
		int popped=heap[front];
		heap[front]=heap[--size];
		minHeapify(front);
		return popped;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MaxHeap m=new MaxHeap(n);
		for(int i=0;i<n;i++) m.insert(sc.nextInt());
		m.print();
		System.out.println(m.getMax());
		System.out.println(m.remove());
		m.print();
	}
}