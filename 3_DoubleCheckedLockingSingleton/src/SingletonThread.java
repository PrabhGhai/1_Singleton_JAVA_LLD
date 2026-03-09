public class SingletonThread extends Thread{

    public void run()
    {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
}
