package com.runtimeanalysisandbigonotation.largefilereadingefficiency;
import static com.runtimeanalysisandbigonotation.largefilereadingefficiency.LargeFileReading.*;
public class Main {
    public static void main(String[] args) {
        // Specify the file sizes to test
        long[] fileSizes = {1_000_000, 100_000_000};

        for (long size : fileSizes) {
            System.out.println("Reading file of size: " + (size / (1024 * 1024)) + " MB");

            // Measure time for FileReader
            long fileReaderTime = measureFileReaderTime("SampleText");
            System.out.println("FileReader Time: " + fileReaderTime + " ms");

            // Measure time for InputStreamReader
            long inputStreamReaderTime = measureInputStreamReaderTime("SampleText");
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

            System.out.println();
        }
    }
}
