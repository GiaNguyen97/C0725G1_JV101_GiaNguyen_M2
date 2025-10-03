package resort_Furama.entity.facility;

public class House extends Facility {
    private String typeOfHouse;
    private int floorsOfHouse;

    public House() {
    }

    public House(String idFacility, String nameFacility, String areaFacility, int priceFacility, int maxPersonLiveInFacility, String subscriptionPlanFacility, String typeOfHouse, int floorsOfHouse) {
        super(idFacility, nameFacility, areaFacility, priceFacility, maxPersonLiveInFacility, subscriptionPlanFacility);
        this.typeOfHouse = typeOfHouse;
        this.floorsOfHouse = floorsOfHouse;
    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    public int getFloorsOfHouse() {
        return floorsOfHouse;
    }

    public void setFloorsOfHouse(int floorsOfHouse) {
        this.floorsOfHouse = floorsOfHouse;
    }

    @Override
    public String toString() {
        return "House{"+super.toString()+typeOfHouse+", "+ floorsOfHouse+"}";
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV()+","+typeOfHouse+","+floorsOfHouse;
    }
}
