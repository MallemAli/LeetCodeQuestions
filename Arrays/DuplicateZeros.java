class Solution {
    public void duplicateZeros(int[] arr) {
        
        int possibleDuplicates = 0;
        int length = arr.length - 1;
        
        for(int left=0; left<=length-possibleDuplicates; left++){
            if(arr[left]==0){
                if(left == length-possibleDuplicates){
                    arr[length]=0;
                    length-=1;
                    break;
                }
            possibleDuplicates++;
            }
        }
        
        int last = length - possibleDuplicates; 
        
        for(int i=last; i>=0; i--){
            if(arr[i]==0){
                arr[i+possibleDuplicates]=0;
                possibleDuplicates--;
                arr[i+possibleDuplicates]=0;
            } else {
                arr[i+possibleDuplicates] = arr[i];
            }
        }
        
    }
}
