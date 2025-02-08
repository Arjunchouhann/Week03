package stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemoveUsingStringBuilder{
    //Main Method
    public static void main(String[] args) {

        //Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        //Creating variable string to take user input
        String string = sc.nextLine();

        //Calling duplicateRemover method and print Result
        System.out.println("Final String : "+ duplicateRemover(string));
    }

    //Duplicate Remover Method to remove duplicate
    public static String duplicateRemover(String str){

        //Creating an Empty Hashset
        HashSet<Character> set = new HashSet<>();

        //Creating an Empty StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        //Iterate till the String length
        for (int i=0; i<str.length(); i++ ){

            //Check if the set not contains the character
            if(!set.contains(str.charAt(i))){

                //If true add it in String Builder
                stringBuilder.append(str.charAt(i));
            }
            //Add in Set
            set.add(str.charAt(i));
        }
        //Returning StringBuilder by converting it into String using toString method
        return stringBuilder.toString();
    }
}
