import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),a[];
        long n,k,count=0,max=0;
        while(t--!=0){
            n=sc.nextLong();
            k=sc.nextLong();
            a=new int[(int)n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            if(k>n) System.out.println(n);
            else{
                for(int i=1;i<=k;i++){
                    for(int j=0;j<n;j++){
                        if(a[j]==i) count=0;
                        else{
                            count++;
                            max=max>count?max:count;
                        }
                    }
                    if(count==n) break;
                    count=0;
                }
            System.out.println(max);
            }
        }
    }
}