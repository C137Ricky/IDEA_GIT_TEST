package sort;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         int []nums=new int[5];
         Scanner in=new Scanner(System.in);
         for(int i=0;i<nums.length;i++){
             nums[i]=in.nextInt();
         }
         MergeSort(nums,0,nums.length-1);
         for(int i=0;i<nums.length;i++) {
             System.out.print(nums[i]);
         }
    }
    private static void MergeSort(int[]nums,int start,int end){
          if(start<end) {
              int mid = (end - start) / 2 + start;
              MergeSort(nums,start,mid);
              MergeSort(nums,mid+1,end);
              merge(nums,start,mid,end);
          }
        }
    private  static  void merge(int []nums,int start,int mid,int end){
        int []temp=new int[end-start+1];
        int left=start,right=mid+1;
        int k=0;
        while(left<=mid&&right<=end){
            if(nums[left]<=nums[right]){temp[k++]=nums[left++];}
            else{temp[k++]=nums[right++];}
        }
        while(left<=mid){temp[k++]=nums[left++];}
        while (right<=end){temp[k++]=nums[right++];}
        for(int i=0;i<temp.length;i++){
            nums[start+i]=temp[i];
        }
    }

}
