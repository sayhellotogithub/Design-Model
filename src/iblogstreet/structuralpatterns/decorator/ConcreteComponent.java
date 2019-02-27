package iblogstreet.structuralpatterns.decorator;

/**
 * @author Armyone
 * @date 2019/2/27 11:39
 * @desc
 */

public class ConcreteComponent implements Component {
    @Override
    public void sampleMethod() {
        System.out.println("I'm ConcreteComponent");
    }
}
