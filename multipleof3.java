import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		try{
			int t=sc.nextInt();
			while(t!=0){
				long k=sc.nextLong();
				int a=sc.nextInt(),b=sc.nextInt();
				long sum=a+b;
				long s=(k-3)%4;
				while(s+1!=0){
					sum+=sum%10;
					s--;
				}
				sum=sum+(((k-3)/4)%3)*20;
				System.out.println(sum);
				if(sum%3==0) System.out.println("YES");
				else System.out.println("NO");
				t--;
			}
		}
		catch(Exception e){return;}
	}
}