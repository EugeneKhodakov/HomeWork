package com.company.Task1;

import java.io.IOException;

public class Controller {
    private void askForCommand() {
        IO.askForCommand();
    }

    private void viewHelp() {
        output(WorkCommand.HELP.commandOutput(null));
    }

    private String doCommand(String readCommand) {
        String[] splitCommand = readCommand.split(" ");
        for (WorkCommand workCommand : WorkCommand.values()) {
            if (workCommand.getCommandValue().equals(splitCommand[0])) {
                return workCommand.commandOutput(splitCommand.length > 1
                        ? splitCommand[1] : null);
            }
        }
        return WorkCommand.WRONG_COMMAND.commandOutput(null);
    }

    private boolean isReadCommandValid(String readCommand) {
        return readCommand != null;
    }

    private void output(String outputString) {
        IO.print(outputString);
    }

    public String getCommand() throws IOException {
        try {
            return IO.getCommand();
        } catch (GetTextFromUserInputException e) {
            return WorkCommand.WRONG_COMMAND.getCommandValue();
        }
    }

    public void commandLine() {
        String readCommand = "";
        viewHelp();
        while(true) {
            askForCommand();
            try {
                readCommand = getCommand();
            } catch (IOException e) {
                // do something! ;)
            }
            if (isReadCommandValid(readCommand))
                output(doCommand(readCommand));
            if (readCommand.equals(WorkCommand.EXIT
                    .getCommandValue())) break;
        }
        try {
            IO.close();
        } catch (CloseInputStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
