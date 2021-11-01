package com.nitincodes;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
	//
        int[] arr = {5,2,7,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        // loop will run until n-1 terms
        for(int i=0;i< arr.length;i++){
            // find the maximum item in the array in the array and swap it with correct index:
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int first, int second) {
        int max = first;
        for (int i = first;i<=second;i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
