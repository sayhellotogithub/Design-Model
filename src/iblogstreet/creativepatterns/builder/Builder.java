package iblogstreet.creativepatterns.builder;

/**
 * @author Armyone
 * @date 2019/2/15 13:29
 * @desc
 */

public abstract class Builder {
    public abstract Product getProduct();

    public abstract void buildFrame();

    public abstract void buildEngine();

    public abstract void buildWheels();

    public abstract void buildDoors();
}
