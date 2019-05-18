public class Esava {
	public static void main(String arg[]) {
		Bill1 b;
		b=new ElectricityBill1();
		double amt=b.calcBill(250);
		b.printBill(amt);

		b=new MobileBill1();
		amt=b.calcBill(400);
		b.printBill(amt);

		b=new WaterBill2();
		amt =b.calcBill(300);
		b.printBill(amt);
	}
}