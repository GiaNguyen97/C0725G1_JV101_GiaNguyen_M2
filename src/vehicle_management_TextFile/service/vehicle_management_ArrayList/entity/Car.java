package vehicle_management_TextFile.service.vehicle_management_ArrayList.entity;

public class Car extends Vehicle {
    private byte numberOfSeats;
    private String typeOfCar;

    public Car() {

    }

    public Car(String vehiclePlate, String manufacturerOfVehicle, short manufacturingDateOfVehicle, String vehicleOwner, byte numberOfSeats, String typeOfCar) {
        super(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner);
        this.numberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }

    public byte getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(byte numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Biển số xe: " + super.getVehiclePlate() +
                ", hãng sản xuất: " + super.getManufacturerOfVehicle() +
                ", ngày sản xuất: " + super.getManufacturingDateOfVehicle() +
                ", chủ sở hữu: " + super.getVehicleOwner() +
                ", số chỗ ngồi: " + numberOfSeats +
                ", kiểu xe : " + typeOfCar + "}";
    }
}
