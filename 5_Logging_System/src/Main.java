//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dependency Injection
        Logger log = Logger.getInstance(new PipeFormatter());
        log.info("API hits");
        log.error("Not getting data");

    }
}