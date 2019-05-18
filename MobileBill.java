/* the above two classes Even those there performing simaplar
the naming is disfolled is different. */
public class MobileBill {
	public double calcBill(int units) {
		double amt = units * 0.75;
		return amt;
	}
	public void print(double amt) {
		System.out.println("Bill "+amt);
	}

}