package testng;

public class Selectvehicle implements Vehicles {

	@Override
	public void SUV() {
		System.out.println("SUV");
	}

	@Override
	public void Sedan() {
		System.out.println("Sedan");
	}

	public static void Hatchback() {
		System.out.println("Hatchback");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v = new Selectvehicle();
		v.Sedan();
		v.SUV();
		Selectvehicle.Hatchback();
	}

}
