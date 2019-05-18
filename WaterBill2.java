public class WaterBill2 extends AbstractBill {
	public double calcBill(int units) {
		double amt=units*3.90;
		return amt;
	}
}