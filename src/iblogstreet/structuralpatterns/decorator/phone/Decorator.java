package iblogstreet.structuralpatterns.decorator.phone;
/**
 * @author Army
 * @date 2019/2/27 17:36
 * @desc
 */
public abstract class Decorator extends Phone {
	Phone phone;

	public Decorator(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void print() {
		if (phone != null)
			phone.print();
	}
}