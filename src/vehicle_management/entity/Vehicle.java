package vehicle_management.entity;

import java.util.Date;

public abstract class Vehicle {
    private String vehiclePlate;
    private String manufacturerOfVehicle;
    private short manufacturingDateOfVehicle;
    private String vehicleOwner;

    public Vehicle() {
    }

    public Vehicle(String vehiclePlate, String manufacturerOfVehicle, short manufacturingDateOfVehicle, String vehicleOwner) {
        this.vehiclePlate = vehiclePlate;
        this.manufacturerOfVehicle = manufacturerOfVehicle;
        this.manufacturingDateOfVehicle = manufacturingDateOfVehicle;
        this.vehicleOwner = vehicleOwner;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getManufacturerOfVehicle() {
        return manufacturerOfVehicle;
    }

    public void setManufacturerOfVehicle(String manufacturerOfVehicle) {
        this.manufacturerOfVehicle = manufacturerOfVehicle;
    }

    public short getManufacturingDateOfVehicle() {
        return manufacturingDateOfVehicle;
    }

    public void setManufacturingDateOfVehicle(short manufacturingDateOfVehicle) {
        this.manufacturingDateOfVehicle = manufacturingDateOfVehicle;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }
}
