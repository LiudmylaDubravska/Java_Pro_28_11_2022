public class FileLoggerConfiguration {
    private LoggingLevel logLevel;
    private String filePath;
    private long maxSize;
    private String messageFormat;

    public FileLoggerConfiguration(LoggingLevel logLevel, String filePath, long maxSize, String messageFormat) {
        this.logLevel = logLevel;
        this.filePath = filePath;
        this.maxSize = maxSize;
        this.messageFormat = messageFormat;
    }

    public LoggingLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LoggingLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(byte maxSize) {
        this.maxSize = maxSize;
    }

    public String getMessageFormat() {
        return messageFormat;
    }

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "logLevel=" + logLevel +
                ", filePath='" + filePath + '\'' +
                ", maxSize=" + maxSize +
                ", messageFormat='" + messageFormat + '\'' +
                '}';
    }
}
