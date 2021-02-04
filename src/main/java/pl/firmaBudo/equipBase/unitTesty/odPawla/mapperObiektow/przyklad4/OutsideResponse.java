package pl.firmaBudo.equipBase.unitTesty.odPawla.mapperObiektow.przyklad4;

public class OutsideResponse {
    private int totalNumberOfWorkedDays;
    private boolean isCarpenter;

    public int getTotalNumberOfWorkedDays() {
        return totalNumberOfWorkedDays;
    }

    public void setTotalNumberOfWorkedDays(int totalNumberOfWorkedDays) {
        this.totalNumberOfWorkedDays = totalNumberOfWorkedDays;
    }

    public boolean isCarpenter() {
        return isCarpenter;
    }

    public void setCarpenter(boolean carpenter) {
        this.isCarpenter = carpenter;
    }
}
