//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Appender appender = new FileAppender(new BracketFormatter());
        Logger log = Logger.getInstance(appender);
        log.info("API hits");
        log.error("Not getting data");

    }
}