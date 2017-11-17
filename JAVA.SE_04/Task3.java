package com.company.Task3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        String fileToRead  = "./JAVA_SE_04/src/om/company/Task3.java";
        String fileToWrite = fileToRead.concat(".utg16copy");

        try {
            Files.write(Paths.get(fileToWrite), Files.readAllLines(Paths.get(fileToRead), StandardCharsets.UTF_8),
                    StandardCharsets.UTF_16);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(" we can't found file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" we can't IO acces file.");
        }

    }
}
