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
            int l=s.length();
            ArrayList<Character> list=new ArrayList<>();
            for(int i=0;i<l;i++){
                if(i<l/2)list.add(s.charAt(i));
                else if(l%2!=0 && i==l/2) continue;
                else{
                    if(list.contains(s.charAt(i))) list.remove(new Character(s.charAt(i)));
                }
            }
            if(list.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}