package iblogstreet.creativepatterns.singleton;

/**
 * @author Armyone
 * @date 2019/2/13 17:37
 * @desc 创建型模式-单例模式-静态内部类
 */

public class SingletonPatternStaticMethod {
    private SingletonPatternStaticMethod() {
    }

    private static class SingletonPatternStaticMethodHoler {
        private static SingletonPatternStaticMethod instance = new SingletonPatternStaticMethod();
    }

    public static SingletonPatternStaticMethod getInstance() {
        return SingletonPatternStaticMethodHoler.instance;
    }
}
