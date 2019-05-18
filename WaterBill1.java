public class WaterBill1 implements Bill {
	public double calcBill(int units) {
		double amt=units*3.21;
		return amt;
	}
	public void printBill(double amt ) {
		System.out.println("WaterBill --"+ amt);
	}
}