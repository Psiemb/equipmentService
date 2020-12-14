package pl.firmaBudo.equipBase.dao.entity;

import java.util.Objects;

public class Excavator {

    private Long id;
    private String type;
    private double purchasePrice;
    private int productionDate;

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
                Objects.equals(type, excavator.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, purchasePrice, productionDate);
    }

    @Override
    public String toString() {
        return "Excavator{" +
                "id=" + id +
                ", excavatorType='" + type + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", productionDate=" + productionDate +
                '}';
    }
}
