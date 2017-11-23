package com.company.Task1;

public class Exeptions extends Exception {
    public Exeptions(String message) {
        super(message);
    }
}
class GetTextFromUserInputException extends Exeptions {
    public GetTextFromUserInputException(String message) {
        super(message);
    }
}

class CloseInputStreamException extends Exeptions{
    public CloseInputStreamException(String message) {
        super(message);
    }
}

class FileReadException extends Exeptions {
    public FileReadException(String message) {
        super(message);
    }
}

class FileWriteException extends Exeptions {
    public FileWriteException(String message) {
        super(message);
    }
}

class CreateFileException extends Exeptions {
    public CreateFileException(String message) {
        super(message);
    }
}