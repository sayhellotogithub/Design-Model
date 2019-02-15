package iblogstreet.creativepatterns.abstractfactory;

/**
 * @author Armyone
 * @date 2019/2/14 17:09
 * @desc
 */

public class ConcreteFactory extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB();
    }
}
