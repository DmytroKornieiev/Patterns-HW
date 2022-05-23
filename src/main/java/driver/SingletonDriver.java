package driver;

public class SingletonDriver {

    private static SingletonDriver instance;

    private SingletonDriver() {

    }
    private static SingletonDriver getInstance(){
        if (instance == null) {
            instance = new SingletonDriver();
        }
        return instance;
    }
}
