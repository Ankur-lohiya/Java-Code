class Solution {
    public int trap(int[] height) {
        int water=0;
        for(int i=1;i<height.length-1;i++){
            int left=height[i];
            for(int j=0;j<i;j++) left=Math.max(left,height[j]);
            int right=height[i];
            for(int j=i+1;j<height.length;j++) right =Math.max(right,height[j]);
            water+=Math.min(left,right)-height[i];
        }
        return water;
    }
}
/*-----------------------------------------OR------------------------------------------------------*/

class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,ans=0,left_max=0,right_max=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=left_max)left_max=height[left];
                else ans+=left_max-height[left];
                ++left;
            }
            else{
                if(height[right]>=right_max)right_max=height[right];
                else ans+=right_max-height[right];
                --right;
            }
        }
        return ans;
    }
}