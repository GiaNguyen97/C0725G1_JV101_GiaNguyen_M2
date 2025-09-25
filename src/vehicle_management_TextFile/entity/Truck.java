package vehicle_management_TextFile.entity;

public class Truck extends Vehicle {
    private short grossTruckWeight;

    public Truck() {

    }

    public Truck(String vehiclePlate, String manufacturerOfVehicle, short manufacturingDateOfVehicle, String vehicleOwner, short grossTruckWeight) {
        super(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner);
        this.grossTruckWeight = grossTruckWeight;
    }

    public short getGrossTruckWeight() {
        return grossTruckWeight;
    }

    public void setGrossTruckWeight(short grossTruckWeight) {
        this.grossTruckWeight = grossTruckWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Biển số xe: " + super.getVehiclePlate() +
                ", hãng sản xuất: " + super.getManufacturerOfVehicle() +
                ", ngày sản xuất: " + super.getManufacturingDateOfVehicle() +
                ", chủ sở hữu: " + super.getVehicleOwner() +
                ", trọng tải: " + grossTruckWeight + "}";
    }
}