public class Singleton {

    //static ->
    //This variable belongs to the class, not to an object.
    //There will be only one copy of this variable for the entire application.

    private static Singleton INSTANCE = null;

    private Singleton() {}

    //static method :- So that this method can be accessed without creating the object
    public static Singleton getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}
