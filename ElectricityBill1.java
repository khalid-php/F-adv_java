public class ElectricityBill1 extends AbstractBill {
	public double calcBill(int units) {
		double amt=units*4.89;
		return amt;
	}
}