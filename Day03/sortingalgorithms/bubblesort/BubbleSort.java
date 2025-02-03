package Day03.sortingalgorithms.bubblesort;

import java.util.Scanner;

public class BubbleSort {

    //Creating Method bubbleSort to sort Students marks
    public static int[] bubbleSort(int [] studentMarks){

        //Iteration from the last index to the second index because at last automatically we found first sorted element
        for (int i = studentMarks.length-1 ; i>=1 ;i--){
            int didSwap = 0;

            //iteration from first index to the last second index
            for (int j=0 ; j<=i-1 ; j++){

                //Checks if the element is greater than the next element
                if(studentMarks[j] >= studentMarks[j+1]){

                    //Swap number if the condition is correct
                    int temp = studentMarks[j+1];
                    studentMarks[j+1] = studentMarks[j];
                    studentMarks[j] = temp;
                    didSwap++;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        //Return sorted marks
        return studentMarks;
    }

    //Main method
    public static void main(String[] args) {
        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Enter Number of students and taking variable size
        System.out.println("Enter Number of total students : ");
        int size = sc.nextInt();

        //Creating an array of size to store students marks
        int [] studentMarks = new int[size];
        System.out.println("Enter Marks of Students ");

        //iterating to its size to take input from user
        for(int i=0; i<size ;i++){
            studentMarks[i]=sc.nextInt();
        }

        //Creating an sortedScores array to store sorted student marks by calling method Bubble sort
        int [] sortedMarks = bubbleSort(studentMarks);

        //Printing Sorted scores
        System.out.println("Sorted Student Marks");
        for(int i=0; i<size ;i++) {
            System.out.print(sortedMarks[i]+" ");
        }
    }
}
