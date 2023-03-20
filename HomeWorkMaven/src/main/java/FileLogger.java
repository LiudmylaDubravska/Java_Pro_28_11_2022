import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class FileLogger {
    private FileLoggerConfiguration loggerConfig; //= new FileLoggerConfiguration("C://projects//Log");

    public FileLogger(FileLoggerConfiguration loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

    public static void setUpFileLogger(FileLoggerConfiguration loggerConfig) {
        loggerConfig = loggerConfig;
    }

    private void log(String logMessage, LoggingLevel loggingLevel) throws IOException {
        if (loggerConfig.getLogLevel().contains(loggingLevel)) {
            String now = LocalDateTime.now().toString();
            String format = loggerConfig.getMessageFormat();//"[ПОТОЧНИЙ_ЧАС][LOG_LEVEL] Повідомлення: [СТРОКА-ПОВІДОМЛЕННЯ]"
            format = format.replace("ПОТОЧНИЙ_ЧАС", now);
            format = format.replace("LOG_LEVEL", loggingLevel.toString());
            format = format.replace("СТРОКА-ПОВІДОМЛЕННЯ", logMessage);
            writeInFile(format);
        }
    }

    private void writeInFile(String logMessage) throws IOException {
        synchronized (FileLogger.class) {
            BufferedWriter writer = null;
            try {
                if(Files.exists(Path.of(loggerConfig.getFilePath())))
                {
                    long fileSizeinBytes = Files.size(Path.of(loggerConfig.getFilePath()));
                    if (fileSizeinBytes >= loggerConfig.getMaxSize()) {
                        throw new FileMaxSizeReachedException("Max file size: " + loggerConfig.getMaxSize() +"; File size: " + fileSizeinBytes
                                + "; File path: " + loggerConfig.getFilePath());
                    }
                }
                writer = new BufferedWriter(new FileWriter(loggerConfig.getFilePath(), true));
                writer.write(logMessage);
                writer.append("\n");
            } finally {
                if(writer != null){
                    writer.close();
                }
            }

        }
    }

    public void debug(String logMessage) throws IOException {
        log(logMessage, LoggingLevel.DEBUG);
    }

    public void info(String logMessage) throws IOException {
        log(logMessage, LoggingLevel.INFO);
    }


}
