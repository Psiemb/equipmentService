package pl.firmaBudo.equipBase.api.endpoint.calculation.response;

import java.util.Objects;

public class CalculationResponse {

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
        if (!(o instanceof CalculationResponse)) return false;
        CalculationResponse that = (CalculationResponse) o;
        return Double.compare(that.fullCost, fullCost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullCost);
    }

    @Override
    public String toString() {
        return "CalaculationResponse{" +
                "fullCost=" + fullCost +
                '}';
    }
}
