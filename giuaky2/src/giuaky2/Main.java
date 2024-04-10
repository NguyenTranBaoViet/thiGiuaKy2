package giuaky2;

public class Main {

	public static void main(String[] args) {
		VehicleManagementSystem system = new VehicleManagementSystem();

        Car car1 = new Car("001", "Toyota", 2020, 20000, "Đỏ", 5, "Petrol");
        Car car2 = new Car("002", "Honda", 2018, 15000, "Xanh", 4, "Diesel");
        Motorcycle motorcycle1 = new Motorcycle("003", "Yamaha", 2021, 10000, "Đen", 150);
        Truck truck1 = new Truck("004", "Ford", 2019, 30000, "", 5000);

        system.addVehicle(car1);
        system.addVehicle(car2);
        system.addVehicle(motorcycle1);
        system.addVehicle(truck1);

        system.showAllVehicles();

        System.out.println("Tìm xe bằng ID 002:");
        Vehicle foundVehicle = system.findVehicle("002");
        if (foundVehicle != null) {
            foundVehicle.showInfo();
        } else {
            System.out.println("Không tìm thấy xe!");
        }

        System.out.println("Xóa xe bằng ID 003:");
        system.removeVehicle("003");

        System.out.println("Danh sách xe cập nhật:");
        system.showAllVehicles();

        //Lưu và tải dữ liệu từ tập tin
        system.saveToFile("CongAn.xe");

        // Xóa danh sách xe
        system = new VehicleManagementSystem();

        // Tải dữ liệu từ tập tin
        system.loadFromFile("CongAn.xe");

        System.out.println("Danh sách xe đã tải:");
        system.showAllVehicles();
    }
	}


