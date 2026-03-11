import java.time.LocalDateTime;

public class PipeFormatter implements LogFormatter{

    @Override
    public String format(LogLevel level, String msg)
    {
        return level + " | " + LocalDateTime.now() + " | " + msg;
    }
}
