class Solution {
    public int removeElement(int[] nums, int val) {
    /*  Approach 1
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
    */    
    
        
    //Approach 2;  when the element to remove is rare, this is more efficient   
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;    
    }
}
