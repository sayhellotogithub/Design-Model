package iblogstreet.creativepatterns.bridge;

/**
 * @author Armyone
 * @date 2019/2/15 16:28
 * @desc
 */

public abstract class Abstraction {
    private Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operator() {
        implementor.operatorImpl();
    }
}
