class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        int index=0;
        for (int num : nums1){
            merge[index++] = num;
        }
          for (int num : nums2){
            merge[index++] = num;
        }
        
        Arrays.sort(merge);
        int mid = merge.length;
        if (mid % 2 == 1){
            return merge[mid/2];
        }else{
            return (float)(merge[mid/2]+merge[mid/2-1])/2f;
        }
     
    }
}