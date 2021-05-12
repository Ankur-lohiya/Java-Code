import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),missing=n-1;
		for(int i=0;i<n-1;i++) {
			missing^=i^sc.nextInt();
		}
		System.out.println(missing);
	}

}
