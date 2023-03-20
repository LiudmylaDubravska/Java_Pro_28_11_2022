import java.io.*;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfigurationLoader() {
    }

    public FileLoggerConfiguration load() throws IOException {
        LoggingLevel logLevel=null;
        String filePath="";
        long maxSize=0;
        String messageFormat="";
        BufferedReader in
                = new BufferedReader(new FileReader("C:\\projects\\Log\\LOGGER.config"));
        while (in.ready()) {
            String str = in.readLine();
            int columnPosition = str.indexOf(":");
            String paramName = str.substring(0, columnPosition);
            str = str.substring(columnPosition+1);
            String paramValue = str.trim();
            switch (paramName) {
                case "FILE":
                    filePath = paramValue;
                    break;
                case "LEVEL":
                    logLevel = LoggingLevel.valueOf(paramValue);
                    break;
                case "MAX-SIZE":
                    maxSize = Long.parseLong(paramValue);
                    break;
                case "FORMAT":
                    messageFormat = paramValue;
                    break;
            }
        }
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(logLevel, filePath, maxSize, messageFormat);
        return fileLoggerConfiguration;
    }

}
