public class MobillBill1 implements Bill {
	public double calcBill(int units) {
		double amt1 = units*.89;
		return amt1;
	}
	public void printBill(double amt1) {
		System.out.println("Mobile Bill of -"+ amt1);
	}
}