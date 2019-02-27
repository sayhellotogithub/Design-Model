package iblogstreet.structuralpatterns.decorator;

/**
 * @author Armyone
 * @date 2019/2/27 11:39
 * @desc 装饰（Decorator）角色
 */

public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleMethod() {
        // 委派给构件
        component.sampleMethod();
    }
}
