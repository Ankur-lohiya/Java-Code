class Solution {
    public int maximumUnits(int[][] b, int truckSize) {
        
        int max=Integer.MIN_VALUE;
        int index=0;
        int sum=0;
        
        for(int i=0;i<b.length;i++){
            // max=Math.max(b[i][1],max);
            if(b[i][1]>=max){
                max=b[i][1];
                index=i;
            }
        }
         
        if(b[index][0]>=truckSize) return truckSize*b[index][1];
        else {
            sum += (b[index][0]*b[index][1]);
            truckSize-=b[index][0];
        }
        
                        System.out.println(sum+""+max+""+index);

        
        for(int i=0;i<b.length-1;i++){
            
            int min=Integer.MIN_VALUE;
                int maj_ind=index;                    // System.out.println(sum+""+max);

            for(int j=0;j<b.length;j++){
                
                int flag=0;
                if(max>=b[j][1] && min<=b[j][1]){
                               
                    if( max==b[j][1]){
                        if( j<maj_ind ){
                        min=b[j][1];
                        index=j;
                            // flag=1;
                    }
                    }
                    else{
                        min=b[j][1];
                        index=j;
                    }        
                                        System.out.println(sum+""+max+""+b[j][1]+""+min);


                    // System.out.println(index);
                }
                    

                
            }
            System.out.println(index);
                if(b[index][0]>=truckSize) return sum+(truckSize*b[index][1]);
                else {sum += b[index][0]*b[index][1];truckSize-=b[index][0];}
                max=min;
                        // System.out.println(sum);

        }
        return sum;
    }
}