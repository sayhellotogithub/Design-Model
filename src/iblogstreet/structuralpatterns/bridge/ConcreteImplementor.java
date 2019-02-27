package iblogstreet.structuralpatterns.bridge;

/**
 * @author Armyone
 * @date 2019/2/15 16:30
 * @desc
 */

public class ConcreteImplementor extends Implementor {
    @Override
    public void operatorImpl() {
        System.out.println("我是实现类1");
    }
}
