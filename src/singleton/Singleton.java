package singleton;

public class Singleton {

    private volatile Singleton uniqueInstance;

    private Singleton() {}

    public Singleton getInstance() {
        if (this.uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (this.uniqueInstance == null) {
                    this.uniqueInstance = new Singleton();
                }
            }
        }

        return this.uniqueInstance;
    }
}
