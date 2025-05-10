class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxSum =Integer.MIN_VALUE;
        int sum=0;

        while(j <nums.length)
        {
            sum +=nums[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                maxSum=Math.max(sum,maxSum);
               sum-=nums[i];
               i++;
               j++; 
            }
        }
        return (double)maxSum/k;
    }
}