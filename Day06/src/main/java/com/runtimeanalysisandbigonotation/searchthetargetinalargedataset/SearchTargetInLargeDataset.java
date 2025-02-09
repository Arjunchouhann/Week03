package com.runtimeanalysisandbigonotation.searchthetargetinalargedataset;
import java.util.*;
public class SearchTargetInLargeDataset {

    //Creating an object of Random class
    private static Random random = new Random();

    // Method to generate a random array of specified size
    public static int[] generateRandomArray(int size) {
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            // Random integers
            data[i] = random.nextInt(size);
        }
        return data;
    }

    //Linear Searching method
    public static int linearSearch(int [] arr , int target){
        //Iterate to the length of array
        for(int i=0 ;i < arr.length ; i++){
            //checking if the element is equals to target
            if(arr[i]==target) {
                //Returning index
                return i;
            }
        }
        //If the element is not found in array and array is empty return -1
        return -1;
    }

    //Binary Searching method
    public static int binarySearch(int [] arr , int target , int left , int right){

        //iterate till the right is small then left
        while(left<=right){

            //Finding mid
            int mid = left +( right - left )/2;

            //Checking if the target is equal to mid-element
            if(arr[mid] == target){
                return mid;
            }

            //Checking if the target is larger than the mid-element
            else if(arr[mid] < target){
                //update left to mid+1
                left = mid+1;
            }

            //checking if the target is smaller than the mid-element
            else if(arr[mid] >target ){
                //Update right to mid-1
                right = mid-1;
            }
        }
        //if the array is empty or the target is not in array return -1
        return -1;
    }

    //Sorting the array method
    public static int [] sortData(int [] arr){

        //Using built-in method
        Arrays.sort(arr);

        //Return sorted array
        return arr;
    }
}

