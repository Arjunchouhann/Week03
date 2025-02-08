package stringbuffer;

public class ComparingStringBuilderAndStringBuffer {
    //method to calculate performance of StringBuilder
    public static long measureStringBuilderPerformance(int n, String str) {
        //initialize startTime and endTime
        long startTime, endTime;

        //testing StringBuilder performance
        startTime = System.nanoTime();
        //create StringBuilder object
        StringBuilder stringBuilder = new StringBuilder(str);
        //run loop to concatenate the string n times and append it to stringBuilder
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        endTime = System.nanoTime();
        //calculate the total duration
        return endTime - startTime;
    }
    //method to calculate performance of StringBuffer
    public static long measureStringBufferPerformance(int n, String str) {
        //initialize start time and end time
        long startTime, endTime;
        //Testing StringBuffer performance
        startTime= System.nanoTime();
        //create StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();
        //run loop to concatenate the string n times and append it to stringBuffer
        for(int i=0;i<n;i++){
            stringBuffer.append(str);
        }
        endTime= System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        //number of times the string will be concatenated
        int n= 1000000;
        //string to be concatenated
        String str= "hello";

        long stringBuilderDuration = measureStringBuilderPerformance(n, str);
        long stringBufferDuration = measureStringBufferPerformance(n, str);

        System.out.println("Time taken by StringBuilder: " + stringBuilderDuration + " nanoseconds");
        System.out.println("Time taken by StringBuffer: " + stringBufferDuration + " nanoseconds");
    }
}