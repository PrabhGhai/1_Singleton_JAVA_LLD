import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogFormatter formatter = new PipeFormatter();

        Appender console = new ConsoleAppender(formatter);

        Appender file = new FileAppender(formatter,"logs.txt");

        List<Appender> appenders = Arrays.asList(console,file);

        Logger logger = Logger.getInstance(appenders);

        logger.info("Application started");

    }
}