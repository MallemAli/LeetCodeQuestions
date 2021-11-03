class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentMax=0, workingMax=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                workingMax++;
                if(workingMax>currentMax){
                    currentMax = workingMax;
                }
            } else {
                workingMax = 0;
            }
        }
        return currentMax;
    }
}
