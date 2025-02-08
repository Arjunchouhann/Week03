package stringbuffer;

public class ConcatenateStringsEffectivelyUsingStringBuffer {
    //Main Method
    public static void main(String[] args) {
        //Given String
        String [] string = {"Welcome","to","CodeXperience"};

        //Displaying Result
        System.out.println("Concatenated String : "+ concatenatedString(string));

    }

    //ConcatenatedString method to concatenate String by using String Buffer
    public static String concatenatedString(String[] str){

        //Creating StringBuffer empty
        StringBuffer stringBuffer = new StringBuffer();

        //Iterate till String Array Length
        for (int i=0;i<str.length;i++){

            //Append every element in array
            stringBuffer.append(str[i]);
            stringBuffer.append(" ");
        }
        //Return StringBuffer toString Conversion
        return stringBuffer.toString();
    }

}
