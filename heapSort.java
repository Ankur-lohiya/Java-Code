// Creation of MinHeap to sort descending
import java.util.*;
class HeapSort{
	int heap[],maxsize,size;
	public HeapSort(int n){
		heap=new int[n];
		maxsize=n;
		size=0;
	}
	public void insert(int a){
		if(size>=maxsize) return;
		heap[size]=a;
		int cur=size;
		while(heap[cur]>heap[(cur-1)/2]){
			int temp=heap[cur];
			heap[cur]=heap[(cur-1)/2];
			heap[(cur-1)/2]=temp;
			cur=(cur-1)/2;
		}
		size++;
	}
	public void heapify(int pos){
		if(2*pos+1<=size && 2*pos+2<=size){
			if(heap[pos]<heap[2*pos+1] || heap[pos]<heap[2*pos+2]){
				if(heap[2*pos+1]>heap[2*pos+2]){
					int temp=heap[2*pos+1];
					heap[2*pos+1]=heap[pos];
					heap[pos]=temp;
					heapify(2*pos+1);
				}
				else{
					int temp=heap[2*pos+2];
					heap[2*pos+2]=heap[pos];
					heap[pos]=temp;
					heapify(2*pos+2);	
				}
			}
		}
	}
	public void remove(){
		int popped=heap[0];
		heap[0]=heap[--size];
		heapify(0);
		heap[size]=popped;
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		HeapSort h=new HeapSort(n);
		for(int i=0;i<n;i++) h.insert(sc.nextInt());
		for(int i=0;i<n;i++) h.remove();
		for(int i=0;i<n;i++) System.out.print(h.heap[i]+" ");
		// System.out.println(h.size);
	}
}