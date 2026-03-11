import java.util.List;

public class Logger {

    private static Logger loggerInstance = null;

    private List<Appender> appenders;

    private Logger(List<Appender> appenders){
        this.appenders = appenders;
    }

    public static Logger getInstance(List<Appender> appenders){

        if(loggerInstance == null){
            synchronized(Logger.class){
                if(loggerInstance == null){
                    loggerInstance = new Logger(appenders);
                }
            }
        }

        return loggerInstance;
    }

    public void info(String msg){
        log(LogLevel.INFO,msg);
    }

    public void debug(String msg){
        log(LogLevel.DEBUG,msg);
    }

    public void warn(String msg){
        log(LogLevel.WARN,msg);
    }

    public void error(String msg){
        log(LogLevel.ERROR,msg);
    }

    private void log(LogLevel level,String msg){

        for(Appender appender : appenders){
            appender.append(level,msg);
        }

    }

}