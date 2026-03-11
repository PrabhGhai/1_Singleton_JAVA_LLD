import java.time.LocalDateTime;

public class BracketFormatter implements LogFormatter{

    @Override
    public String format(LogLevel level, String msg)
    {
        return "[ " + level +" ] [ " + LocalDateTime.now() + " ] " + msg;
    }
}
