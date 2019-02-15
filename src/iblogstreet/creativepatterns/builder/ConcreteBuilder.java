package iblogstreet.creativepatterns.builder;

/**
 * @author Armyone
 * @date 2019/2/15 13:30
 * @desc
 */

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public void buildFrame() {
        product.addPart("frame", "frame");
    }

    @Override
    public void buildEngine() {
        product.addPart("engine", "engine");
    }

    @Override
    public void buildWheels() {
        product.addPart("wheels", "wheels");
    }

    @Override
    public void buildDoors() {
        product.addPart("doors", "doors");
    }
}
