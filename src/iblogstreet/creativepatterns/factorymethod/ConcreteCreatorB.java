package iblogstreet.creativepatterns.factorymethod;

/**
 * @author Armyone
 * @date 2019/2/14 15:41
 * @desc
 */

public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
