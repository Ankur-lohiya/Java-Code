import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		while(k!=0){
		    int l=sc.nextInt();
		    int u=sc.nextInt();
		    int b=sc.nextInt();
		    for(int i=l-1;i<=u-1;i++){
		        a[i]=a[i]+b;
		    }
		    k--;
		}
// 		for(int i=0;i<n;i++){
// 		    System.out.println(a[i]+" ");
// 		}
	    int max=a[0];
	    for(int i=1;i<n;i++){
	        if(max<a[i]) max=a[i];
	    }
	    System.out.println(max);
	}
}