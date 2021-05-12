import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    List<Integer> li=partitionLabels(s);
	    for(Integer i:li) System.out.print(i+" ");
	}
	public static List<Integer> partitionLabels(String s) {
        List<Integer> li=new ArrayList<>();
        int f=0,l=0,diff=0;
        for(int i=0;i<s.length();i++){
            f=Math.min(s.indexOf(s.charAt(i)),f);
            if(s.indexOf(s.charAt(i))>l){ li.add(diff); f=i;}
            l=Math.max(s.lastIndexOf(s.charAt(i)),l);
            diff=l-f+1;
        }
        li.add(diff);
        return li;
    }
}