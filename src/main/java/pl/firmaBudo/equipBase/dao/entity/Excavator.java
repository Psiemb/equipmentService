package pl.firmaBudo.equipBase.dao.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Excavator {

    private Long id;
    private String excavatorType;
    private double purchasePrice;
    private int productionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExcavatorType() {
        return excavatorType;
    }

    public void setExcavatorType(String excavatorType) {
        this.excavatorType = excavatorType;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Excavator)) return false;
        Excavator excavator = (Excavator) o;
        return Double.compare(excavator.purchasePrice, purchasePrice) == 0 &&
                productionDate == excavator.productionDate &&
                Objects.equals(id, excavator.id) &&
                Objects.equals(excavatorType, excavator.excavatorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, excavatorType, purchasePrice, productionDate);
    }

    @Override
    public String toString() {
        return "Excavator{" +
                "id=" + id +
                ", excavatorType='" + excavatorType + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", productionDate=" + productionDate +
                '}';
    }
}
