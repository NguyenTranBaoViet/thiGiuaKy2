package giuaky2;

import java.io.Serializable;

public class Vehicle implements Icar,Serializable {
	 protected String id;
	    protected String brand;
	    protected int publishYear;
	    protected double price;
	    protected String color;

	    public Vehicle(String id, String brand, int publishYear, double price, String color) {
	        this.id = id;
	        this.brand = brand;
	        this.publishYear = publishYear;
	        this.price = price;
	        this.color = color;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public int getPublishYear() {
	        return publishYear;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getColor() {
	        return color;
	    }

	    @Override
	    public void showInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Thương hiệu: " + brand);
	        System.out.println("Năm xuất bản: " + publishYear);
	        System.out.println("Giá: " + price);
	        System.out.println("Màu: " + color);
	    }
	    
}
