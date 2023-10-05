public class Car {
    private String name;
    private DriveStrategy driveStrategy;

    public Car(String name, DriveStrategy driveStrategy) {
        this.name = name;
        this.driveStrategy = driveStrategy;
        CarStatistics.getInstance().incrementTotalCars();
    }

    public void displayDriveType() {
        System.out.print(name + " ");
        driveStrategy.drive();
    }
}