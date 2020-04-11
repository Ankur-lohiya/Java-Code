import java.util.*;
class sumofdigits {
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong(),sum=0;
    for(;n!=0;n=n/10){
        long j=n%10;
        sum=sum+j;
    }
    System.out.println(sum);
	}
}