/* the interface the implements of the use ofthe interface 
*/
public class ElectricityBill implements Bill {
	public double calcBill(int units) {
		double amt = units * 9.8;
		return amt;
	}
	public void printBill(double amt) {
		System.out.println("Bill Of ElectricityBill --" + amt);
	}
}