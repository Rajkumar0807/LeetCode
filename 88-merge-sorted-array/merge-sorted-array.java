class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;
        for(int i=0;i<m;i++){
           nums1[i]=nums1[i];l++;
        }
        for(int i=0;i<n;i++){
            nums1[l]=nums2[i];
            l++;
        }
        Arrays.sort(nums1);

    }
}