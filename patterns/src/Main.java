public class Main {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", new ElectricDrive());
        Car merc = new Car("Mercedes-Benz", new GasolineDrive());
        Car bmw = new Car("BMW", new GasolineDrive());

        tesla.displayDriveType();
        merc.displayDriveType();
        bmw.displayDriveType();

        System.out.println("Car number: " + CarStatistics.getInstance().getTotalCars());
    }
}

