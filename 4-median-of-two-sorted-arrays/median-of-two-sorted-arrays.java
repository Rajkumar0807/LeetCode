class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] n=new int[nums1.length+nums2.length];int x=0;
        for(int i=0;i<nums1.length;i++){
            n[x]=nums1[i];
            x++;
        }
         for(int i=0;i<nums2.length;i++){
            n[x]=nums2[i];
            x++;
        }
        Arrays.sort(n);
        int mid=n.length/2;
        if(n.length%2==1){return n[mid];}
        else {return (double)(n[mid]+n[mid-1])/2;}

    }
}