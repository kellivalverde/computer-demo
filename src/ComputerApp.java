
public class ComputerApp {

	public static void main(String[] args) {
		// actually runs the project

		Computer laptop = new Computer("Dell", "Latitude", 500.00); // parameters of constructor
		// ^ the class that laptop belongs to
		Computer desktop = new Computer("Mac", "iMac", 2500.00);

		System.out.println("The computer's brand is " + laptop.getBrand() + " " + laptop.getModel() + " which is $"
				+ laptop.getPrice() + "."); // created method in Computer class

		System.out.println(laptop);

		laptop.download();

		System.out.println(desktop);
	}

}
