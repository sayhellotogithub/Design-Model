package iblogstreet.structuralpatterns.composite;

/**
 * @author Armyone
 * @date 2019/2/25 11:26
 * @desc 抽象构件（Component）角色
 */

public abstract class Component {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract void add(Component component);

    public abstract void remove(Component component);
}

