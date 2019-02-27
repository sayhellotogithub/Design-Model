package iblogstreet.structuralpatterns.decorator;

/**
 * @author Armyone
 * @date 2019/2/27 11:39
 * @desc 具体装饰（ConcreteDecorator）角色
 */

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void sampleMethod() {
        //写相关的业务代码
        super.sampleMethod();
        addFunction();
    }

    public void addFunction() {
        System.out.println(" add Function ConcreteDecorator");
    }

}
