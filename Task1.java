package com.company.Task1;

import org.omg.CORBA.portable.OutputStream;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.io.*;

public class Task1 {

    private static String result;
    private static String[] inputInStringArray;
    private static String[] reservedWordsInFileArray;
    private static byte[] bytesFromReservedWordsFile;
    private static byte[] bytesFromJavaInputFile;
    private static String outputFileName;
    private static String inputInString;
    private static String reservedWordsInString;

    private static HashSet<String> resultSet;

    public static void MyParser(String inputFileName, String outputFileName, String reservedWordsFile){
        try (OutputStream outFile = new FileOutputStream(outputFileName);
             InputStream inFile = new FileInputStream(inputFileName);
             InputStream reservedWords = new FileInputStream(reservedWordsFile)){

                bytesFromReservedWordsFile = new byte[reservedWordsFile.available()];
                bytesFromJavaInputFile = new byte[inputFileName.available()];

                reservedWords.read(bytesFromReservedWordsFile, 0, bytesFromReservedWordsFile.length);
                inFile.read(bytesFromJavaInputFile, 0, bytesFromJavaInputFile.length);

                reservedWordsInString = new String(bytesFromReservedWordsFile, StandardCharsets.UTF_8);
                reservedWordsInFileArray = reservedWordsInString.split("\\n");

                inputInString = new String(bytesFromJavaInputFile, StandardCharsets.UTF_8);
                inputInStringArray = inputInString.split("\\s|\\n|\\t|^[a-zA-Z]|^[0-9]");

                for(int i = 0; i < inputInStringArray.length; i++){
                    String tmp = reservedWordsInFileArray[i];
                    for(int j = 0; j < inputInStringArray.length; j++){
                        if (tmp.equals(inputInStringArray[j])){
                            resultSet.add(tmp);
                        }
                    }

                }

                String[] resultStringArray = new String[resultSet.size()];
                int i = 0;
                for (String out : resultSet){
                    out = "Reserved word - " + out;
                    resultStringArray[i] = out;
                    i++;
                }

                StringBuilder resultStringBuilder = new StringBuilder();
                for (i = 0; i < resultStringArray.length; i++){
                    resultStringBuilder.append(resultStringArray[i]);
                }

                char[] resultCh = (new String(resultStringBuilder.toString())).toCharArray();
                byte[] resultByte = new byte[resultCh.length];

                for (i = 0; i < resultByte.length; i++){
                    resultByte[i] = (byte) resultCh[i];
                }

                outFile.write(resultByte, 0, resultByte.length);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String args[]){
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        String reservedWordsFile = "reservedWords.txt";
        MyParser(inputFileName, outputFileName, reservedWordsFile);

        System.out.println("Reserved words:");

        for (String parser : resultSet){
            System.out.println(parser);
        }

        System.out.println("At all - " + resultSet.size());
    }

}
