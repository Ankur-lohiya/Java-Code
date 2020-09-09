import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0){
		       String s=sc.nextLine();
		       Stack<Character> s1=new Stack<>();
		       long c=0,flag=0;
		       for(int i=0;i<s.length();i++){
		           if(s.charAt(i)=='>'){
		               if(s1.isEmpty()) break;
		               else{
		                   s1.pop();
		                   if(s1.isEmpty()) c=i+1;
		               }
		           }
		           else {
		               s1.push(s.charAt(i));
		           }
		       }
		       System.out.println(c);
		}
	}
}