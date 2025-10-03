package resort_Furama.entity.facility;

public class Villa extends Facility{
    private String typeOfVilla;
    private float swimmingPoorAreaOfVilla;
    private int floorsOfVilla;

    public Villa() {
    }

    public Villa(String idFacility, String nameFacility, String areaFacility, int priceFacility, int maxPersonLiveInFacility, String subscriptionPlanFacility, String typeOfVilla, float swimmingPoorAreaOfVilla, int floorsOfVilla) {
        super(idFacility, nameFacility, areaFacility, priceFacility, maxPersonLiveInFacility, subscriptionPlanFacility);
        this.typeOfVilla = typeOfVilla;
        this.swimmingPoorAreaOfVilla = swimmingPoorAreaOfVilla;
        this.floorsOfVilla = floorsOfVilla;
    }

    public String getTypeOfVilla() {
        return typeOfVilla;
    }

    public void setTypeOfVilla(String typeOfVilla) {
        this.typeOfVilla = typeOfVilla;
    }

    public float getSwimmingPoorAreaOfVilla() {
        return swimmingPoorAreaOfVilla;
    }

    public void setSwimmingPoorAreaOfVilla(float swimmingPoorAreaOfVilla) {
        this.swimmingPoorAreaOfVilla = swimmingPoorAreaOfVilla;
    }

    public int getFloorsOfVilla() {
        return floorsOfVilla;
    }

    public void setFloorsOfVilla(int floorsOfVilla) {
        this.floorsOfVilla = floorsOfVilla;
    }

    @Override
    public String toString() {
        return "Villa{"+super.toString()+typeOfVilla+", "+swimmingPoorAreaOfVilla+", "+floorsOfVilla+"}";
    }

    @Override
    public String getInforToCSV() {
        return super.getInforToCSV()+","+typeOfVilla+","+swimmingPoorAreaOfVilla+","+floorsOfVilla;
    }
}
