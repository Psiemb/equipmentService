package pl.firmaBudo.equipBase.api.endpoint.availability.request;

import java.util.Objects;

public class CheckContainerByCostRequest {

    private double dailyCost;

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckContainerByCostRequest)) return false;
        CheckContainerByCostRequest that = (CheckContainerByCostRequest) o;
        return Double.compare(that.dailyCost, dailyCost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dailyCost);
    }

    @Override
    public String toString() {
        return "CheckContainerByCostRequest{" +
                "dailyCost=" + dailyCost +
                '}';
    }
}
