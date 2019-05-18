/* class make the object is use */
public class BillDemo {
	public static void main(String arg[]) {
		Electricity ec=new Electricity();
		double amt=ec.calc(200);
		ec.display(amt);

		MobileBill mb=new MobileBill();
		double amt1=mb.calcBill(400);
		mb.print(amt1);

		WaterBill wb = new WaterBill();
		double amt2=wb.calcBill(189);
		wb.print(amt2);

	}
}