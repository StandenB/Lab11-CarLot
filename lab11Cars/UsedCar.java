package lab11Cars;

public class UsedCar extends Cars{

	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
        return String.format("%-10s %-10s %d\t$%,10.2f\t%-10s ", getMake(), getModel(), getYear(), getPrice(), mileage);
    }
	
}
