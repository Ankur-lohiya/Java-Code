import java.util.*;
import java.lang.*;
class sort <T extends Comparable>{
    public T a[];
    public sort(T arr[]){
        a=arr;
    }
    public T[] sorting(){
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(a[i].compareTo(a[j])>0){
                    T temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer a[]=new Integer[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        sort<Integer> t1=new <Integer>sort(a);
        Integer a1[]=t1.sorting();
        for(int i=0;i<5;i++) System.out.println(a1[i]);
    }
}