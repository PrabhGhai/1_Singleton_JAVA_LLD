public class Logger{

    private static LogFormatter logFormat ;
    private static Logger loggerInstance = null;

    //CONSTRUCTOR
    private Logger(LogFormatter formatType){
        logFormat = formatType;
    };

    //GET INSTANCE
    public static Logger getInstance(LogFormatter formatType)
    {
        if(loggerInstance == null )
        {
            synchronized (Logger.class){
                if(loggerInstance == null)
                {
                    loggerInstance = new Logger(formatType);
                }
            }
        }

        return loggerInstance;
    }

    //------------------------------------------------------------------------------------

    //INFO

    public void info(String msg)
    {
        String formattedMsg = logFormat.format(LogLevel.INFO,msg);
        System.out.println(formattedMsg);

    }

    //DEBUG
    public void debug(String msg)
    {
        String formattedMsg = logFormat.format(LogLevel.DEBUG,msg);
        System.out.println(formattedMsg);

    }

    //WARN
    public void warn(String msg)
    {
        String formattedMsg = logFormat.format(LogLevel.WARN,msg);
        System.out.println(formattedMsg);

    }

    //Error

    public void error(String msg)
    {
        String formattedMsg = logFormat.format(LogLevel.ERROR,msg);
        System.out.println(formattedMsg);

    }
}