class Solution {
    public static void merge(int[] nums,int si,int mid,int end){
        int temp[]=new int[end-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<= mid && j<=end){
            if(nums[i] < nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j <= end){
            temp[k++]=nums[j++];
        }
        for(int x=0;x<temp.length;x++){
            nums[si+x]=temp[x];
        }
    }
    public static void mergeSort(int nums[],int si,int end){
        if(si >= end){
            return;
        }
        int mid=si+(end-si)/2;
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,si,mid,end);
    }
    public int[] sortArray(int[] nums) {

        mergeSort( nums,0,nums.length-1);
        return nums;

    }
}