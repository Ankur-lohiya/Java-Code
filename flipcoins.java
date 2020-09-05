import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int g=sc.nextInt();
		    while(g!=0){
		        int i=sc.nextInt(),n=sc.nextInt(),q=sc.nextInt();
		        if(i==q) System.out.println(n/2);
		        else System.out.println(n-n/2);
		        g--;
		    }
		    t--;
		}
	}
}
