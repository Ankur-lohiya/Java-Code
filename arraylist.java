import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            li.add(sc.nextInt());
        }
        li.remove(2);
        li.set(4,5);
        int flag=0;
        if(li.contains(8)) System.out.println("Yes");
        else System.out.println("No");
        for(int i=0;i<5;i++){
            System.out.print(li.get(i)+" ");
        }
        Collections.reverse(li);
        Collections.sort(li);
        System.out.println(li);
    }
}