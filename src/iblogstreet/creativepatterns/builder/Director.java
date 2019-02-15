package iblogstreet.creativepatterns.builder;

/**
 * @author Armyone
 * @date 2019/2/15 13:29
 * @desc
 */

public class Director {
    public void construct(Builder builder) {
        builder.buildFrame();
        builder.buildDoors();
        builder.buildEngine();
        builder.buildWheels();
    }
}
