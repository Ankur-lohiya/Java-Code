import java.util.*;
class longestConsecutive{
	public static int consecutive(int nums[]){
		Arrays.sort(nums);
        int max=1,count=1;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]) count++;
            else if(nums[i]==nums[i+1]) count=count;
            else count=1;
            if(max<count) max=count;
        }
        return max;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int nums[]=new int[a];
		for(int i=0;i<a;i++)nums[i]=sc.nextInt();
		System.out.print(consecutive(nums));
	}
}