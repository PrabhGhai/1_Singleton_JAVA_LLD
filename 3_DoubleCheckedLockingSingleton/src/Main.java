//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      SingletonThread T1 = new SingletonThread();
      T1.start();
      SingletonThread T2 = new SingletonThread();
      T2.start();
    }
}