package pl.firmaBudo.equipBase.dao.entity;


import java.util.Objects;

public class Container {

    private long id;
    private int maxQuantityOfWorkersPerContainer;
    private ContainerType type;
    private double purchasePrice;
    private int productionYear;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaxQuantityOfWorkersPerContainer() {
        return maxQuantityOfWorkersPerContainer;
    }

    public void setMaxQuantityOfWorkersPerContainer(int maxQuantityOfWorkersPerContainer) {
        this.maxQuantityOfWorkersPerContainer = maxQuantityOfWorkersPerContainer;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
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
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return id == container.id &&
                maxQuantityOfWorkersPerContainer == container.maxQuantityOfWorkersPerContainer &&
                Double.compare(container.purchasePrice, purchasePrice) == 0 &&
                productionYear == container.productionYear &&
                type == container.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maxQuantityOfWorkersPerContainer, type, purchasePrice, productionYear);
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", maxQuantityOfWorkerPerContainer=" + maxQuantityOfWorkersPerContainer +
                ", type=" + type +
                ", purchasePrice=" + purchasePrice +
                ", productionYear=" + productionYear +
                '}';
    }
}
