class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>index[i]){
                for(int j=nums.length-1;j>=i;j--){
                    a[j]=a[j-1];
                }
            }
            a[index[i]]=nums[i];
        }
        return a;
    }
}