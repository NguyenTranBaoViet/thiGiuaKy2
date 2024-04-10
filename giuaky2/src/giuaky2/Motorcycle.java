package giuaky2;

import java.io.Serializable;

public class Motorcycle extends Vehicle implements Serializable{
	private double capacity;

    public Motorcycle(String id, String brand, int publishYear, double price, String color, double capacity) {
        super(id, brand, publishYear, price, color);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Công suất: " + capacity);
    }
}
