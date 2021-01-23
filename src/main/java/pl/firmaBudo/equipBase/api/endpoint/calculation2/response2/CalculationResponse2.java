package pl.firmaBudo.equipBase.api.endpoint.calculation2.response2;

import java.util.Objects;

public class CalculationResponse2 {

    private double fullCost;

    public double getFullCost() {
        return fullCost;
    }

    public void setFullCost(double fullCost) {
        this.fullCost = fullCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculationResponse2)) return false;
        CalculationResponse2 that = (CalculationResponse2) o;
        return Double.compare(that.fullCost, fullCost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullCost);
    }

    @Override
    public String toString() {
        return "CalculationResponse2{" +
                "fullCost=" + fullCost +
                '}';
    }
}
