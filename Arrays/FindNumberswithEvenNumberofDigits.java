class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        
        for(int i=0;i<nums.length;i++){
            
            int digits = String.valueOf(nums[i]).length();
            
            if(digits%2==0){
                evenCount++;
            }
            
        }
        
        return evenCount; 
    }
}
