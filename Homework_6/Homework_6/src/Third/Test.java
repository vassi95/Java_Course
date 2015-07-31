package Third;

public class Test {

	public static void main(String[] args) {
		Car[] cars = new Car[10];
		cars[0] = new SUV(30000, true);
		cars[1] = new SUV(70000, false);
		cars[2] = new SUV(25000, false);
		cars[3] = new SUV(50000, false);
		cars[4] = new SUV(90000, true);
		cars[5] = new Automobile(15000, 8);
		cars[6] = new Automobile(51000, 7);
		cars[7] = new Automobile(25000, 10);
		cars[8] = new Automobile(31000, 6);
		cars[9] = new Automobile(11000, 5);

		sortByPrice(cars);
		System.out.println("Cars sorted by price: ");
		printSorted(cars);
	}

	public static void sortByPrice(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length - 1; j++) {
				if (cars[j].getPrice() > cars[j + 1].getPrice()) {
					int temp = cars[j + 1].getPrice();
					cars[j + 1].setPrice(cars[j].getPrice());
					cars[j].setPrice(temp);
				}
			}
		}

	}

	public static void printSorted(Car[] cars) {
		for (int i = 0; i < 5; i++) {
			cars[i].sayPrice();
			cars[i].sayOffRoad();
		}
		for (int j = 5; j < 10; j++) {
			cars[j].sayPrice();
			cars[j].sayFuel();
		}

	}

}
