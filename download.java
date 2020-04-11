import java.util.Scanner;
import java.lang.*;
class sorting<T extends Comparable>
{
    public T arr[];
    sorting(T a[]){
        this.arr=a;
    }
    public T[] get(){
        T temp;
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
            if(arr[i].compareTo(arr[j])>0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;             
            }
        }
    }
    return arr;
}
}


class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Integer a[]=new Integer[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sorting<Integer> s1=new <Integer>sorting(a);
        a=s1.get();
        for(int i:a){
            System.out.println(a[i]);
        }
    }
    }