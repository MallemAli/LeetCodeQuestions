class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, k = 0;
        
        if(nums.length>=1){
            k=1;
        }
        
        for(int j=1; j<nums.length; j++){
            if(nums.length==1){
                break;
            } else if(nums.length==0){
                break;
            }
            
            if(nums[i]==nums[j]){
                //increment j
            } else {
                nums[++i]=nums[j];
                k++;
            }
        }
        
        System.out.println("k = "+ k);
        return k;
    }
}
