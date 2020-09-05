import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
    	while(t!=0){
    	    long n=sc.nextInt();
    	    int a[]=new int[(int)n];
    	    for(long i=0;i<n;i++) a[(int)i]=sc.nextInt();
    	    int count=1;
    	    for(long i=0;i<n-1;i++){
    	        if(a[(int)i]-a[(int)(i+1)]>=0)count++;
    	    }
    	    System.out.println(count);
    	    t--;
		}
	}
}

/*-----------------------------------------------------------------------------------------------*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		try{
    		int t=sc.nextInt();
        	while(t!=0){
        	    long n=sc.nextInt();
        	    int a[]=new int[(int)n];
        	    for(long i=0;i<n;i++) a[(int)i]=sc.nextInt();
        	    int count=0,min=Integer.MAX_VALUE;
        	    for(long i=0;i<n;i++){
        	        if(min-a[(int)(i)]>=0){
        	            count++;
        	            min=a[(int)i];
        	        }
        	    }
        	    System.out.println(count);
        	    t--;
    		}
		}
		catch(Exception e){return;}
	}
}