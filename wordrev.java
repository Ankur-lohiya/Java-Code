import java.util.*;
import java.lang.String.*;
class wordrev{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" "),s3="";
		for(int i=0;i<s1.length;i++){
			for(int j=s1[i].length()-1;j>=0;j--){
				s3=s3+s1[i].charAt(j);
			}
			if(i!=s1.length-1) s3=s3+" ";
		}
		System.out.println(s3);
	}
}