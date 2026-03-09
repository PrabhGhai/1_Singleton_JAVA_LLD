public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton(){
        System.out.println("Object Created");
    }

    public static Singleton getInstance()
    {
        if(INSTANCE == null)
        {
            synchronized(Singleton.class){
                if(INSTANCE == null)
                {
                    INSTANCE = new Singleton();
                }
            }
        }

        return INSTANCE;
    }
}
