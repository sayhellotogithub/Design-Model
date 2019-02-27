package iblogstreet.structuralpatterns.composite;

/**
 * @author Armyone
 * @date 2019/2/25 11:27
 * @desc 树叶构件（Leaf）角色
 */

public class Leaf extends Component {

    @Override
    public void draw() {
        System.out.println("draw leaf" + this.getName());
    }

    @Override
    public void add(Component component) {
        System.out.println(" leaf can't add");
    }

    @Override
    public void remove(Component component) {
        System.out.println(" leaf can't remove");
    }
}
