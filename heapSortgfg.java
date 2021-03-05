import java.util.*;
class Heap_Sort{
    void printArray(int arr[],int n){
        //int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            Solution ob=new Solution();
            ob.heapSort(arr,n);
            hs.printArray(arr,n);
            T--;
        }
    }
}
class Solution{
    void buildHeap(int arr[], int n){
        // Your code here
    }
    void heapify(int heap[], int size, int pos){
        if(2*pos+1<=size && 2*pos+2<=size){
            if(heap[pos]<heap[2*pos+1] || heap[pos]<heap[2*pos+2]){
                if(heap[2*pos+1]>heap[2*pos+2]){
                    int temp=heap[2*pos+1];
                    heap[2*pos+1]=heap[pos];
                    heap[pos]=temp;
                    heapify(heap,size,2*pos+1);
                }
                else{
                    int temp=heap[2*pos+2];
                    heap[2*pos+2]=heap[pos];
                    heap[pos]=temp;
                    heapify(heap,size,2*pos+2);   
                }
            }
        }
    }
    public void heapSort(int arr[], int n){
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);
        for(int i=n-1;i>0;i--){
            int popped=arr[0];
            arr[0]=arr[i];
            heapify(arr,i,0);
            arr[i]=popped;
        } 
    }
 }
 
 