package com.linearsearch;

//Class SearchForFirstNegativeNumber
public class SearchForFirstNegativeNumber {

    //Method linearSearchingForNegative for searching first negative number in given array
    public static int linearSearchingForNegative(int [] arr){

        //Length of array stored in variable n
        int n= arr.length;

        //iterate till the array length
        for (int i=0; i<n ; i++){

            //Condition check if the number is negative
            if(arr[i]<0){

                //return from here if we find negative
                return i;
            }
        }
        //return -1 when the array contains all positives
        return -1;
    }

    //Main method
    public static void main(String[] args) {

        //Array initialization and assigning values
        int [] array = { 0,4,6,43,234,5,3,2,-1,3,5,3,};

        //printing result
        System.out.println("Index of the first negative number is : "+linearSearchingForNegative(array));
    }
}
