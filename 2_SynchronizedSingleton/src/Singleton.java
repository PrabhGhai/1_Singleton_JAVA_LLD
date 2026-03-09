public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton(){
        System.out.println("Object Created");
    }

    //Synchronized -> it provides mutual exclusion
    //if one thread enters the synchronized method, other will wait until it finishes
    public static synchronized Singleton getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}
