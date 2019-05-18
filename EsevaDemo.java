public class EsevaDemo {
	public static void main(String args[]) {
		ElectricityBill eb = new ElectricityBill();
		double amt=eb.calcBill(800);
		eb.printBill(amt);

		MobillBill1 mb=new MobillBill1();
		double amt1 =mb.calcBill(500);
		mb.printBill(amt1);

		WaterBill1 wb=new WaterBill1();
		double amt2= wb.calcBill(200);
		wb.printBill(amt2);
		
	}
} 