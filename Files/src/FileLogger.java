import javax.swing.*;

public class FileLogger {
    private FileLoggerConfiguration LoggerConfig; //= new FileLoggerConfiguration("C://projects//Log");

    public FileLogger(FileLoggerConfiguration loggerConfig) {
        LoggerConfig = loggerConfig;
    }

    public static void log(String test){
        if(FileLoggerConfiguration.logLevel == LoggingLevel.DEBUG){
            debug();
        }else {
            debug();
        }
    }
    private static void debug(){}
    private static void info(){}
}
