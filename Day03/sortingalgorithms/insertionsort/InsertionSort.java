package Day03.sortingalgorithms.insertionsort;

import java.util.Scanner;

public class InsertionSort {

    // Method to perform insertion sort on an array of employee IDs
    public static int[] insertionSort(int [] employeesId){

        // Start from the second element (index 1) since the first element is trivially sorted
        for (int i=1; i<=employeesId.length-1 ; i++){
            int j=i;

            // Shift elements to the right to make space for the Swapping element
            while(j>0 && employeesId[j]<=employeesId[j-1]){
                int temp = employeesId[j-1];
                employeesId[j-1] = employeesId[j];
                // Insert the key at the correct position
                employeesId[j]=temp;
                j--; //Decrementing by 1
            }
        }
        //Return array
        return employeesId;
    }


    public static void main(String[] args) {
        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Enter number of Employees and taking variable size
        System.out.println("Enter Number of total Employees : ");
        int size = sc.nextInt();

        //Creating an array of size to store Employees id
        int [] employeesId = new int[size];
        System.out.println("Enter Employees Id ");

        //iterating to its size to take input from user
        for(int i=0; i<size ;i++){
            employeesId[i]=sc.nextInt();
        }

        //Creating an sortedScores array to store sorted employees by calling method InsertionSort
        int [] sortedId = insertionSort(employeesId);

        //Printing Sorted scores
        System.out.println("Sorted Order of employees Id ");
        for(int i=0; i<size ;i++) {
            System.out.print(sortedId[i]+" ");
        }
    }
}
