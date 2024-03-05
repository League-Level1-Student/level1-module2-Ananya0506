package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		Handy.eat();
		Handy.getName();

		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.getName();
		System.out.println(Smurfette.isGirlOrBoy());
		System.out.println(Smurfette.getHatColor());
		
		Smurf Papa = new Smurf("Papa");
		Papa.getName();
		System.out.println(Papa.isGirlOrBoy());
		System.out.println(Papa.getHatColor());
		

	}

}
