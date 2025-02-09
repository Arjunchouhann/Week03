package com.runtimeanalysisandbigonotation.largefilereadingefficiency;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class LargeFileReading {
    //measure file reader time
    public static long measureFileReaderTime(String filePath) {
        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            char[] buffer = new char[8192];
            while (fileReader.read(buffer) != -1) {
                // Reading the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000;
    }
    //measure input stream time
    public static long measureInputStreamReaderTime(String filePath) {
        long startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            char[] buffer = new char[8192];
            while (inputStreamReader.read(buffer) != -1) {
                // Reading the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Convert to milliseconds
    }
}