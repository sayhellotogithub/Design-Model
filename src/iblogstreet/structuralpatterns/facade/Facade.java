package iblogstreet.structuralpatterns.facade;

/**
 * @author Armyone
 * @date 2019/3/1 10:00
 * @desc
 */

public class Facade {
    SubsystemA subsystemA;
    SubsystemB subsystemB;

    public void opearatorAB() {
        if (subsystemA == null) {
            subsystemA = new SubsystemA();
        }
        if (subsystemB == null) {
            subsystemB = new SubsystemB();
        }
        subsystemA.operator();
        subsystemB.operator();
    }
}
