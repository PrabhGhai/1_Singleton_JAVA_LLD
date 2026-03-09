public class SingletonThread extends Thread{

    public void run()
    {
        Singleton instance = Singleton.getInstance();
        System.out.println("Object Memory Address : " + instance);
    }
}
