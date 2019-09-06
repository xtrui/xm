package cn.xtrui.mbp.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*100);
        }
        quickSort(arr,0,arr.length-1);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }


    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int target = arr[(left + right) / 2];
        int temp = 0;

        while (l < r) {
            while (arr[l] < target) {
                l++;
            }
            while (arr[r] > target) {
                r--;
            }
            if(l>=r){
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if(arr[l]==target){
                r--;
            }
            if(arr[r]==target){
                l++;
            }

        }
        if(l==r){
            l+=1;
            r-=1;
        }

        if(left<r){
            quickSort(arr,left,r);
        }
        if(right>l) {
            quickSort(arr, l, right);
        }

    }
}



