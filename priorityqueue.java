import java.util.*;
class PriorityQueue{
	static int a[]=new int[100];
	static int ncount=0;
	public static void insert(int data){
		if(ncount==0) a[ncount++]=data;
		else{
			int j;
			for(j=ncount-1;j>=0;j--){
				if(data>a[j]) a[j+1]=a[j];
				else break;
			}
			a[j+1]=data;
			ncount++;
		}
	}
	public static void print(){
		int i=0;
		while(i<ncount){
			System.out.print(a[i]);
			i++;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			insert(sc.nextInt());
			n--;
		}
		print();
	}
}