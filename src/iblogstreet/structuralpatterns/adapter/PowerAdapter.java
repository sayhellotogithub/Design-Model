package iblogstreet.structuralpatterns.adapter;

/**
 * @author Army
 * @date 2019/2/15 15:28
 * @desc
 */
//public class PowerAdapter extends TwoHole implements IThreeHole {
//
//	@Override
//	public void request() {
//		this.specificRequest();
//	}
//
//}

public class PowerAdapter extends ThreeHole {
    private TwoHole twoHole = new TwoHole();

    @Override
    public void request() {
        twoHole.specificRequest();
    }
}