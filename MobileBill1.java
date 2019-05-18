public class MobileBill1 extends AbstractBill {
	public double calcBill(int units) {
		double amt=units*1.45;
		return amt;
	}
}