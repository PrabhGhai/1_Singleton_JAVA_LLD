public class ConsoleAppender implements Appender{

    private LogFormatter logFormatter;

    public ConsoleAppender(LogFormatter logFormatterType)
    {
        logFormatter = logFormatterType;
    }

    @Override
    public void append(LogLevel logLevel, String msg)
    {
        String formattedMsg = logFormatter.format(logLevel,msg);
        System.out.println(formattedMsg);
    }
}
