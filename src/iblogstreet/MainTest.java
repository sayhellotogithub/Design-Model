package iblogstreet;

import iblogstreet.creativepatterns.abstractfactory.AbstractFactory;
import iblogstreet.creativepatterns.abstractfactory.ConcreteFactory;
import iblogstreet.creativepatterns.factorymethod.ConcreteCreatorA;
import iblogstreet.creativepatterns.factorymethod.ConcreteCreatorB;
import iblogstreet.creativepatterns.factorymethod.Creator;
import iblogstreet.creativepatterns.factorymethod.Product;
import iblogstreet.creativepatterns.singleton.SingletonPatternHungry;
import iblogstreet.creativepatterns.singleton.SingletonPatternLazy;
import iblogstreet.creativepatterns.singleton.SingletonPatternStaticMethod;

/**
 * @author Armyone
 * @date 2019/2/13 16:52
 * @desc
 */

public class MainTest {
    public static void main(String[] args) {
        SingletonPatternLazy.getInstance();
        SingletonPatternHungry.getInstance();
        SingletonPatternStaticMethod.getInstance();

        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.showProduct();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.showProduct();

        AbstractFactory abstractFactoryA = new ConcreteFactory();
        abstractFactoryA.createProductA();
        abstractFactoryA.createProductB();

    }
}
