import java.util.*;
class seriesSum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=n+(n*10+n)+(n*100+n*10+n);
		System.out.println(sum);		
	}
}