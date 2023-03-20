import java.util.Arrays;
import java.util.List;

public enum LoggingLevel {
    INFO,
    DEBUG(INFO);

    private final List<LoggingLevel> subLevels;

    LoggingLevel(LoggingLevel... loggingSubLevels) {
        this.subLevels = Arrays.asList(loggingSubLevels);
    }

    public boolean contains(LoggingLevel loggingLevel) {
        return loggingLevel == this || this.subLevels.contains(loggingLevel);
    }
}
