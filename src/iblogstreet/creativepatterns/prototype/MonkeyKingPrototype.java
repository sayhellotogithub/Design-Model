package iblogstreet.creativepatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Armyone
 * @date 2019/2/15 11:09
 * @desc
 */

public class MonkeyKingPrototype implements Cloneable, Serializable {
    private String name;
    private Eye eye;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public MonkeyKingPrototype(String name, Eye eye) {
        this.name = name;
        this.eye = eye;
    }

    @Override
    public Object clone() {
        MonkeyKingPrototype monkeyKingPrototype = null;
        try {
            monkeyKingPrototype = (MonkeyKingPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkeyKingPrototype;
    }

    //    public Object deepClone() {
//        MonkeyKingPrototype monkeyKingPrototype = null;
//        try {
//            monkeyKingPrototype = (MonkeyKingPrototype) super.clone();
//            monkeyKingPrototype.eye = new Eye(this.getEye().getColor());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        return monkeyKingPrototype;
//    }
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }
}
