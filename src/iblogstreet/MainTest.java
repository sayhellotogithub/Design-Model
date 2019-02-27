package iblogstreet;

import java.io.IOException;

import iblogstreet.creativepatterns.abstractfactory.AbstractFactory;
import iblogstreet.creativepatterns.abstractfactory.ConcreteFactory;
import iblogstreet.structuralpatterns.bridge.ConcreteImplementor;
import iblogstreet.structuralpatterns.bridge.RefinedAbstraction;
import iblogstreet.creativepatterns.builder.Builder;
import iblogstreet.creativepatterns.builder.ConcreteBuilder;
import iblogstreet.creativepatterns.builder.Director;
import iblogstreet.creativepatterns.factorymethod.ConcreteCreatorA;
import iblogstreet.creativepatterns.factorymethod.ConcreteCreatorB;
import iblogstreet.creativepatterns.factorymethod.Creator;
import iblogstreet.creativepatterns.factorymethod.Product;
import iblogstreet.creativepatterns.prototype.Eye;
import iblogstreet.creativepatterns.prototype.MonkeyKingPrototype;
import iblogstreet.creativepatterns.singleton.SingletonPatternHungry;
import iblogstreet.creativepatterns.singleton.SingletonPatternLazy;
import iblogstreet.creativepatterns.singleton.SingletonPatternStaticMethod;
import iblogstreet.structuralpatterns.composite.Component;
import iblogstreet.structuralpatterns.composite.Composite;
import iblogstreet.structuralpatterns.composite.Leaf;
import iblogstreet.structuralpatterns.decorator.ConcreteComponent;
import iblogstreet.structuralpatterns.decorator.ConcreteDecorator;
import iblogstreet.structuralpatterns.decorator.ConcreteTwoDecorator;
import iblogstreet.structuralpatterns.decorator.Decorator;

/**
 * @author Armyone
 * @date 2019/2/13 16:52
 * @desc
 */

public class MainTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonPatternLazy.getInstance();
        SingletonPatternHungry.getInstance();
        SingletonPatternStaticMethod.getInstance();

        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.showProduct();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.showProduct();

        AbstractFactory abstractFactory = new ConcreteFactory();
        abstractFactory.createProductA();
        abstractFactory.createProductB();

        MonkeyKingPrototype monkeyKingPrototype = new MonkeyKingPrototype("monekyOne", new Eye("red"));

        MonkeyKingPrototype monkeyKingPrototypeClone = (MonkeyKingPrototype) monkeyKingPrototype.deepClone();
        System.out.println(monkeyKingPrototypeClone.getName() + "," + monkeyKingPrototypeClone.getEye().getColor());
        monkeyKingPrototypeClone.getEye().setColor("green");

        System.out.println(monkeyKingPrototype.getName() + "," + monkeyKingPrototype.getEye().getColor());

        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);
        builder.getProduct().show();

//        IThreeHole tHole=new PowerAdapter();
//        tHole.request();

        RefinedAbstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementor());
        abstraction.operatorMore();

        Component component = new Leaf();
        component.setName("leaf 1");
        Component component1 = new Leaf();
        component1.setName("leaf 2");
        Component composite = new Composite();
        composite.setName("composite 1");

        composite.add(component);
        composite.add(component1);
        component.add(component1);


        ConcreteComponent concreteComponent = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(concreteComponent);
        Decorator decorator1 = new ConcreteTwoDecorator(decorator);
        decorator.sampleMethod();

        decorator1.sampleMethod();


    }
}
