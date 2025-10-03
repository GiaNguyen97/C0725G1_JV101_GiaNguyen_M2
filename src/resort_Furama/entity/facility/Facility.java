package resort_Furama.entity.facility;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private String areaFacility;
    private int priceFacility;
    private int maxPersonLiveInFacility;
    private String subscriptionPlanFacility;

    public Facility() {
    }

    public Facility(String idFacility, String nameFacility, String areaFacility, int priceFacility, int maxPersonLiveInFacility, String subscriptionPlanFacility) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.areaFacility = areaFacility;
        this.priceFacility = priceFacility;
        this.maxPersonLiveInFacility = maxPersonLiveInFacility;
        this.subscriptionPlanFacility = subscriptionPlanFacility;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public String getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(String areaFacility) {
        this.areaFacility = areaFacility;
    }

    public int getPriceFacility() {
        return priceFacility;
    }

    public void setPriceFacility(int priceFacility) {
        this.priceFacility = priceFacility;
    }

    public int getMaxPersonLiveInFacility() {
        return maxPersonLiveInFacility;
    }

    public void setMaxPersonLiveInFacility(int maxPersonLiveInFacility) {
        this.maxPersonLiveInFacility = maxPersonLiveInFacility;
    }

    public String getSubscriptionPlanFacility() {
        return subscriptionPlanFacility;
    }

    public void setSubscriptionPlanFacility(String subscriptionPlanFacility) {
        this.subscriptionPlanFacility = subscriptionPlanFacility;
    }

    @Override
    public String toString() {
        return  "idFacility=" + idFacility +
                ", nameFacility=" + nameFacility +
                ", areaFacility=" + areaFacility +
                ", priceFacility=" + priceFacility +
                ", maxPersonLiveInFacility=" + maxPersonLiveInFacility +
                ", subscriptionPlanFacility=" + subscriptionPlanFacility + ", ";
    }

    public String getInforToCSV() {
        return idFacility+","+nameFacility+","+areaFacility+","+priceFacility+","+maxPersonLiveInFacility+","+subscriptionPlanFacility;
    }
}
