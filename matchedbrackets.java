import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int a[]=new int[(int)n];
		int depth=0,max_depth=0,index=-1,count=0,max_length=0,index1=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(a[i]==1) {
		        depth++;
		        index=depth>max_depth?i:index;
		        count++;
		    }
		    if(a[i]==2) {
		        depth--;
		        count++;
		    }
		    if(depth==0){
		        int d=max_length;
		        max_length=max_length>count?max_length:count;
                if(d<max_length){
                    index1=i-max_length+2;
                }
		        count=0;
		    }
		    max_depth=max_depth>depth?max_depth:depth;
		}
		System.out.println(max_depth+" "+(index+1)+" "+max_length+" "+index1);
	}
}