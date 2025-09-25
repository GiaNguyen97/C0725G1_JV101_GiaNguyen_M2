package vehicle_management_TextFile.service.vehicle_management_ArrayList.entity;

public class Motorbike extends Vehicle {
    private short enginePowerofMotobike;

    public Motorbike() {
    }

    public Motorbike(String vehiclePlate, String manufacturerOfVehicle, short manufacturingDateOfVehicle, String vehicleOwner, short enginePowerofMotobike) {
        super(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner);
        this.enginePowerofMotobike = enginePowerofMotobike;
    }

    public short getEnginePowerofMotobike() {
        return enginePowerofMotobike;
    }

    public void setEnginePowerofMotobike(short enginePowerofMotobike) {
        this.enginePowerofMotobike = enginePowerofMotobike;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "Biển số xe: " + super.getVehiclePlate() +
                ", hãng sản xuất: " + super.getManufacturerOfVehicle() +
                ", ngày sản xuất: " + super.getManufacturingDateOfVehicle() +
                ", chủ sở hữu: " + super.getVehicleOwner() +
                ", công suất: " + enginePowerofMotobike + "}";
    }
}
