package iblogstreet.creativepatterns.singleton;

/**
 * @author Armyone
 * @date 2019/2/13 16:38
 * @desc 创建型模式-单例模式-懒汉式
 */

public class SingletonPatternLazy {
    private static SingletonPatternLazy instance;

    private SingletonPatternLazy() {
    }

    public static SingletonPatternLazy getInstance() {
        if (instance == null) {
            instance = new SingletonPatternLazy();
        }
        return instance;
    }
}
