package iblogstreet.creativepatterns.singleton;

/**
 * @author Armyone
 * @date 2019/2/13 17:15
 * @desc 创建型模式-单例模式-饿汉式
 */

public class SingletonPatternHungry {
    private static SingletonPatternHungry instance = new SingletonPatternHungry();

    private SingletonPatternHungry() {
    }

    public static SingletonPatternHungry getInstance() {
        return instance;
    }
}
