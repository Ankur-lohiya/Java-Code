class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        String arr[]=new String[n];
        Arrays.fill(arr,"");
        String str=""; 
        int rows=0;
        boolean down=true;
        for(int i=0;i<s.length();i++){
            arr[rows]+=s.charAt(i);
            if(rows==n-1) down=false;
            else if(rows==0) down=true;
            if(down)rows++;
            else rows--;
        }
       for(int i=0;i<n;i++) str+=arr[i];
        return str;
    }
}