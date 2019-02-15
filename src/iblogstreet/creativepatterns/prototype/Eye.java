package iblogstreet.creativepatterns.prototype;

import java.io.Serializable;

/**
 * @author Armyone
 * @date 2019/2/15 11:10
 * @desc
 */

public class Eye implements Serializable {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Eye(String color) {
        this.color = color;
    }
}
