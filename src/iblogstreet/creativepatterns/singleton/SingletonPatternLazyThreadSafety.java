package iblogstreet.creativepatterns.singleton;

/**
 * @author Armyone
 * @date 2019/2/13 16:38
 * @desc 创建型模式-单例模式-懒汉式-线程安全
 */

public class SingletonPatternLazyThreadSafety {
    private static SingletonPatternLazyThreadSafety instance;

    private SingletonPatternLazyThreadSafety() {
    }

    public static synchronized SingletonPatternLazyThreadSafety getInstance() {
        if (instance == null) {
            instance = new SingletonPatternLazyThreadSafety();
        }
        return instance;
    }
}
