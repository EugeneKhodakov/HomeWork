package com.company.Task1;

import java.io.*;

public class FileCommander {

    private String getFile(File file) throws FileReadException {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
            String fileLine;
            while ((fileLine = in.readLine()) != null) {
                fileContent.append(fileLine).append("\n");
            }
        } catch (IOException e) {
            throw new FileReadException(file + " read error");
        }
        return fileContent.toString();
    }

    private String getDir(File path) {
        File[] files = path.listFiles();
        StringBuilder dirContent = new StringBuilder();
        for (File file : files) {
            dirContent.append(file.getName())
                    .append(file.isDirectory() ? File.separator : "")
                    .append("\n");
        }
        return dirContent.toString();
    }

    private void writeFile(String pathName, String text) throws FileWriteException {
        File file = new File(pathName);
        try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
            out.print(text);
        } catch (IOException e) {
            throw new FileWriteException(pathName + " write error");
        }
    }

    public String view(String pathName) throws FileReadException {
        File path = new File(pathName);
        String result = "";
        if (!path.exists()) {
            // do something
            result = "file or dir is not exist";
        } else if (path.isDirectory()) {
            //show dir
            result = getDir(path);
        } else if (path.isFile())
            //show file
            result = getFile(path);
        return result;
    }

    public String usingFile(String pathName, String newText) throws CreateFileException, FileReadException, FileWriteException {
        File file = new File(pathName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new CreateFileException(pathName + " creation error");
            }
        }
        StringBuilder textBuffer = new StringBuilder();
        textBuffer.append(getFile(file.getAbsoluteFile())).append(newText);
        writeFile(pathName, textBuffer.toString());
        return pathName + " written";
    }

    public String removeFile(String pathName) {
        File file = new File(pathName);
        if (file.exists()) {
            file.delete();
        }
        return pathName + " removed";
    }
}
