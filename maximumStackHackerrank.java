import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Stack<Long> l=new Stack<Long>();
        Stack<Long> max=new Stack<Long>();
        while(t>0){
            long a=sc.nextLong();
            if(a==1) {
                long val=sc.nextLong();
                l.push(val);
                if(max.isEmpty()){
                    max.push(val);
                }
                else{
                    if(max.peek()<=val){
                        max.push(val);
                    }
                }
            }
            else if(a==2) {
                long b=l.pop();
                if(max.peek()==b) max.pop();    
            }
            else if(a==3) System.out.println(max.peek());
            t--;
        }
    }
}