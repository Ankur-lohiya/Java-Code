import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    long n=sc.nextInt(),goalA=0,goalB=0,i=0,a=0,b=0;
		    sc.nextLine();
		    String s=sc.nextLine();
            for(i=1;i<=2*n;i++){
                if(i%2==0){
                    if(s.charAt((int)i-1)=='1') goalB++;
                    a++;
                }
                else {
                    if(s.charAt((int)i-1)=='1') goalA++;
                    b++;
                }
                if(goalA>goalB+n-a || goalB>goalA+n-b) break;
            }
            System.out.println(a+b);
		    t--;
		}
	}
}