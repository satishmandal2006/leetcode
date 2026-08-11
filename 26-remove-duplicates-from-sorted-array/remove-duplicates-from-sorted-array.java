class Solution {
    public int removeDuplicates(int[] arr) {
        int k=0;
        for(int i=1;i<arr.length;i++){
            if(arr[k] != arr[i]){
                k++;
                arr[k]=arr[i];
            }
        }
        return k+1;
    }
}