package pl.firmaBudo.equipBase.api.endpoint.calculation.request;

import pl.firmaBudo.equipBase.dao.entity.container.ContainerType;

import java.util.Objects;

public class CalculationRequest {


//    private int workerCapacity;
//    private double dailyCost;
//    private int days;

    private long id;
    private int days;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculationRequest)) return false;
        CalculationRequest that = (CalculationRequest) o;
        return id == that.id &&
                days == that.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, days);
    }

    @Override
    public String toString() {
        return "CalculationRequest{" +
                "id=" + id +
                ", days=" + days +
                '}';
    }
}
