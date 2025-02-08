package stringbuilder;

import java.lang.String;
import java.util.Scanner;

//Creating class StringReverseUsingStringBuilder to reverse string
public class StringReverseUsingStringBuilder {

    //Main Method
    public static void main(String[] args) {

        //Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        //Creating variable string to take user input
        String string = sc.nextLine();

        //Calling reverseString method to reverse String and Store in a variable
        String reversedString = reverseString(string);

        //Display result
        System.out.println("Reversed String : "+reversedString);
    }

    //reverseString Method to Reverse A string using String builder
    public static String reverseString(String string){

        //Creating StringBuilder
        StringBuilder str = new StringBuilder(string);

        //Using String Builder's reverse method to reverse StringBuilder
        str.reverse();

        //Return String by converting Sting builder to string using toString Method
        return str.toString();
    }
}


