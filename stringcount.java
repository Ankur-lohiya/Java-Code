import java.util.*;
import java.lang.String.*;
class wordrev{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int lcount=0,ncount=0,scount=0,ocount=0;
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) lcount++;
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') ncount++;
			else if(s.charAt(i)==' ') scount++;
			else ocount++;
		}
		System.out.println("letter: "+lcount);
		System.out.println("number: "+ncount);
		System.out.println("spaces: "+scount);
		System.out.println("other: "+ocount);
	}
}