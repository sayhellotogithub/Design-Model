package iblogstreet.creativepatterns.singleton;

/**
 * @author Armyone
 * @date 2019/2/13 16:38
 * @desc 创建型模式-单例模式-双层锁定
 */

public class SingletonPatternDoubleCheck {
    private static volatile SingletonPatternDoubleCheck instance;

    private SingletonPatternDoubleCheck() {
    }

    public static synchronized SingletonPatternDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternDoubleCheck.class) {
                instance = new SingletonPatternDoubleCheck();
            }
        }
        return instance;
    }
}
