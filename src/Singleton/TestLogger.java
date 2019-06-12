package Singleton;

public class TestLogger {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger.hashCode());
        System.out.println(logger2.hashCode());
    }
}
