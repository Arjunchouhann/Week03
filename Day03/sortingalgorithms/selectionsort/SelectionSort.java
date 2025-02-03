package Day03.sortingalgorithms.selectionsort;

import java.util.Scanner;

public class SelectionSort {

    //Method to use selection sort to sort an array
    public static int[] selectionSort(int [] examScores){

        //Iterate through whole array to find minimum element
        for(int i=0; i<=examScores.length-2;i++){

            //Takes minimum element as the index of array
            int mini = i;

            //iterate from ith index to its length-1
            for(int j=i; j<=examScores.length-1;j++){

                //Checking if the mini is larger than the current element
                if(examScores[mini]>examScores[j]) {
                    mini = j;
                }
            }

            //Swapping two numbers by using of third variable
            int temp = examScores[mini];
            examScores[mini]=examScores[i];
            examScores[i]=temp ;
        }
        //return array
        return examScores;
    }

    //Main method
    public static void main(String[] args) {
        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Enter Number of students and taking variable size
        System.out.println("Enter Number of total students : ");
        int size = sc.nextInt();

        //Creating an array of size to store exam scores
        int [] examScores = new int[size];
        System.out.println("Enter scores Students ");

        //iterating to its size to take input from user
        for(int i=0; i<size ;i++){
            examScores[i]=sc.nextInt();
        }

        //Creating an sortedScores array to store sorted exam scores by calling method selectionSort
        int [] sortedScores = selectionSort(examScores);

        //Printing Sorted scores
        System.out.println("Sorted Student scores");
        for(int i=0; i<size ;i++) {
            System.out.print(sortedScores[i]+" ");
        }
    }
}

