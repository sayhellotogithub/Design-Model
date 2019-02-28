package iblogstreet.structuralpatterns.decorator.phone;

public class Accessories extends Decorator {

	public Accessories(Phone phone) {
		super(phone);
	}

	@Override
	public void print() {

		super.print();
		addAccessories();
	}

	public void addAccessories() {
		System.out.println("我是带挂件的手机");
	}

}