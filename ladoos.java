import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t!=0){
		    String s=sc.nextLine();
		    int a=Integer.parseInt(s.split(" ")[0]);
		    s=s.split(" ")[1];
		    int point=0;
		    if(s=="INDIAN") point=200;
		    else point=400;
		    int laddu=0;
		    while(a!=0){
		        String s1=sc.nextLine();
		        System.out.println(s1.split(" ")[0]);
		        if(s1.split(" ")[0]=="CONTEST_WON") laddu+=300+(Integer.parseInt(s1.split(" ")[1])<20?20-Integer.parseInt(s1.split(" ")[1]):0);
		        else if(s1.split(" ")[0]=="TOP_CONTRIBUTOR") laddu+=300;
		        else if(s1.split(" ")[0]=="BUG_FOUND") laddu+=Integer.parseInt(s1.split("")[1]);
		        else if(s1.split(" ")[0]=="CONTEST_HOSTED") laddu+=50;
		        a--;
		    }
		    System.out.println(laddu);
		    t--;
		}
	}
}
