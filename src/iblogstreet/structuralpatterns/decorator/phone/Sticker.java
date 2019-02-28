package iblogstreet.structuralpatterns.decorator.phone;

public class Sticker extends Decorator {

    public Sticker(Phone phone) {
        super(phone);
    }

    @Override
    public void print() {
        super.print();
        addSticker();
    }

    public void addSticker() {
        System.out.println("我是带贴膜的手机");
    }

}