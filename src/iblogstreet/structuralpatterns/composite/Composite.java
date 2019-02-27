package iblogstreet.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Armyone
 * @date 2019/2/25 11:27
 * @desc 树枝构件（Composite）角色
 */

public class Composite extends Component {
    private List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    @Override
    public void draw() {
        for (Component component : components) {
            component.draw();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }
}
