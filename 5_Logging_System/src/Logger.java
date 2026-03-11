public class Logger{

    private final Appender appender ;
    private static Logger loggerInstance = null;

    //CONSTRUCTOR
    private Logger(Appender appenderType){
        appender = appenderType;
    };

    //GET INSTANCE
    public static Logger getInstance(Appender appenderType)
    {
        if(loggerInstance == null )
        {
            synchronized (Logger.class){
                if(loggerInstance == null)
                {
                    loggerInstance = new Logger(appenderType);
                }
            }
        }

        return loggerInstance;
    }

    //------------------------------------------------------------------------------------

    //INFO

    public void info(String msg)
    {
        appender.append(LogLevel.INFO,msg);
    }

    //DEBUG
    public void debug(String msg)
    {
        appender.append(LogLevel.DEBUG,msg);
    }

    //WARN
    public void warn(String msg)
    {
        appender.append(LogLevel.WARN,msg);
    }

    //Error

    public void error(String msg)
    {
        appender.append(LogLevel.ERROR,msg);

    }
}