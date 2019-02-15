package iblogstreet.creativepatterns.bridge;

/**
 * @author Armyone
 * @date 2019/2/15 16:29
 * @desc
 */

public class RefinedAbstraction extends Abstraction {
    public void operatorMore() {
        this.operator();
        System.out.println("operatorMore");
    }
}
