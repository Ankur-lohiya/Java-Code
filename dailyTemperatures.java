class Solution {
    public int[] dailyTemperatures(int[] T) {
        for(int i=0;i<T.length;i++){
            int flag=0;
            for(int j=i+1;j<T.length;j++){
                if(T[i]<T[j]) {
                    T[i]=j-i;
                    flag=1;
                    break;
                }
            }
            if(flag==0) T[i]=0;
        }
        return T;
    }
}