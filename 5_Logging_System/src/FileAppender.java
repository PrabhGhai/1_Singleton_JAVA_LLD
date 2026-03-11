public class FileAppender implements Appender{

    private LogFormatter logFormatter;

    public FileAppender(LogFormatter logFormatterType)
    {
        logFormatter = logFormatterType;
    }

    @Override
    public void append(LogLevel logLevel, String msg)
    {
        System.out.println("Appending in Files");
        String formattedMsg = logFormatter.format(logLevel,msg);
        System.out.println(formattedMsg);
    }

}
