package Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {

    private LocalDate localDate;
    static private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-YYYY : hh-mm - ");
    static private volatile boolean       consoleLogOn              = false;
    static private volatile boolean       fileLogOn                 = false;

    public CrazyLogger(){
        localDate = LocalDate.now();
        localDate.format(dateTimeFormatter);
    }

    public static boolean isConsoleLogOn() {
        return consoleLogOn;
    }

    public static void setConsoleLogOn(boolean consoleLogOn) {
        CrazyLogger.consoleLogOn = consoleLogOn;
    }
}
