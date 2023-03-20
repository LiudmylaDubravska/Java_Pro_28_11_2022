import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileLoggerConfigurationLoader loggerConfigurationLoader =
                new FileLoggerConfigurationLoader();
        FileLogger fileLogger1 = new FileLogger(loggerConfigurationLoader.load());
        fileLogger1.debug("Log message 1 DEBUG");
        fileLogger1.info("Log message 1 INFO");
    }
}
