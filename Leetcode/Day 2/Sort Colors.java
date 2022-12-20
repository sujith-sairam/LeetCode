class Solution {
    public void sortColors(int[] nums) {
        int hi = nums.length-1,lo=0,mid=0,temp=0;
        while(mid<=hi){
            switch(nums[mid]){
                case 0:
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo ++;
                    mid ++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[hi];
                    nums[hi] = nums[mid];
                    nums[mid] = temp;
                    hi--;
                    break;
                    
    }
        }
    }
}