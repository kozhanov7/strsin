public final class CarStatistics {
    private static CarStatistics instance;
    private int totalCars = 0;

    private CarStatistics() {}

    public static CarStatistics getInstance() {
        if (instance == null) {
            instance = new CarStatistics();
        }
        return instance;
    }

    public void incrementTotalCars() {
        totalCars++;
    }

    public int getTotalCars() {
        return totalCars;
    }
}