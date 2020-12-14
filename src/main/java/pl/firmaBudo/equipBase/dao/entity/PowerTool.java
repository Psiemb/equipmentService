package pl.firmaBudo.equipBase.dao.entity;

import java.util.Objects;

public class PowerTool {

    private Long id;
    private String type;
    private String companyName;
    private double priceOfBuying;
    private int productionYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPriceOfBuying() {
        return priceOfBuying;
    }

    public void setPriceOfBuying(double priceOfBuying) {
        this.priceOfBuying = priceOfBuying;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PowerTool)) return false;
        PowerTool powerTool = (PowerTool) o;
        return Double.compare(powerTool.priceOfBuying, priceOfBuying) == 0 &&
                productionYear == powerTool.productionYear &&
                Objects.equals(id, powerTool.id) &&
                Objects.equals(type, powerTool.type) &&
                Objects.equals(companyName, powerTool.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, companyName, priceOfBuying, productionYear);
    }

    @Override
    public String toString() {
        return "PowerTool{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", companyName='" + companyName + '\'' +
                ", priceOfBuying=" + priceOfBuying +
                ", productionYear=" + productionYear +
                '}';
    }
}
