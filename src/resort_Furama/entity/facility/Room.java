package resort_Furama.entity.facility;

public class Room extends Facility{
    private String freeServiceOfRoom;

    public Room() {
    }

    public Room(String idFacility, String nameFacility, String areaFacility, int priceFacility, int maxPersonLiveInFacility, String subscriptionPlanFacility, String freeServiceOfRoom) {
        super(idFacility, nameFacility, areaFacility, priceFacility, maxPersonLiveInFacility, subscriptionPlanFacility);
        this.freeServiceOfRoom = freeServiceOfRoom;
    }

    public String getFreeServiceOfRoom() {
        return freeServiceOfRoom;
    }

    public void setFreeServiceOfRoom(String freeServiceOfRoom) {
        this.freeServiceOfRoom = freeServiceOfRoom;
    }

    @Override
    public String toString() {
        return "Room{"+super.toString()+freeServiceOfRoom+"}";
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV()+","+freeServiceOfRoom;
    }
}
