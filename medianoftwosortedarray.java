class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++) l.add(nums1[i]);
        for(int i=0;i<nums2.length;i++) l.add(nums2[i]);
        Collections.sort(l);
        if( l.size()%2==0) return (l.get((l.size()-1)/2)+l.get(((l.size()-1)/2)+1))/2.0;
        else return l.get((l.size()-1)/2);
    }
}