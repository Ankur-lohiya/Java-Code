import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t--!=0){
		    long c=sc.nextLong(),count=0,a=c;
		    while(a!=0){
		        count++;
		        a=a>>1;
		    }
		    long A=((long)Math.pow(2,count-1))-1;
		    long B=A^c;
		    System.out.println(A*B);
		}
	}
}
