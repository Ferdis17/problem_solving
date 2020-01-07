public class Singleton {

  private final static  Singleton myInstance = null;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(myInstance == null){
            return new Singleton();
        }
        return myInstance;
    }
}
