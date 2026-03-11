public class FileAppender implements Appender{

    private LogFormatter logFormatter;

    public FileAppender(LogFormatter logFormatterType, String file)
    {
        logFormatter = logFormatterType;
        System.out.println("Storing Logs in file : " + file);
    }

    @Override
    public void append(LogLevel logLevel, String msg)
    {
        String formattedMsg = logFormatter.format(logLevel,msg);
        System.out.println(formattedMsg);
    }

}
