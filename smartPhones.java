import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int a[]=new int[(int)n];
		for(long i=0;i<n;i++)a[(int)i]=sc.nextInt();
		long max=Integer.MIN_VALUE;
		Arrays.sort(a);
		for(long i=0;i<n;i++){
		    max=Math.max(max,a[(int)i]*(n-i));
		}
		System.out.println(max);
	}
}
